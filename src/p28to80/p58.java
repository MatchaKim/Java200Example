package p28to80;

import java.util.ArrayList;
import java.util.List;

public class p58 {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int s=0;
        for(int i=1; i<=10; i++){
            ilist.add(i);
        }
        for(int m: ilist){
            if(m%2==1){
                s+=m*m;
                System.out.println(m*m);
            }
        }
        System.out.println(
                "1에서 10 사이 홀수 제곱의 합"+s
        );
    }


}
