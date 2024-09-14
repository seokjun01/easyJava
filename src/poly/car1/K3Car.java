package poly.car1;

public class K3Car  implements Car {
    @Override
    public void startEngine() {
        System.out.println("k3 엔진 on");
    }
    @Override
    public void offEngine() {
        System.out.println("k3 엔진 off");
    }
    @Override
    public void pressAccelerator() {
        System.out.println("k3 악셀on");
    }
}
