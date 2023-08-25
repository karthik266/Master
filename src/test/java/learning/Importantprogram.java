package learning;

import java.util.HashMap;
import java.util.Scanner;

public class Importantprogram {
	int count;

	public static void main(String[] args) {
		
		
		
		
		int a =10;
		int b =20;
		
		System.out.println(a + b +" is result");
		System.out.println(" a+b resulut is " + a + b);

		// obj.duplicate();
		// obj.firstletterrepeat();
		// palindrome();
		// duplicate();
		// totalaccurances();
		// reverseanumber(3456);
		// TotalCountOfNumber();
		// SwapTwoNumbers();
		// CountOfEvenAndOddNumbers();
		// SumOfDigit();
		// MaxAndMin();
		// Factorial();
		// PrimeNumbers();
		// FibonacciSeries();
		 //sorting();
		// GivenWordPalindromeOrNot();
		// Duplicate();
		//FindTheVovels();
		//BiggestNumberFromVariable();
		//Maxrepeatcharacter();
	}

	public static void BiggestNumberFromVariable() {

		int a = 23, b = 22, c = 30;
		
		int[] ar = {a = 3, b = 255, c = 30};
		int max = ar[0];
		
		for(int  i = 0 ; i<ar.length ; i++) {
			
			if(ar[i]>max) {
				
				max = ar[i];
			}
		}System.out.println(max);

		

	}

	public static void FindTheVovels() {

		String str = "automation23";

		for (int i = 0; i < str.length(); i++) {
			char[] ch = str.toCharArray();

			if ((ch[i] == 'a') || (ch[i] == 'e') || (ch[i] == 'i') || (ch[i] == 'o') || (ch[i] == 'u')) {

				System.out.println("    Vovels = " + str.charAt(i));
		} 
				else if ((ch[i] != 'a') && (ch[i] != 'e') && (ch[i] != 'i') && (ch[i] != 'o') && (ch[i] != 'u')) {

				System.out.println("Consonents = " + str.charAt(i));
			} 

		}
	}

	public static void Duplicate() {

		String str = "My mom name is selvi";
		// String str = str1.replace(" ", "");
		char[] ch = str.toCharArray();
		String s = "";
		int count = 0;
		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {

					System.out.print(ch[i]);
				}
			}
		}

	}

	public static void GivenWordPalindromeOrNot() {

		String str = "man";
		String rstr = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);

			rstr = ch + rstr;

		}
		// System.out.println(rstr);

		if (str.equalsIgnoreCase(rstr)) {

			System.out.println("Given word is palindrome");

		} else {
			System.out.println("not a palindrome");
		}
	}

	public static void sorting() {

		int[] Numbers = { 2, 4, 5, 1, 3 };

		for (int i = 0; i < Numbers.length; i++) {

			for (int j = i + 1; j < Numbers.length; j++) {

				int temp = 0;
				if (Numbers[i] > Numbers[j]) { // 2 ,1

					temp = Numbers[i];//2
					Numbers[i] = Numbers[j];//1
					Numbers[j] = temp;
					// System.out.print(temp);
					//

				}

			}
			System.out.print(Numbers[i]);

		}

	}

	public static void FibonacciSeries() {

		int num1 = 0;
		int num2 = 1;
		int num3;

		System.out.println(num1);
		for (int i = 3; i < 15; i++) {

			num3 = num1 + num2;
			num2 = num1;
			num1 = num3;
			System.out.println(num3);
		}

	}

	public static void PrimeNumbers() {

		int num = 5;
		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				count++;
			}
		}
		if (count == 2) {

			System.out.println("Given number is  prime number");
		} else {

			System.out.println("G not prime number");
		}

	}

	public static void Factorial() {

		int num = 5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void MaxAndMin() {

		int[] num = { 2, 5, 6, 8, 4, 3 };
		int max = num[0];
		int min = num[0];

		for (int i = 1; i < num.length; i++) {

			if (max < num[i]) {

				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];

			}

		}
		System.out.println(max);
		System.out.println(min);
	}

	public static void SumOfDigit() {

		int num = 2486;
		int sum = 0;
		int Remainder = 0;

		while (num > 0) {

			Remainder = num % 10;
			num = num / 10;
			sum = Remainder + sum;

		}
		System.out.println(sum);
	}

	public static void CountOfEvenAndOddNumbers() {

		int num = 100;
		int evencount = 0;
		int oddcount = 0;

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				evencount++;
			} else {

				oddcount++;
			}

		}
		System.out.println(evencount);
		System.out.println(evencount);
	}

	public static void reverseanumber(Integer number) {

		int Remainder = 0;

		while (number != 0) {

			Remainder = Remainder * 10 + number % 10;
			number = number / 10;
		}

		System.out.println("Given Number is reversed " + Remainder);
	}

	public static void TotalCountOfNumber() {

		int number = 153;
		int count = 0;
		int Remainder;
		while (number != 0) {

			Remainder = number % 10;
			count++;
			number = number / 10;
		}

		System.out.println(count);
	}

	public static void SwapTwoNumbers() {
		int a = 10;
		int b = 20;

		a = a + b; // 10+20 =30
		b = a - b; // 30-20=10
		a = a - b; // 30-10=20

		System.out.println("a =" + a);

		System.out.println("b =" + b);

	}

	public static boolean isGivenSentencePalindrome(String str) {

		int i = 0;
		int j = str.length() - 1;

		while (j > i) {
			if (str.charAt(i) == str.charAt(j)) {

				i++;
				j--;
				break;

			}

		}
		return false;

	}

	public static void Maxrepeatcharacter() {

		String str1 = "lntkarthik";
		String str = str1.toUpperCase();
		char[] ch = str.toCharArray();
		int count = 2;

		int max;
		HashMap<Character, Integer> ta = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {

			if (ta.containsKey(ch[i])) {

				ta.put(ch[i], ta.get(ch[i]) + 1);
				break;

			} else {
				ta.put(ch[i], 1);
			}

		}

		 System.out.println(ta);

//		for (char all : ta.keySet()) {
//
//			System.out.println(all + " = " + ta.get(all));

			// System.out.println(all +" = " + ta.get(all));
//		}

	}

	public static void duplicate() {

		String str = "Automation Testing java";
		int count = 0;
		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {

				if (ch[i] == ch[j]) {
					System.out.println("dublicate  " + ch[j]);
					count++;
					break;

				}
			}

		}
		System.out.println("duplicate count = " + count);
	}

	public void firstletterrepeat() {

		String str1 = "bccba";
		boolean unique; // char[] ch1 = str1.toCharArray();

		for (int i = 0; i <= str1.length(); i++) {
			unique = true;
			for (int j = 1; j < str1.length(); j++) {

				if (i != j && str1.charAt(i) == str1.charAt(j)) {
					// System.out.println("repeated "+ str1.charAt(j) );
					unique = false;
					break;

				}
			}
			if (unique) {

				System.out.println("first non repeated character " + str1.charAt(i));
				break;
			}
		}
	}

	public static void palindrome() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
//abcd
		String rstr = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			rstr = ch + rstr;

		}

		if (str.equalsIgnoreCase(rstr))
			System.out.println("It is a palindrome");
		else {
			System.out.println("Not a palindrome");
		}
	}

	public static void firstcharacter() {

		String s = "Java";
		boolean unique;
		for (int i = 0; i < s.length(); i++) {
			unique = true;
			for (int j = 0; j < s.length(); j++) {

				if (i != j && s.charAt(i) == s.charAt(j)) {

					// System.out.println(i);
					unique = false;
					break;
				}
			}

			if (unique) {
				System.out.println(s.charAt(i));
			}
		}

	}
}
