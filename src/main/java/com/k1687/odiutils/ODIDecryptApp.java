package com.k1687.odiutils;

public class ODIDecryptApp {
	
	public static void main(String[] args) {
		if(args.length < 1){
			System.out.println("Usage : java -jar ODIDecrypt.jar <ODIPassword>");
		}
		
		ODIDecrypt odiDecrypt = new ODIDecrypt();
		String decrypted = odiDecrypt.decrypt(args[0]);
		System.out.println(decrypted);
	}
}
