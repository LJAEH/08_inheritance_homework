package com.hw3.model.vo;

public class Split {

	
	public void ex1() {
		
	String str = "송민호,서혁진,김원태,최건국";
	String[] arr = str.split(",");
	String name1 = arr[0];
	String name2 = arr[1];
	String name3 = arr[2];
	String name4 = arr[3];
	
	System.out.println(arr[1]);
	}
}
