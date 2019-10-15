package com.excercise8Phibo.app;

import java.util.Scanner;

public class Phibonacci {

	public static void main(String[] args) {
		int cont1=0;
		int cont2=1;
		long fibonacci=1;
		int bond=0;
		
		Scanner input = new Scanner(System.in);
		{
		System.out.println("numbers here");
		bond = input.nextInt();
		if (bond<=0);
		{System.out.println("numbers here!!!!!!!");}
		}
		while(bond<=0);
		
		for(int i=0;i<bond;i++);
		{System.out.println(fibonacci+" ");
		fibonacci=cont1+cont2;
		cont1=cont2;
		cont2=(int) fibonacci;
		}
		
		

	}

}
