package toP27;

public class p23 {
    public static void main(String[] args) {
        char a= '닳';
        String letter ="동해물과 백두산이 마르고 닳도록";
        int letterNumver = letter.length();
        int loc = letter.indexOf(a);
        System.out.printf(" \"%s\"=> %d 자이며 , '%c'은 %d 번째 있다 .",
        letter,letterNumver,a,loc);



//       2가지 포인트
//        String 에서의 indexOf -> int 로 반환
//        String 에서의 length
//        ""를 사용하기 위해서  \"%s\" 다음과 같이 작성
//        char은 '' 으로 감싼다 역따-역따  => ""를 사용하기 위해서  \"%s\" 다음과 같이 작성
    }
}
