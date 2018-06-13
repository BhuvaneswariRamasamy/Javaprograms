package com.exampleprograms;
import java.util.Scanner;
public class Encode {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("first");
    String input1=sc.next();
	System.out.print("second");
	String input2=sc.next();
	System.out.print("third" );
	String input3=sc.next();
      String[] s1=divideString(input1);
	  String[] s2=divideString(input2);
	  String[] s3=divideString(input3);
	String ss1=s1[0]+s2[1]+s3[2];
	String ss2=s1[1]+s2[2]+s3[0];
	String ss3=s1[2]+s2[0]+s3[1];
	  System.out.println(ss1);
	  System.out.println(ss2);
	  System.out.println(ss3);
	  String f3=toggleCase(ss3);
	  System.out.println(f3);
    }    
	public static String[] divideString(String input) {
			int r = input.length()%3;
			int d = input.length()/3;
			String first = null;
			String second = null;
			String third = null;
			if (r == 0) {
				first = input.substring(0,d);
				second = input.substring(d,first.length()+d);
			   third = input.substring(first.length()+d,input.length());
			}
    		if (r==2) {
				first = input.substring(0,r);
				second = input.substring(first.length(),first.length()+d);
			    third= input.substring(first.length()+d,input.length());
			}
			if (r==1) {
				first = input.substring(0,d);
				second = input.substring(d,first.length()+d+r);
				third = input.substring(first.length()+d+r,input.length());
            }
//		String b=first+" "+second+" "+third;
			return new String[] {first,second,third};
		}
     public static  String toggleCase(String ss3) {
		char[] ch=ss3.toCharArray();
		String s="";
		for( int i=0;i<ch.length;i++) {
			if(Character.isLowerCase(ch[i])){
				 s=s+Character.toUpperCase(ch[i]);
			}
		if(Character.isUpperCase(ch[i])){
				 s=s+Character.toLowerCase(ch[i]);
		}
		}
		 return s;
	}
    
}
