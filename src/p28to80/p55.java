package p28to80;

public class p55 {
    public static void print(int...mm){
        for(int m : mm){
            System.out.println(m);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]mm={1,6,16,22,25,65};
        print(mm);
        int a=2;
        int b=3;
        int c=15;
        print(a);
        print(a,b);
    }//가변인자-임의의 개수로 사용할 수 있는 아규먼트를 이용해 배열을 출력함
}
