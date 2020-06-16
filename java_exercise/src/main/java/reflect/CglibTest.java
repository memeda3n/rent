package reflect;


import org.springframework.aop.framework.AopContext;

/**
 * 在 web模块下cglibs包内
 */
public class CglibTest {

    public static void main(String[] args) {

        AopContext.currentProxy();



    }


    public static class Students {


        public void say() {
            System.out.println("我是一个学生");
        }


    }


}
