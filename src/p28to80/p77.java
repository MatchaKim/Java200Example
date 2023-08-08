package p28to80;


import java.util.Arrays;

import static p28to80.p55.print;

public class p77 {
    public static void main(String[] args) {
//        int [] a;
//        a = {1,2,3};
//
        int [] a=new int[5]; // 배열이니셜라이저 문제 관련
     //   int [] = a;
        a[0]=2;
        a[1]=5;
        a[2]=9;
        a[3]=8;
        a[4]=6;


        int [] b = new int[]{2,5,3,9,8};

        int [] c = {2,5,6,7,8};

        int [] e= new int [5];
        Arrays.fill(e,-1);
        System.arraycopy(c,0,e,0,c.length);
        Arrays.sort(e);
        print(e);
        e= new int[]{1,2,3,4,5,6,7};
        print(e);
        e= new int[]{1,2,3,4,5,6};
        print(e);
        int index = Arrays.binarySearch(e,5);
        System.out.println(index);
    }

    public static void print(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println();
    }

}
