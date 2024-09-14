package poly.car1;

public class Model3Car  implements Car {
   @Override
    public void startEngine() {
        System.out.println("Model3 엔진 on");
    }
    @Override
    public void offEngine() {
        System.out.println("Model3 엔진 off");
    }
    @Override
    public void pressAccelerator() {
        System.out.println("Model3 악셀on");
    }
}
