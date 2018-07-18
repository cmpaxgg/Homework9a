package com.gmail.cmpaxgg;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<>();
		myList.add("If");
		myList.add("you");
		myList.add("want");
		myList.add("to");
		myList.add("be");
		myList.add("okey");
		myList.add("you");
		myList.add("must");
		myList.add("coding");
		myList.add("every day");
		System.out.println(myList);
		myList.remove(0);
		myList.remove(0);
		myList.remove(myList.size()-1);
		System.out.println(myList);
	}

}
