package p28to80;

public class p34 {
    public static void main(String[] args) {
        int temp=99;
        if(temp%2==1 ){
            temp= temp*3+1;
        }else{
            temp=temp/2;
        }

        System.out.printf("계산값 %1$d",temp);

//        계산값 % 1$ d
//        1 번째 로 암기할것! 이렇게 넣어야 한다!
    }
}
