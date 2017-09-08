package com.k1687.odiutils;

import com.sunopsis.dwg.DwgObject;

/**
 * Decrypts ODI encoded strings using the ODI SDK classes
 * @author scortes
 */
public class ODIDecrypt {
	
	private DwgObject odiDg;
	
	public ODIDecrypt(){
		odiDg = new DwgObject(){
			private static final long serialVersionUID = 1L;

			@Override
			public String getObjectLocation() {
				return null;
			}
		};
	}
	
	public String decrypt(String encrypted){
		return String.valueOf(odiDg.snpsDecypher(encrypted).toCharArray());
	}
	
}
