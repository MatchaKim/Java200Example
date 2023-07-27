package p28to80;

public class p35 {
    public static void main(String[] args) {
        int temp= 99;
        temp=(temp%2 ==1)?temp*3 +1 :temp/2;
        System.out.printf("계산후 = %d",temp);
        //삼항 연산자 중요
    }

}
