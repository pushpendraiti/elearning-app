package com.info;

import java.util.Base64;

public class Base64EncodeDecodeTest {
	Base64.Encoder encoder = Base64.getEncoder();  
	Base64.Decoder decoder = Base64.getDecoder();
	
     public String encode(String pass) {
    	 String encodeToString = encoder.encodeToString(pass.getBytes());
    	 return encodeToString;
     }
     public String decode(String decodeString) {
    	 
    	 String decode = new String(decoder.decode(decodeString));
    	 return decode;
     }
}
