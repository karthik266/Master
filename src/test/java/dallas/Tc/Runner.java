package dallas.Tc;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {

		int a;
		Removeduplicates();
//Fibonacciseries();
//	reversestring();
//		evennum();
//		alphabetnumber();
		//primenumbers();
		//collection();
//		swapnum();
//		reverseanumber();
//		palindrome();
//		countevenoddnumber();
//		LargestNum();
		// smallestandlargetnum();
		Removeduplicates();
//		treesetsorting();
		// test();

	}

	public static void collection() {
		String str = "java";
		Character ch= 'c';
		
		HashMap<Character, Integer> hp = new HashMap<>();
		hp.replace(ch, 2);
		System.out.println(ch);
		TreeSet<Integer> ts = new TreeSet<>();
	}

	public static void test() {

		String str = "abcdca";
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			boolean unique = true;
			for (int j = 1; j < str.length(); j++) {

				if (ch[i] == ch[j]) {

					System.out.println(ch[j]);// i != j &&
					// unique = false;
					break;
				}
			}
			if (unique) {

				System.out.println(ch[i]);
				break;
			}
		}

	}

	public static void reversestring() {
		String Str;
		String rstr = "";
		char c;

		System.out.println("enter the word");
		Scanner sc = new Scanner(System.in);
		Str = sc.nextLine();

		for (int i = 0; i < Str.length(); i++) {
			c = Str.charAt(i);
			rstr = c + rstr;
		}

		System.out.println(rstr);

	}

	public static void evennum() {
		int Number;
		System.out.println("Enter the number");
		Scanner num = new Scanner(System.in);
		Number = num.nextInt();

		Number = 2;
		if (Number % 3 == 0) {
			System.out.println("given number is divisible by 3");
		} else {
			System.out.println("given number is not divisible by 3");
		}

	}

	public static void Fibonacciseries() {
		int Numbers = 5;

		int num1 = 0;
		int num2 = 1;
		int num3;

		for (int n = 0; n <= Numbers; n++) {

			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;

		}

	}

	public static void alphabetnumber() {

		// char ch;
		// int j;

		for (char i = 'A'; i <= 'Z'; i++) {
			int j = i;
			System.out.println(i + "  " + j);
		}

	}

	public static void primenumbers() {
		// int n = 10;
		for (int n = 1; n <= 100; n++) {
			int count = 0;
			for (int i = 1; i <= n; i++) {

				if (n % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println(n);
			} else {
				// System.out.println("it not prime No");
			}

		}
	}

	public static void swapnum() {

		int c = 10;
		int d = 20;
		int temp;
		c = c + d - (d = c);
//		temp = d ;
//		d =c;
//		c =temp;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}

	public static void reverseanumber() {
		String str;
		String rstr = "";
		char ch;

		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		str = input.nextLine();

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			rstr = ch + rstr;
		}
		System.out.println(rstr);
	}

	public static void palindrome() {
		String rstr = "";
		char c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();

		String OrgStr = str;

		for (int i = 0; i < str.length(); i++) {

			c = str.charAt(i);
			rstr = c + rstr;
		}

		if (OrgStr.equalsIgnoreCase(rstr)) {
			System.out.println("it is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

	public static void countevenoddnumber() {

		int num = 2564789;
		int counteven = 0;
		int countodd = 0;
		int count = 0;

		while (num > 0) {

			int rem = num % 10;

			if (rem % 2 == 0) {
				counteven++;
			} else {
				countodd++;
			}
			num = num / 10;
		}

		// System.out.println(count);
		System.out.println("Even number count " + counteven);
		System.out.println("Odd Number Count" + countodd);

	}

	public static void LargestNum() {

		int d[] = { 2, 3, 4, 5, 11, 9 };
		// System.out.println(d[2]);
		int max = d[0];

		for (int i = 1; i < d.length; i++) {
			if (d[i] > max) {

				max = d[i];
			}
		}

		System.out.println(max);
	}

	public static void smallestnum() {

		int e[] = { 2, 10, 20, 25, 22, 1 };

		int min = e[0];

		for (int i = 0; i < e.length; i++) {

			while (e[i] < min) {

				min = e[i];
			}
		}
		System.out.println(min);

	}

	public static void smallestandlargetnum() {

		// Scanner sc = new Scanner(System.in);
		// System.out.println("enter the name");
		// String str = sc.nextLine();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		char c;
		String rstr = "";

		/*
		 * for(int i = str.length()-1; i>=0 ; i--) {
		 * 
		 * c = str.charAt(i); rstr = rstr+c;
		 */
		for (int i = 0; i < str.length(); i++) {

			c = str.charAt(i);
			rstr = c + rstr;
		}

		System.out.println(rstr);
	}

	int count = 0;

	public static void Removeduplicates() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word");
		String str = sc.nextLine();
		// String strr = "madam";

		char[] c = str.toCharArray();
		int count = 0;
		// int length =str.length();
		for (int i = 0; i < c.length; i++) {

			for (int j = i + 1; j < c.length; j++) {

				if (c[i] == c[j]) {

					System.out.println("duplicates  " + c[j]);
					count++;
					break;
				}

			}
		}
		System.out.println("count of duplicates " + count);

	}

	public static void treesetsorting() {

		TreeSet<Object> abc = new TreeSet<Object>();
		abc.add(9);
		abc.add(80);
		abc.add(5);
		System.out.println(abc);
		TreeSet<Object> abcd = (TreeSet<Object>) abc.descendingSet();
	}
}
