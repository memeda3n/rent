package reflect;

public class Student {

    private String name;

    public String addr;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return "名称是"+name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
