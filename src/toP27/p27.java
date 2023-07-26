package toP27;

public class p27 {
    public static final int PHY =23;
    public static void main(String[] args) {
        int index = PHY;
        int days = 1200;
        double vals= (days%index) *2 *Math.PI/index;
        System.out.println(Math.toDegrees(vals));

        //정수 % 정수 -> 나머지
    }
}
