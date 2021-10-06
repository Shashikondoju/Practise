package com.nt.helper;

import java.util.HashMap;

public class AccType {
	private static HashMap<String,Integer> accTypeMap;
	static {
		accTypeMap=new HashMap();
	
		accTypeMap.put("SAVINGS", 1);
		accTypeMap.put("CURRENT", 2);
		accTypeMap.put("NRI", 3);
	}
	
	public static int getAccTypeId(String accType) {
		return accTypeMap.get(accType.toUpperCase());
	}
	

}
