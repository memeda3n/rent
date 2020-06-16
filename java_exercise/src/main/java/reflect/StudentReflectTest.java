package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
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

        //parameter
        Class studentClass = Student.class;
        Field[] fields = studentClass.getDeclaredFields();
        for (Field variable : fields) {
            variable.setAccessible(true);
            variable.set(stu2, variable.getName());
            System.out.println("===fields=======" + variable.getName() + ":" + variable.get(stu2));
            variable.setAccessible(false);//这里不设置false的话，在后边的程序就一直可以随意访问，不安全
        }
        for (Field variable : fields) {
            variable.set(stu2, variable.getName());
            System.out.println("===fields=======" + variable.getName() + ":" + variable.get(stu2));
        }

        //实例化对象
        Class aClass = Class.forName("reflect.Student");
        Student student1 = (Student) aClass.newInstance();

        Student aClass1 = Student.class.newInstance();

        Constructor constructor1 = aClass.getConstructor();
        constructor1.newInstance();

    }

}
