package a19_스태틱;

import java.util.ArrayList;
import java.util.HashMap;

public class SingleTon {

	public static void main(String[] args) {
		Apple apple1 = Apple.getInstance();
		System.out.println("???");
		Apple apple2 = Apple.getInstance();
		
		ArrayList<Iphone> appleList = new ArrayList<Iphone>();
		
		appleList.add(apple1.createIphone("아이폰12 미니"));
		appleList.add(apple1.createIphone("아이폰12"));
		appleList.add(apple1.createIphone("아이폰12 Max"));
		appleList.add(apple2.createIphone("아이폰13 미니"));
		appleList.add(apple2.createIphone("아이폰13"));
		appleList.add(apple2.createIphone("아이폰13 Max"));
		
		HashMap<Integer, Iphone> appleMap = new HashMap<Integer, Iphone>();
		
		for(Iphone iphone : appleList) {
			appleMap.put(iphone.getSerialNumber(), iphone);
		}
		
		System.out.println(appleMap);
		
		for(Iphone iphone: appleList) {
			System.out.println(iphone);
		}
		
	}

}
