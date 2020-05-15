package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


//3.1
//    Write a program to display the first 20 natural numbers.

	public static void ex3_1() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
	}


//3.2movses
//    Write a program to display the first 20 natural
//    numbers but exclude the ones that are divisible by 3. (using continue)

	public static void ex3_2() {
		for (int i = 0; i < 20; i++) {
			if (i % 3 == 0) {
				continue;
			} else System.out.println(i);
		}
	}


//3.3
//    Write a program to print the even numbers in range  {-20, +60}

	public static void ex3_3() {
		for (int i = -20; i <= 60; i += 2) {
			System.out.println(i);
		}
	}


	//3.4
//    Write a program to print the odd numbers in range  {-20, -60}

	public static void ex3_4() {
		for (int i = -60; i <= -20; i++) {
			if (i % 2 == 0) {
				continue;
			} else System.out.println(i);
		}
	}

//3.5
//    Write a program to find the sum of the first 100 natural numbers.

	public static void ex3_5() {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

//3.6
//    Write a program to find the sum of odd numbers of the first 100 natural numbers.

	public static void ex3_6() {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				continue;
			} else sum += i;
		}
		System.out.println(sum);
	}

//    3.7
//    Write a program to find the average of even numbers of the first 100 natural numbers.

	public static void ex3_7() {
		int sum = 0, n = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				sum += i;
				n++;
			} else {
				continue;
			}
		}
		System.out.println(sum / n);
	}

//3.8
//    Write a program to read 10 numbers from keyboard (console) and find their sum and average

	public static void ex3_8() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += scanner.nextInt();
		}
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + sum / 10);
	}

//3.9
//    Write a program to display the cube of the number upto given integer.
//    Test Data :
//    Input number of terms : 5
//
//    Expected Output :
//    Number is : 1 and cube of the 1 is :1
//    Number is : 2 and cube of the 2 is :8
//    Number is : 3 and cube of the 3 is :27
//    Number is : 4 and cube of the 4 is :64
//    Number is : 5 and cube of the 5 is :125

	public static void ex3_9() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Number is : " + i + " and cube of the " + i + " is  " + (int) (Math.pow(i, 3)));
		}
	}

//3.10
//    Write a program to display the multiplication table of a given integer


	public static void ex3_10() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}
	}


//3.11
//    Write a program to determine whether a given number is prime or not.
//    Test Data :
//    Input a number: 13
//    Expected Output :
//            13 is a prime number.

	public static void ex3_11() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean isPrime = true;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) isPrime = false;
		}
		if (isPrime) System.out.println(n + " is a prime number.");
	}

	//3.12
//    Write a program to display the first n Fibonacci series.
//            (Fibonacci series 0 1 1 2 3 5 8 13 .....)
//    Test Data :
//    Input number of terms to display : 10
//    Expected Output :
//    Here is the Fibonacci series upto to 10 terms :
//            0 1 1 2 3 5 8 13 21 34

	public static void ex3_12() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			if (i == 0)
				result[i] = 0;
			if (i == 1)
				result[i] = 1;
			if (i > 1)
				result[i] = result[i - 1] + result[i - 2];
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}


//3.13
//    Write a program to print a string  "ROBOTS_WILL_KILL_ALL_HUMANZ"
//    in reverse order  (you can use myString.charAt(x) - google it)


	public static void ex3_13() {
		String initial = "ROBOTS_WILL_KILL_ALL_HUMANZ";
		String result = "";
		for (int i = initial.length() - 1; i >= 0; i--) {
			result += initial.charAt(i);
		}
		System.out.println(result);
	}

//    3.14
//    Write a program to store random int elements in an array and print it.

	public static void ex3_14() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Random rand = new Random();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = rand.nextInt();
		}
		System.out.println(Arrays.toString(array));
	}

//3.15
//    Write a program to store random int elements in an array and print it in reverse order.

	public static void ex3_15() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Random rand = new Random();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = rand.nextInt();
		}
		System.out.println(Arrays.toString(array));

		//not sure what was required, so reversed the array
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

//    3.16
//    Write a program to store random int elements in an array and find the sum of all elements of the array.

	public static void ex3_16() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		Random rand = new Random();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = rand.nextInt();
			sum += array[i];
		}
		System.out.println(sum);
	}


//    3.17
//    Write a program to store random int elements in an array
//    and copy the elements of that array into another array.

	public static void ex3_17() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Random rand = new Random();
		int[] array = new int[n];
		int[] array_copy = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = rand.nextInt();
		}
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < n; i++) {
			array_copy[i] = array[i];
		}
		System.out.println(Arrays.toString(array_copy));

	}

//3.18
//    Write a program to store random int elements in an array
//    and find the maximum and minimum element in an array.


	public static void ex3_18() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Random rand = new Random();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = rand.nextInt();
		}
		System.out.println(Arrays.toString(array));

		int min = array[0];
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
		}
		System.out.println(min);
		System.out.println(max);
	}


	public static void main(String[] args) {
		// Uncommment to execute each exercise

//        ex3_1();
//        ex3_2();
//        ex3_3();
//        ex3_4();
//        ex3_5();
//        ex3_6();
//        ex3_7();
//        ex3_8();
//        ex3_9();
//        ex3_10();
//        ex3_11();
//        ex3_12();
//        ex3_13();
//        ex3_14();
//        ex3_15();
//        ex3_16();
//        ex3_17();
//        ex3_18();
	}
}