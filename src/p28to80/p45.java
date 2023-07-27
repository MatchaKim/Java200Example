package p28to80;

public class p45 {
    public static void showOddenEnven(int n) {
        int temp = n;
        for (; temp != 1; ) {
            if (temp % 2 == 1) {
                temp = temp * 3 + 1;
            } else {
                temp /= 2;
            }
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        showOddenEnven(122);
    }
}
