package p28to80;



public class p78 {
    public static void main(String[] args) {
        String[] myNum = new String[]{"2016-08-17","2016-08-13","2016-08-12"};
        String[] myNum2 = {"2016-08-17","2016-08-13","2016-08-12"};

        System.out.println(myNum2[0]);
        print(myNum);
        String[] tos = new String[myNum.length];
        System.arraycopy(myNum,0,tos,0,myNum.length);
        print(tos);
    }

    public static void print(String [] tos){
        for(String ss: tos){
            System.out.println(ss);
        }
        System.out.println();
    }

}
