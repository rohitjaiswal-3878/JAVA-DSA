package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayFormOfMatrix {
    public static void main(String[] args) {
        int[] num={1,2,0,0};
        int k=34;
        List<Integer> ans= new ArrayList<>();
        long sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum*10+num[i];
        }
        sum=sum+k;
        long rev=0;
        while(sum!=0){
            int rem=(int)sum%10;
            rev=rev*10+rem;
            sum=sum/10;
        }
        while(rev!=0){
            int rem=(int)rev%10;
            ans.add(rem);
            rev=rev/10;
        }
        System.out.println("Input Array : "+ Arrays.toString(num));
        for(int i=0;i<ans.size();i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
