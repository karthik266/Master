package learning;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {

		
	}

	public static void Rstring() {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String Str = Sc.nextLine();
		char ch;
		String rstr = "";

		for (int i = 0; i < Str.length(); i++) {

			ch = Str.charAt(i);

			rstr = ch + rstr;
		}
		System.out.println("Reverse word " + rstr);
	}

	public static void primenumber() {
		for (int num = 1; num <= 100; num++) {

			int Count = 0;
			for (int i = 1; i <= num; i++) {

				if (num % i == 0)

					Count++;

			}
			if (Count == 2) {
				System.out.println(num);
			} else {

			}
		}

	}

	public static void duplicatecharacter() {

		String Str = "Automation";
		char[] ch = Str.toCharArray();
		int Count = 0;
		for (int i = 0; i < ch.length; i++) {
			
			
			for(int j = i+1; j < ch.length; j++) {
				
				if(ch[i]==ch[j]) {
					
					System.out.println(ch[j]);
					Count++;
					break;
				}
				
			}

		}System.out.println(Count);
	}

}
