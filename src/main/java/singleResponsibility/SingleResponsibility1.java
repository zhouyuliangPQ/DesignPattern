package singleResponsibility;

/**
 * @author zhouyuliang
 * @descrip 单一职责 改进在2中
 * @date 2019-08-01 19:10
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("摩托");
        vehicle.run("飞机"); //飞机不能在路上跑，所以在交通工具类 违反了单一职责原则。又管地上跑的，又管天上的。职责不够细化

    }
}

class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在路上跑");
    }
}