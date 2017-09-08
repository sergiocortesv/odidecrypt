package com.k1687.odiutils;

import com.sunopsis.dwg.DwgObject;

public class ODIDecrypt {
	
	public static void main(String[] args) {
		if(args.length < 1){
			System.out.println("Usage : java -jar ODIDecrypt.jar <ODIPassword>");
		}
		DwgObject dg= new DwgObject(){
			@Override
			public String getObjectLocation() {
				return null;
			}
		};
		String decryptedStr = String.valueOf(dg.snpsDecypher(args[0]).toCharArray());
		System.out.println(decryptedStr);
	}
}
