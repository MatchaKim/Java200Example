package p28to80;

import org.w3c.dom.ls.LSOutput;

public class p64 {
//다형성, 오브젝트 개념 중요
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println(object1.hashCode());
        System.out.println(Integer.toHexString(object1.hashCode()));
        System.out.println(object1==object2);
        System.out.println(object1.equals(object2));
        System.out.println(object1);
        System.out.println(object2.toString());

        System.out.println(object1.getClass().getName());
        String str = object1.getClass() + "@"+Integer.toHexString(object1.hashCode());
        System.out.println(str);

        Object objstr =new String ("Good");
        System.out.println(objstr.toString());
        System.out.println(objstr instanceof  Object);
        System.out.println(objstr instanceof String);

        String hello = "hello";
        System.out.println(hello.getClass());
    }


}
