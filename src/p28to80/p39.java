package p28to80;

public class p39 {
    public static int toNum(char c){
        int tot=0;
        switch (c){
            case 'A':tot = 1; break;
            case 'T':tot = 10; break;
            case 'J':tot = 11; break;
            case 'Q':tot = 12; break;
        }
        return tot;
    }

    public static void main(String[] args) {
        char c ='J';
        int result = toNum(c);
        System.out.printf("%1$c는 %2$d 입니다",c,result);
    }
}
