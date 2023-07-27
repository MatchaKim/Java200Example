package p28to80;

public class p44 {

    public static void showOddnEven(int n){
        int temp = n;
        do{
            if(temp%2 ==1){
                temp = temp*3 +1;
            }else{
                temp/=2;
            }
            System.out.println(temp);
        }while (temp!=1);
        System.out.println("\n");
    }

    public static void main(String[] args) {
showOddnEven(122);
    }
}

//do while ->적어도 한번은 실행 while-> 조건이 명확할때 실행