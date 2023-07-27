package p28to80;

public class p38 {

    public enum PEI {
        Phy(23), Emo(28), Intellect(33);
        private final int peiValue;

        PEI(int pie) {
            this.peiValue = pie;
        }

        public int getPei() {
            return peiValue;
        }
    }

    enum Fruit {
        APPLE, BANANA, MANGO
    }
public static String textInfor(PEI index, double value ){
        String result ="";
        switch (index){
            case Phy : result="신체지수"; break;
            case Emo:result ="감정지수"; break;
            case Intellect:result = "지성지수"; break;
            default:result ="미결정"; break;
        }
        return result + (value*100);
}

    public static void main(String[] args) {
        PEI index=PEI.Phy;
        double value =0.86;
        System.out.println("신체지수 주기값"+index.getPei());
        String st = textInfor(index, value);
        System.out.println(st);
        System.out.println(index.ordinal());
        System.out.println(index.name());
        System.out.println(index);
        System.out.println(index.getPei());
    }
}