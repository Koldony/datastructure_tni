package LabSheet;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		for (int num : initial_numbers) {
            numbers.add(num);
        }
		numbers.add(999);
		System.out.println("After added the last element: " + numbers);
		numbers.add(4, 200);
		System.out.println("After added the middle element: " + numbers);
		numbers.remove(8);
		System.out.println("After remove the element: " + numbers);
		numbers.set(6, 3000);
		System.out.println("After updated the element: " + numbers);
		System.out.println(numbers);
	}

}
