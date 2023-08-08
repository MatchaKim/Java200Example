package p28to80;

import java.util.Iterator;
import java.util.Map;

public class p72 {
    public static void main(String[] args) {
        long nameotime = System.nanoTime();
        for(int i=0; i<100000; i++){
            System.out.print("");
        }
        long namotiome2= System.nanoTime();
        System.out.println((namotiome2-nameotime));
        System.out.println(System.getenv("JAVA_HOME"));
        //모든 env 구하기
        Map<String,String> map = System.getenv();
        Iterator<String> iter = map.keySet().iterator();
        int j =0;
        while(iter.hasNext()){
            String keys = iter.next();
            System.out.println((++j+" ")+keys+" : "+map.get(keys));
        }
    }
}
