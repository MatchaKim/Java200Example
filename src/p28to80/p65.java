package p28to80;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class p65 {
    public static void main(String[] args) {
        Object object1 = new Object();
        Class classes = object1.getClass();
        System.out.println(classes.getName());
        Constructor[] constructors = classes.getDeclaredConstructors();
        for(Constructor con: constructors){
            System.out.println(con.getName());
        }
        Method [] methods = classes.getMethods();
        for(Method me : methods){
            System.out.println(me.getName());
        }

    }

}
