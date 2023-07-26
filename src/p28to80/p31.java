package p28to80;

public class p31 {
    public static void main(String[] args) {
        Fruit fruit = Fruit.BANANA;
        System.out.println(fruit.name());
        System.out.println(fruit.ordinal());
    }
//enum 을 통해 값을 통일화 할 수 있다
    //확장 ->enum을 순서대로 GUEST, USER , ADMIN 이런식으로 놓고 ordinal 이 1보다 커야
    //글쓰기 가능 이런식으로 확장 할 수 도 있겠다
    public enum Fruit{
        APPLE,BANANA,Mango
    }
}
