package chap6;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		type name[];
		type[] name;
		type[][] name;
		type name[][];
		type[] name[];
		
		name = new type[];
		name = new typee[][];
		
		type[] name = new type[];
		type name[] = new type[];
		type[][] name = new type[][];
		type[] name[] = new type[][];
		*/
		
		int arr[] = new int[3];
		int arr2[][] = new int[1][2];
		int arr3[] = {10, 20,30};
		int arr4[][] = {{10,20,30},{40,50,60,70}};
		
		System.out.print(arr3.length);
		System.out.print(arr4.length);		// 2
		System.out.print(arr4[0].length);	// 3
		System.out.print(arr4[1].length);	// 4
		
		int sum = 0;
		for(int i : arr3) sum += i;
		System.out.print(sum);
	}

}
