package com.exercise18colections.app;

import java.util.LinkedList;
import java.util.Random;
import java.util.Iterator;



public class LinkedListApp 
{
	public static void main(String[] args) 
	{
		//Constant declaration
		final int ELEMENTS = 100;
		
		Random nRandom = new Random(System.nanoTime());
		
		LinkedList<Byte> miListita = new LinkedList<Byte>();
		
		
		
		
		miListita.add((byte) 5);
		miListita.add((byte) 10);
		miListita.set(1, (byte) 2);//This is slower than ArrayList
		System.out.println(miListita.get(0)); //This is better in ArrayList too
		System.out.println(miListita);
		System.out.println(miListita.size());
		System.out.println(miListita.isEmpty());
		System.out.println(miListita.contains((byte) 2));
		miListita.clear();
		System.out.println(miListita);
		for (int i = 0; i < ELEMENTS; i++) {
			miListita.add((byte) nRandom.nextInt(99));
		}
		
		//System.out.println(miListita);

		/*Iterator miIterador = miListita.iterator();
		
		while (miIterador.hasNext())
		{
			System.out.println(miIterador.next());
		}*/
		
		/*for (Byte miNumber : miListita) 
		{
			if (miNumber % 2 == 0 && miNumber > 0) {				
				System.out.println(miNumber);
			}
		}*/
		

	}

}
