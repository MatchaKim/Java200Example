package p28to80;

public class p49 {

    public static boolean isPrime(int n) {
        boolean isS = true;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                isS = false;
                break;
            }
        }
        return isS;
    }

    public static void main(String[] args) {
        int number = 1234567;
        boolean ifPrime = isPrime(number);
        if (ifPrime) {
            System.out.println(number + "은 소수이다");
        } else {
            System.out.println(number + "은 소수가 아니다");
        }
    }

}
