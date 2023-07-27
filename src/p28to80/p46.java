package p28to80;

public class p46 {
    public static void main(String[] args) {
        int range = 10;
        int start = 1;
        int a = 0, b = 0, c = 0;
        while (true) {
            a = (int) (range * Math.random() + start);
            b = (int) (range * Math.random() + start);
            c = (int) (range * Math.random() + start);
            if (a != b && b != c && c != a) break;
        }
        System.out.println(a + "\t " + b + "\t " + c);
    }
}
