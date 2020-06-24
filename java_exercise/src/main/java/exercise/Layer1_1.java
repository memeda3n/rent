package exercise;

import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Layer1_1 {

    public Layer2_1 layer2;

}
class Layer2_1 {

    public List<Layer3_1> layer3;
}


class Layer3_1 {
    public List<List<Layer4_1>> layer4;
}

class Layer4_1 {
    public Integer val;
}

class Test_1 {


    public Object getPath(Object o, String path) throws Exception {
        if (StringUtils.isEmpty(path)) {
            return null;
        }
        String[] array = path.split("\\.");
        int n = 1;
        Object o1 = this.handle(o, array, n);
        return o1;
    }

    /**
     * 处理方法调用
     * @param object
     * @param pathArray
     * @param n
     * @return
     * @throws Exception
     */
    public Object handle(Object object, String[] pathArray, int n) throws Exception {
        String str = pathArray[n];
        Object obj = object;
        int left = str.indexOf("[");
        if (left > 0) {//处理数组
            //获取属性名称
            String fieldName = str.substring(0, left);
            //获取数组下标
            List<Integer> indexList = this.getIndex(str);
            Field field = obj.getClass().getDeclaredField(fieldName);
            obj = field.get(obj);
            for (Integer integer : indexList) {
                if (obj instanceof List) {
                    obj = ((List) obj).get(integer);
                }
            }
            if (n < pathArray.length - 1) {
                obj = this.handle(obj, pathArray, ++n);
            }
        } else {//处理对象
            Field field = obj.getClass().getDeclaredField(str);
            obj = field.get(obj);
            if (n < pathArray.length - 1) {
                obj = this.handle(obj, pathArray, ++n);
            }
        }
        return obj;
    }

    /**
     * 获取数组下标
     * @param s
     * @return
     * @throws Exception
     */
    private List getIndex(String s) throws Exception {
        String regex = "\\[(.*?)]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(s);
        List<Integer> list = new ArrayList<>();
        while (m.find()) {
            try {
                list.add(Integer.valueOf(m.group(1)));
            } catch (Exception e) {
                throw new Exception("数组格式不正确");
            }
        }
        return list;
    }


    public static void main(String[] args) throws Exception {
        Layer1_1 layer1 = new Layer1_1();
        Layer2_1 layer2 = new Layer2_1();
        Layer3_1 layer3 = new Layer3_1();
        Layer4_1 layer4 = new Layer4_1();
        Layer4_1 layer4_1 = new Layer4_1();

        layer1.layer2 = layer2;
        List<Layer3_1> layer3s = new ArrayList<>();
        layer3s.add(layer3);
        List<Layer4_1> layer4s = new ArrayList<>();
        layer4s.add(layer4);
        layer4s.add(layer4_1);
        layer4_1.val = 1;
        layer3.layer4 = Arrays.asList(layer4s);
        layer2.layer3 = layer3s;
        layer4.val = 1000;
        Test_1 test = new Test_1();

        System.out.println(test.getPath(layer1, " layer1.layer2.layer3[0].layer4[0][1].val"));


    }
}