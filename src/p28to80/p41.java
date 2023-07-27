package p28to80;

public class p41 {
    public boolean isLeapYear(int year){
        boolean isS = false;
        if((year%4 == 0) && (year%100 != 0) || (year%400 == 0)){
            isS = true;
        }
        return isS;
    }

    public static void main(String[] args) {
        p41 hc = new p41(); // 내 클래스를 가져옴 왜? -> 호출이 되어야 메모리상에 쌓으니까
        System.out.println(hc.isLeapYear(2017));
    }
}
