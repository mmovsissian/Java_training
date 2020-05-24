package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


//4.1
//	Create array with length 10
//	Initialize with random ints (10 - 99)
//	print it
//	get a number from consol
//	test if an array contains that number


	public static void ex4_1() {
		boolean contains = true;
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 90 + 10);
		}
		System.out.println(Arrays.toString(array));
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i : array) {
			if (i == n) {
				contains = false;
			}
		}
		System.out.println(contains);
	}


//4.2
//	Create array with length 10
//	Initialize with random ints (10 - 99)
//	print it
//	sort it in 'asc' order
//	print the sorted


	public static void ex4_2() {
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 90 + 10);
		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}


//4.3
//	Create array with length 10
//	Initialize with random ints (10 - 99)
//	print it
//	sort it in 'desc' order
//	print the sorted

	public static void ex4_3() {
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 90 + 10);
		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		int temp;
		for (int i = 0; i < array.length / 2; ++i) {
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		System.out.println(Arrays.toString(array));
	}


//4.4
//	Create array with length 10
//	Initialize with random ints (10 - 99)
//	print it
//	Get a number from console
//	find and print the index  of that number

	public static void ex4_4() {
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 90 + 10);
		}
		System.out.println(Arrays.toString(array));
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				System.out.println(i);
			}

		}
	}


//4.5
//	Create matrix with dimensions 10x15
//	initialize with random ints in range 10 - 99
//	print it
//	find and print the maximum value


	public static void ex4_5() {
		int[][] array = new int[10][15];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				array[i][j] = (int) (Math.random() * 90 + 10);
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		int max = array[0][0];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		System.out.println(max);
	}

//4.6
//	Create matrix with dimensions 10x15
//	initialize with random ints in range 10 - 99
//	print it
//	Get the row number from console
//	Print the sum of the elements in that row of the matrix

	public static void ex4_6() {
		int[][] array = new int[10][15];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				array[i][j] = (int) (Math.random() * 90 + 10);
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		if (n < 10) {
			for (int i = 0; i < 15; i++) {
				sum += array[n][i];
			}
		}
		System.out.println(sum);
	}

//4.7
//	Create matrix with dimensions 10x15
//	initialize with random ints in range 10 - 99
//	print it
//	Rotate it in 90* clockwise
//	Print the rotated matrix


	public static void rotate90() {
		int[][] array = new int[10][15];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				array[i][j] = (int) (Math.random() * 90 + 10);
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

		int[][] rotatedArray = new int[15][10];

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 10; j++) {
				rotatedArray[i][j] = array[10 - 1 - j][i];
			}
		}

		System.out.println("---Rotated 90* clockwise--");
		for (int i = 0; i < 15; i++) {
			System.out.println(Arrays.toString(rotatedArray[i]));
		}

	}


//4.8
//	Create matrix with dimensions 10x15
//	initialize with random ints in range 10 - 99
//	print it
//	Rotate it in 180* clockwise
//	Print the rotated matrix


	public static void rotate180() {
		int[][] array = new int[10][15];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				array[i][j] = (int) (Math.random() * 90 + 10);
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

		int[][] rotatedArray = new int[10][15];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				rotatedArray[i][j] = array[10 - 1 - i][15 - 1 - j];
			}
		}

		System.out.println("---Rotated 180* clockwise--");
		for (int i = 0; i < 10; i++) {
			System.out.println(Arrays.toString(rotatedArray[i]));
		}

	}

//4.9
//	Create matrix with dimensions 10x15
//	initialize with random ints in range 10 - 99
//	print it
//	Rotate it in 270* clockwise
//	Print the rotated matrix


	public static void rotate270() {
		int[][] array = new int[10][15];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				array[i][j] = (int) (Math.random() * 90 + 10);
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

		int[][] rotatedArray = new int[15][10];

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 10; j++) {
				rotatedArray[15 - 1 - i][j] = array[j][i];
			}
		}

		System.out.println("---Rotated 270* clockwise--");
		for (int i = 0; i < 15; i++) {
			System.out.println(Arrays.toString(rotatedArray[i]));
		}

	}

//4.10
//	Create matrix with dimensions 5x5
//	initialize with random ints in range 10 - 99
//	print it
//	Display a menu
//———————- MENU —————-
//	For rotating 90*
//	For rotating 180*
//	For rotating 270*
//	For Exit
//————————————————
//	In any other case than 4 programm should NOT stop !!!

	public static void ex4_10() {
		int[][] array = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = (int) (Math.random() * 90 + 10);
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		System.out.print("———————- MENU ———————\n" +
				"1. For rotating 90*\n" +
				"2. For rotating 180*\n" +
				"3. For rotating 270*\n" +
				"4. For Exit\n" +
				"—————————————————————\n");
		Scanner scanner = new Scanner(System.in);
		int[][] rotatedArray = new int[5][5];
		boolean stopProgram = false;
		while (!stopProgram) {
			System.out.println("Input command:");
			int n = scanner.nextInt();
			switch (n) {
				case 1:
					for (int i = 0; i < 5; i++) {
						for (int j = 0; j < 5; j++) {
							rotatedArray[i][j] = array[5 - 1 - j][i];
						}
					}
					System.out.println("---Rotated 90*---");
					for (int i = 0; i < 5; i++) {
						System.out.println(Arrays.toString(rotatedArray[i]));
					}
					break;
				case 2:
					for (int i = 0; i < 5; i++) {
						for (int j = 0; j < 5; j++) {
							rotatedArray[i][j] = array[5 - 1 - i][5 - 1 - j];
						}
					}
					System.out.println("---Rotated 180*---");
					for (int i = 0; i < 5; i++) {
						System.out.println(Arrays.toString(rotatedArray[i]));
					}
					break;
				case 3:
					for (int i = 0; i < 5; i++) {
						for (int j = 0; j < 5; j++) {
							rotatedArray[5 - 1 - i][j] = array[j][i];
						}
					}
					System.out.println("---Rotated 270*---");
					for (int i = 0; i < 5; i++) {
						System.out.println(Arrays.toString(rotatedArray[i]));
					}
					break;
				case 4:
					System.out.println("---Exit---");
					stopProgram = true;
					break;
				default:
					System.out.println("---Enter correct command---");
			}
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					array[i][j] = rotatedArray[i][j];
				}

			}
		}
	}

	public static void main(String[] args) {
		// Uncommment to execute each exercise

//        ex4_1();
//        ex4_2();
//        ex4_3();
//        ex4_4();
//        ex4_5();
//        ex4_6();
//        rotate90()
//		  rotate180()
//		  rotate270()
//        ex4_10();
	}


}