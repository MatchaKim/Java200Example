package p28to80;

public class p51 {
public static int BITMASK=1;

//비트연산자

    public static String shifts(int a) {
        int BITMASK =1 ;
        String s="";
        for (int i = 0; i <=31; i++){
            s= (a&BITMASK)+s;
            a>>=1;
        }
        return s;
    }

    public static void main(String[] args) {
        int intNums1=123;
        int intNums2=-123;
        System.out.println(shifts(intNums2));
    }
}
