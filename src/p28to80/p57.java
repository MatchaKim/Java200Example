package p28to80;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class p57 {
    public static void main(String[] args) {
        List<Integer> mmlists = Arrays.asList(1,23,24,24);

        mmlists.forEach(
                m->{
                    System.out.println(m);
                }
        );
        System.out.println();
        Consumer<Integer> consumer = (Integer m)->{
            System.out.println(m);
        };
            mmlists.forEach(consumer);
        }
//중요 JAVA 8Consumer와 Lambda
}
