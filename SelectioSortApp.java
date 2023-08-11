package sorting;

import java.util.Scanner;

public class SelectioSortApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		System.out.println("enter array length");
		int n= scan.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println("enter array elements");
			arr[i]=scan.nextInt();
		}
		System.out.println("array elements before swapping");
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		SelectionSort s= new SelectionSort();
		s.sort(arr);
		System.out.println("array contents after sorting");
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}
