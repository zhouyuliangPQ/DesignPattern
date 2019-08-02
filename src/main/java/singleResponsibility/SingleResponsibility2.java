package singleResponsibility;

/**
 * @author zhouyuliang
 * @descrip 单一职责
 * @date 2019-08-01 19:10
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle vehicle = new RoadVehicle();
        vehicle.run("汽车");
        vehicle.run("摩托");
        FlyVehicle flyVehicle = new FlyVehicle();
        flyVehicle.run("飞机"); //做了拆分，但是改动大，还需要改动客户端（此处用main方法表示）
                                      //放在一个类中，不同的交通规矩调用不同的方法。runAir() runRoad().在类层面不符合单一原则。在方法层面符合单一原则

    }
}

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在路上跑");
    }
}

class FlyVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在天上跑");
    }
}