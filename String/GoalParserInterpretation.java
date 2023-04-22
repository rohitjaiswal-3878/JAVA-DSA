package com.String;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command="G()(al)";
        String a=command.replace("()","o");
        String b=a.replace("(al)","al");
        System.out.println("Output : "+b);
    }
}
