package lab_1;
import java.util.Scanner;


public  class cl_base {

	
	public static int[] array = null;
	public static int Summ;
	public static Scanner numb = new Scanner(System.in);
	
	
	public static void arrayenter()
	{
		System.out.println("Введите длину массива");
		array = new int[numb.nextInt()];
		System.out.println("");
	}
	
	public static void fillarray()
	{
		System.out.println("Вводите числа");
		for (int i = 0; i < array.length;i++)
		{
			array[i] = numb.nextInt();
		}
	}
	
	public static void ArrayOutFor()
	{
		Summ = 0;
		for (int i = 0; i < array.length; i++)
		{
			Summ+=array[i];
		}
		System.out.println("\n"+Summ+"\nВыведено с помощью for");
		Summ = 0;
	}
	
	
	public static void ArrayOutWhile()
	{
		Summ = 0;
		int counter = 0;
		while(counter < array.length)
		{
			Summ+=array[counter];
			counter++;
		}
		System.out.println("\n"+Summ+"\n" + "Выведене с помощью while");
		Summ = 0;
	}
	
	
	public static void ArrayOutDowhile()
	{
		Summ = 0;
		int counter = 0;
		do
		{
			Summ+=array[counter];
			counter++;
		} while (counter < array.length);
		System.out.println("\n"+Summ+"\n"+"Выведено с помощью do while");
		Summ = 0;
	}
	
	public static void main(String [] args) 
	{
		arrayenter();
		fillarray();
		ArrayOutFor();
		ArrayOutWhile();
		ArrayOutDowhile();
	}
}
