package p28to80;

public class p28 {
    public static final int PHY = 23;

    public static void main(String[] args) {
        int index = PHY;
        int days =1200;
        double phyval = 100* Math.sin((days%index)*2*Math.PI/index);
        System.out.printf("나의 신체지수는 %1$.2f 입니다",phyval);
        System.out.printf("나의 신체지수는 " + (float)phyval +"입니다");
    }
}
