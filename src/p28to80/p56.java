package p28to80;

import java.util.ArrayList;
import java.util.List;
//리스트 사용예제
public class p56 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=10; i++){
            list.add(i);
        }
        for(int i=0; i<list.size(); i++){
            int m= list.get(i);
            System.out.println(m);
        }

    }
}
