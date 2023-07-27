package p28to80;

public class p40 {
    public static double toMoney(String c){
        double tot= 0.0;
        switch (c){
            case "USD":tot = 111; break;
            case "JPY":tot = 113; break;
            case "CNY":tot = 114; break;
            default: tot =1 ; break;

        }
        return tot;
    }

    public static void main(String[] args) {
        String money= "USD";
        double result = toMoney(money);
        System.out.println(money +"는" +result+"입니다");
    }
}
