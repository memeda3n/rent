package exercise;

import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Layer1 {

    public Layer2 layer2;

}

class Layer2 {

    public List<Layer3> layer3;
}


class Layer3 {
    public List<Layer4> layer4;
}

class Layer4 {
    public Integer val;
}

class ObjectAccessException extends Exception {

}

class Test {


    public Object getPath(Object o, String path) throws Exception {
        if (StringUtils.isEmpty(path)) {
            return null;
        }
        String[] array = path.split("\\.");
        int n = 1;
        Object o1 = this.handle(o, array, n);
        return o1;
    }

    public Object handle(Object object, String[] pathArray, int n) throws Exception {

        String str = pathArray[n];
        Object obj;
        if (object instanceof List) {
            //获取数组下标
            str = pathArray[--n];
            int left = str.indexOf("[");
            if (left < 0) {
                throw new Exception();
            }
            String indexStr = str.substring(left + 1);
            int right = indexStr.indexOf("]");
            if (right < 0) {
                throw new Exception();
            }
            indexStr = indexStr.substring(0, right);
            int num;
            try {
                num = Integer.valueOf(indexStr);
            } catch (NumberFormatException e) {
                throw new NumberFormatException();
            }
            obj = ((List) object).get(num);
        } else {

            int left = str.indexOf("[");
            if (left > 0) {
                str = str.substring(0, left);
            }
            Field field = object.getClass().getDeclaredField(str);
            if (field == null) {
                throw new Exception();
            }
            obj = field.get(object);
        }
        if (n < pathArray.length - 1) {
            obj = this.handle(obj, pathArray, ++n);
        }

        return obj;
    }

    private Object handleArray() {


        return null;
    }

    private List getIndex(String s) {
//        String s = "layer3[0][1][2][3][4]";
        String regex = "\\[(.*?)]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(s);
        List<Integer> list = new ArrayList<>();
        while (m.find()) {
            System.out.println(m.group(1));
        }
        return list;
    }


    public static void main(String[] args) throws Exception {
//        Layer1 layer1 = new Layer1();
//        Layer2 layer2 = new Layer2();
//        Layer3 layer3 = new Layer3();
//        Layer4 layer4 = new Layer4();
//        Layer4 layer4_1 = new Layer4();
//        layer1.layer2 = layer2;
//        List<Layer3> layer3s = new ArrayList<>();
//        layer3s.add(layer3);
//        List<Layer4> layer4s = new ArrayList<>();
//        layer4s.add(layer4);
//        layer4s.add(layer4_1);
//        layer4_1.val = 1;
//        layer3.layer4 = layer4s;
//        layer2.layer3 = layer3s;
//        layer4.val = 1000;
//        Test test = new Test();
//
//        System.out.println(test.getPath(layer1, " layer1.layer2.layer3[0].layer4[1].val"));


        String s = "layer3[0][1][2][3][4]";

        String regex = "\\[(.*?)]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(s);

        for (int i = 0; m.find(); i++) {
            System.out.println(m.group(1));
        }


    }
}