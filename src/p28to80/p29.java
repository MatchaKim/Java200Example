package p28to80;

public class p29 {
    public static final int PHYSICAL=23;

    public static double getrhythm(long days,int index,
                                   int max) {
        return max * Math.sin((days%index)*2*Math.PI/index);
    }

    public static void main(String[] args) {
        int days = 1200;
        double phyval = getrhythm(days,PHYSICAL,100);
        System.out.printf("나의 신체지수는 %1$.2f입니다",phyval);
    }

}
