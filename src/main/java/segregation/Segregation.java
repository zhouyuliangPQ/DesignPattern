package segregation;

/**
 * @author zhouyuliang
 * @descrip 接口隔离原则
 * @date 2019-08-02 10:45
 */
public class Segregation  {
    public static void main(String[] args) {
       A a = new A();
       B b = new B();
       b.opration1(a);
    }
}
//我们定义一个接口 包含5个方法
interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class A implements Interface1{

    public void operation1() {
        System.out.println("A1");
    }

    public void operation2() {
        System.out.println("A2");
    }

    public void operation3() {
        System.out.println("A3");
    }

    public void operation4() {
        System.out.println("A4");
    }

    public void operation5() {
        System.out.println("A5");
    }
}

//类B通过传入类A调用接口的12方法。但是导致A必须实现12345方法。
class B{
    void opration1(Interface1 interface1){
        interface1.operation1();
    }
    void opration2(Interface1 interface1){
        interface1.operation1();
    }
}
