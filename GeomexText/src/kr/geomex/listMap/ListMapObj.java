package kr.geomex.listMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapObj {

	List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
	
	public void listAdd() {
		
		list.add((HashMap<String, Object>) new HashMap<String,Object>().put("age", 23));
		System.out.println(list);
	}
	
	public void listPrint() {
		
		listAdd();
		System.out.println("list : " + list);
	}
}
