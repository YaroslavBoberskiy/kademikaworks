/**
 * Created by YB on 27.10.2015.
 */
public class Demo {

    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        BT7 bt7 = new BT7();
        T34 t34 = new T34();
        Tank t = new Tank();

        tiger.setMaxSpeed(45);
        tiger.setColor(Color.GREY);
        tiger.setCrew(5);

        bt7.setMaxSpeed(65);
        bt7.setColor(Color.GREEN);
        bt7.setCrew(3);

        t34.setMaxSpeed(75);
        t34.setColor(Color.BROWN);
        t34.setCrew(4);

        tiger.move(tiger);
        bt7.direction(bt7);

        t.printTankInfo(tiger);
        t.printTankInfo(bt7);
        t.printTankInfo(t34);

    }

}
