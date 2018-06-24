package com.exampleprograms;
import java .util.Scanner;

public class SecondUpperCase {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Input Sentence:");
    	  String s=sc.nextLine();
    	  String words[]=s.split("\\s");
    	  int len=words.length;
    	  if(len==1) {
    		  System.out.println("LESS");
    	  }
    	  else if(len>=2) {
    		  char nochar=words[1].charAt(0);
    		  if((nochar>=65&&nochar<=90)||(nochar>=96&&nochar<=122)) {
    			  String w=words[1].toUpperCase();
    			System.out.println(w);  
    		  }
    	  }else {
    		  System.out.println(words[1]);
    	  }
      }
	
}
