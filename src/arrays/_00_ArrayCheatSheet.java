package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] name= {"A","B","C","D","E"};
		//2. print the third element in the array
		System.out.println(name[2]);
		//3. set the third element to a different value
		name[2]="Tim";
		//4. print the third element again
		System.out.println(name[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < name.length; i++) {
		System.out.println(name[i]);
		}
		
		//6. make an array of 50 integers
		int[] num = new int[50];
		//7. use a for loop to make every value of the integer array a random number
	Random ran = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i]=ran.nextInt(1000);
			System.out.println(num[i]);
					
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (smallest>num[i]) {
				smallest=num[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int largest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (largest<num[i]) {
				largest=num[i];
				
				
			}
		}
		System.out.println(largest);
	}
}
