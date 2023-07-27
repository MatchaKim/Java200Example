package p28to80;

public class p48 {
    public static int sumEach(int n){
        int tot=0;
        while(n!= 0){
            tot+=n%10;
            n/=10;
        }
        return tot;
    }

// 이코드 중요 + 많이 쓰일듯
//    public static int sumEach(int n){
//        int tot=0;
//        while(n!= 0){
//            tot+=n%10;
//            n/=10;
//        }
//        return tot;
//    }

    public static void main(String[] args) {
        int number = 123456;
        int value = sumEach(number);
        System.out.println(number + "에 대한 각 자리의 숫자 합" + value);
    }
}
