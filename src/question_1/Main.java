package question_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int l = sc.nextInt();
		
		int [] array = new int [l];
		
		for(int i =0;i<l;i++)
		{
			System.out.println("Enter the elements in the array");
			array[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access");
		int ele = sc.nextInt();
		 
		System.out.println("The array element at index "+ele +" = "+array[ele]);
		System.out.println("The array element successfully accessed");
		}catch(ArrayIndexOutOfBoundsException aioob) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}catch(NumberFormatException nfe) {
			System.out.println("java.lang.NumberFormatException");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
