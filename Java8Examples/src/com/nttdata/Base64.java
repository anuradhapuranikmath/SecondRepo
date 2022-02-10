package com.nttdata;

import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64 {
	public static void main(String[] args) {
		Encoder basicEncoder=java.util.Base64.getEncoder();
		String encodedString=basicEncoder.encodeToString("Password".getBytes());
		System.out.println(encodedString);
		
		Decoder basicDecoder=java.util.Base64.getDecoder();
	 System.out.println("decoded String is "+new String(basicDecoder.decode(encodedString)));
	}
	

}
