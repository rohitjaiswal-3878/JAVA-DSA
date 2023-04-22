package com.String;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves="LL";
        int U=0,D=0,L=0,R=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                U++;
            }else if(moves.charAt(i)=='D'){
                D++;
            }else if(moves.charAt(i)=='L'){
                L++;
            }else{
                R++;
            }
        }
        System.out.println("Output : "+((R==L)&&(U==D)));
    }
}
