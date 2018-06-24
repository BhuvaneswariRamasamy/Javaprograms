package com.exampleprograms;



public class IdentifyPossibleWords {
	public static void main(String args[]) {
String s1="Fi_er";
String s2="Fever:filter:Filter:Fixer:fiber:tailor:offer";
  
String[] s3=s2.split(":");
for(String s:s3) {
System.out.println(s);

}
String[] s=null;
String count=null;
for(int i=0;i<s3[i].length();i++) {
if(s1.length()==s3[i].length()) {
  System.out.println( s3[i]);
  s3[i]=count;
  }
}

String replaceString=s1.replace('_','x');
System.out.println(replaceString);



	}
}
