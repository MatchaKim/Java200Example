package p28to80;

public class p62 {

    public static void main(String[] args) {
        String sNum="123";
        String nNum= "h";
        try{
            int a= Integer.parseInt(sNum);
            System.out.println(a);
        }catch(NumberFormatException ee){
            System.out.println("int인지 확인좀 해봐봐");
            System.err.println(ee.getMessage());
        }catch(Exception ee){
            System.out.println("야 잘좀 넣어!!");
        }finally{
            System.out.println("수행되어야만해!!");
        }
    }
//    Throwable: 모든 예외 및 오류의 최상위 클래스입니다.
//
//    Exception: 애플리케이션이 처리할 수 있는 예외에 대한 기본 클래스입니다.
//
//    IOException: 입출력 작업에서 발생할 수 있는 예외에 대한 기본 클래스입니다.
//            FileNotFoundException: 파일을 찾을 수 없을 때 발생하는 예외입니다.
//            SQLException: 데이터베이스 접근 오류나 다른 JDBC 관련 오류에 대한 기본 클래스입니다.
//    DataAccessException: Spring 프레임워크에서 제공하는 데이터 액세스 관련 예외에 대한 기본 클래스입니다.
//    ClassNotFoundException: 클래스가 로드되지 않았을 때 발생하는 예외입니다.
//    NoSuchMethodException: 메서드가 없을 때 발생하는 예외입니다.
//            RuntimeException: 실행 시에 발생할 수 있는 예외에 대한 기본 클래스입니다.
//            NullPointerException: 객체 참조가 null인 상태에서 사용되려고 할 때 발생하는 예외입니다.
//            ArrayIndexOutOfBoundsException: 배열 인덱스가 범위를 벗어났을 때 발생하는 예외입니다.
//            NumberFormatException: 문자열이 적절한 형식을 갖추지 않았을 때 발생하는 예외입니다.
//    IllegalArgumentException: 잘못된 인수를 메소드에 전달할 때 발생하는 예외입니다.
//            IllegalStateException: 애플리케이션이 부적절한 시점에 메소드를 호출하려고 할 때 발생하는 예외입니다.
//            Error: 시스템 레벨에서 발생한 오류를 나타내는 클래스입니다.
//
//    OutOfMemoryError: JVM이 메모리를 할당할 수 없을 때 발생하는 오류입니다.
//    StackOverflowError: 재귀적으로 함수를 호출하다 스택 메모리가 부족해질 때 발생하는 오류입니다.
//            NoClassDefFoundError: JVM이 필요한 클래스를 찾을 수 없을 때 발생하는 오류입니다.

}
