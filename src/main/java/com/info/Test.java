package com.info;

public class Test {

	public static void main(String[] args) {
		Base64EncodeDecodeTest base64EncodeDecodeTest = new Base64EncodeDecodeTest();
		String encode = base64EncodeDecodeTest.encode("sunita devi");
		System.out.println("Encoded pass "+encode);
		
		String decode = base64EncodeDecodeTest.decode(encode);
		System.out.println("Decode "+decode);
		System.out.println("Pushpendra");
		
		
	}

}
