package p28to80;

public class p53 {


    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 100; i++) {
            s += i;
        }
        System.out.println("1부터 100까지의 합"+s);

        s=0;
        for(int i=1; i<=100; i++){
            if (i%2==1){
                s+=i;
            }

        }
        System.out.println("1부터 100까지 홀수의 합"+s);
    }

}
