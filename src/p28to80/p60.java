package p28to80;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class p60 {

    public static void main(String[] args) {
        List<Integer> ilist =new ArrayList<>();
        int s=0;
        for(int i=1; i<=10; i++){
            ilist.add(i);
        }

        ilist = ilist.stream()
                .filter(i->i%2 ==1)
                .map(i->i*i)
                .collect(Collectors.toList());
        ilist.forEach(i-> System.out.println(i+"\t"));
        System.out.println();
        s=ilist.stream().reduce(0,Integer::sum);
        System.out.println("1에서 10사이 홀수의 제곱에대한 합"+s);
    }

    //stream 방식

}
