package reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectTest {


    public static void main(String[] args) throws Exception {

        Class studentClass = Student.class;
        Method method = studentClass.getDeclaredMethod("getName");
        System.out.println(method.getName());
        //创建对象
        Constructor constructor = studentClass.getConstructor();
        Student student = (Student) constructor.newInstance();
        System.out.println(student.getName());
        //invoke方法需要传进来一个实例
        System.out.println(method.invoke(student));

        Annotation[] annotation = constructor.getAnnotations();
        System.out.println(annotation.length);
    }


}
