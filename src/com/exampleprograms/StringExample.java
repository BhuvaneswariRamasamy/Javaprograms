package com.exampleprograms;

public class StringExample {
public static void main(String args[]) {
	String one="Good";
    String oneobj=new String("Good");
    System.out.println(one);
    System.out.println(oneobj);
    System.out.println(one.hashCode());
    System.out.println(one.concat(oneobj));
    one=one+"Bad";
    System.out.println(one);
    System.out.println(one.hashCode());
    System.out.println(one.concat(oneobj));
    String s="This,is,my,name";
    String ss[]=s.split("i");
    for(int i=0;i<ss.length;i++) {
    	System.out.println(ss[i]);
    }	
    	StringBuffer sb=new StringBuffer();
        sb.append("Hello");
    	sb.append("Hii");
    	sb.append("How are u");
    	System.out.println(sb);
    	StringBuilder sb1=new StringBuilder();
        sb1.append("Hello");
    	sb1.append("Hii");
    	sb1.append("How are u");
    	System.out.println(sb1);
}

}
