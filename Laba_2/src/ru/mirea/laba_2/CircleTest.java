package ru.mirea.laba_2;
import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		Circle example = new Circle(read.nextDouble());
		example.CR_set (read.nextDouble());
		System.out.println("\n"+example.CR_get());
		
	}
	
}
