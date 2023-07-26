package p28to80;

public class p30 {
    public static final int PHY=23;
    public double getrhythm(long days, int index, int max){
        return max*Math.sin((days%index)*2*Math.PI/index);
    }

    public static void main(String[] args) {
        int days=1200;
        p30 p30s = new p30();//객체생성
        double phyval = p30s.getrhythm(days,PHY,100);
        System.out.println("나의 신체치수는" + phyval + "입니다.");
    }

}
