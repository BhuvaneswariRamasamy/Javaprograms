package com.exampleprograms;
import java.util.Scanner;
public class Distinct {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input");
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		String[] s2=s1.split("\\s");
	    String s3="";
	    int count=0;
	    for(int k=0;k<s2.length;k++) {
	    	s3=s3+s2[k];
	    	}
		String s4=s3.trim();
		for(int i=0;i<s4.length();i++) {
			for(int j=0;j<s4.length();j++) {
				if(s4.charAt(i)==s4.charAt(j)){
					count++;
				}
			}
			if(count==1) {
				System.out.println(s4.charAt(i));
				count=0;
			}
			else if(count>1) {
				count=0;
			}
		}
   
	    }
}
