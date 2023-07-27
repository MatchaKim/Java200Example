package p28to80;

public class p36 {

    //switch 에서 case 에 대한 break가 없다면 다음 case의 break를 만날때까지 다음 case문이 실행된다
    public static String textInfor(int index,double value) {
        String result ="";
        switch (index){
            case 24 : result="신체지수:";break;
            case 28 : result="감정지수:";break;
            case 33 : result="지성지수:";break;

        }
        return result + (value*100);

    }

    public static void main(String[] args) {
        int index= 24;
        double value= 0.84;
        String st= textInfor(index,value);
        System.out.println(st);
    }
}


//한파일에 2개의 클래스 vs 한 클래스에 2개의 클래스