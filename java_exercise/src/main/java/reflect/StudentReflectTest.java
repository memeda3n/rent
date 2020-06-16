package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StudentReflectTest {


    public static void main(String[] args) throws Exception {

        //constructor
        Class student = Class.forName("reflect.Student");
        Constructor constructor = student.getConstructor(String.class);//获取对应的构造器
        Student stu = (Student) constructor.newInstance("小红");
        System.out.println(stu.getName());
        //使用method调用方法
        Method method = student.getMethod("getName", null);
        System.out.println(method.invoke(stu, null));
        //Class
        Student stu2 = (Student) student.newInstance();
        stu2.setName("小明");
        System.out.println(stu2.getName());
        //
        Method method1 = Student.class.getMethod("getName", null);
        System.out.println(method1.invoke(stu2, null));


        //实例化对象
        Class aClass = Class.forName("reflect.Student");
        Student student1 = (Student) aClass.newInstance();

        Student aClass1 =  Student.class.newInstance();

        Constructor constructor1 = aClass.getConstructor();
        constructor1.newInstance();

    }

}
