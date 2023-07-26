package toP27;

public class p22 {



    public static void main(String[] args) {
        double S= 6;
        double P=0.75;
        double T=0;
        double A=1;
        double Y= 2;
        double downs= (T+1)*(A+2)*(Y+10);
        //System.out.println("높이는 %1$.2f 입니다",downs);
        System.out.printf("높이는 %1$.3f 입니다",downs);
        System.out.println( "높이는" + downs + "입니다");

        //%1$는 첫번째 변수 high를 1$ 위치에 대입하라는 의미이다.
        // %f는 실수 %.2f는 소숫점 둘째자리 까지 이다

//        System.out.println과 System.out.printf는 모두 콘솔에 출력하는 메서드이지만, 사용 방법과 기능에 차이가 있습니다.
//
//        System.out.println:
//
//        이 메서드는 주어진 문자열을 그대로 출력한 후 줄바꿈(new line)을 수행합니다. 문자열 포맷팅이나 서식 지정 기능을 지원하지 않습니다. 예를 들어, 소수점 둘째 자리까지 표시하려면 별도의 문자열 포맷팅이 필요합니다.
//
//                java
//        Copy code
//        System.out.println("Hello, World!");
//        System.out.printf:
//
//        이 메서드는 서식 지정 문자열(format specifier)과 해당 서식에 맞는 값을 인자로 받아, 서식에 맞게 문자열을 출력합니다. 줄바꿈을 자동으로 수행하지 않으므로, 줄바꿈이 필요한 경우 \n을 사용해야 합니다.
//
//                java
//        Copy code
//        System.out.printf("Hello, %s! You have %d new messages.\n", "Alice", 5);
//        위 예제는 "Hello, Alice! You have 5 new messages."를 출력하며, %s는 문자열을, %d는 정수를 나타냅니다. 이처럼 printf를 사용하면 각종 서식에 따라 문자열을 출력할 수 있습니다.
//
//        결론적으로, println과 printf의 주요 차이점은 printf가 서식 지정 기능을 지원하며 줄바꿈을 자동으로 수행하지 않는다는 점입니다.
//
    }
}
