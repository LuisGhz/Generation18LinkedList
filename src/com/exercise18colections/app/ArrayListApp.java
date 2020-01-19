package com.exercise18colections.app;

import java.util.ArrayList;

import java.util.Random;
import java.util.Iterator;

public class ArrayListApp {
	public static void main(String...args) 
	{
		//Constant declaration
		final int ELEMENTS = 100;
		
		Random nRandom = new Random(System.nanoTime());
		
		ArrayList<Short> miArraycito = new ArrayList<Short>();
			
		miArraycito.add((short) 5);
		miArraycito.add((short) 10);
		miArraycito.add((short) 20);
		miArraycito.add((short) 30);
		miArraycito.add((short) 40);
		
		System.out.println(miArraycito.get(2));
		System.out.println(miArraycito.remove(2));
		System.out.println(miArraycito);
		
		for (short miShort : miArraycito) 
		{
			System.out.println(miShort);
		}
	}
}
