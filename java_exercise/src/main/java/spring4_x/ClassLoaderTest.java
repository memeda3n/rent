package spring4_x;

public class ClassLoaderTest {

    public static void main(String[] args) {

        ClassLoader classLoader=Thread.currentThread().getContextClassLoader();

        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
