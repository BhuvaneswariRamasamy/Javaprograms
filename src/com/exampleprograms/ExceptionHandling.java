package com.exampleprograms;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ExceptionHandling {
public static void main(String args[]) {
	try {

	URL url=new URL("htt://www.gmail.com");
	URLConnection connection =url.openConnection();
  System.out.println("last line");
  
	}catch(MalformedURLException e) {
		System.out.println("malformed");
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		System.out.println("hello");
	}
	
	
}
}

	
	
  


