package com.String;

public class DefangingAnIpAddress {
    public static void main(String[] args) {
        String ip="1.1.1.1";
        String defangedIp=ip.replace(".","[.]");
        System.out.println(defangedIp);
    }
}
