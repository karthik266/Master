package learning;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test2 {

	public static void main(String[] args) {
		String str = "nitin speaks malayalam";
		String[] words = str.split(" ");

		for (String word : words) {

			//System.out.println(word);
			if(ispalindrome(word)) {
				//System.out.println(word  );
			}

		}
		// Accurance("java");
		// palindrom("karthik");
		 duplicate();
		// totalaccurance();
		// duplicatecharacter();
//		String st = "mam name";
//		String[] words = st.split(" ");
//		
//		for (String st1 : words) {
//			if ( palin(st1)) {
//				System.out.println(st1);
//			}
//		// Swapnumber();
		// totalaccurances();
		//Accurance("java");
		// Bigestnumber();
		// fibonacciseriess1();
		//Mostrepetative();
	}
	// }
	
	public static void reverseasentence() {

		String str = "Java is a programming language and robust language";

		char[] ch = str.toCharArray();
		int count = 1;
		for (int i = 0; i < str.length(); i++) {

			if ((ch[i] == ' ')) {

				count++;

			}
			

		}System.out.println(count);

	}

	public static void mostrepeatedcharacter() {

		String str = "karthik good boy";

		// char c;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {

			map.merge(ch, 1, Integer::sum);

			System.out.println(map.entrySet());

		}
		Entry<Character, Integer> entry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
		System.out.println(entry.getKey() + " = " + entry.getValue());
	}

	public static boolean ispalindrome(String str) {

		int i1 = 0;
		int i2 = str.length() - 1;

		while (i2>i1) {

			if (str.charAt(i1) != str.charAt(i2)) {
				
				return false;
			}
i1++;
i2--;
		}
		return true;

	}

	public static void fibonacciseriess1() {

		// 0 , 1 , 1 ,2 ,3 , 5..

		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 2; i < 10; i++) {

			num3 = num1 + num2;// 0+1

			num1 = num2;//
			num2 = num3;

			System.out.println(num3);
		}

	}

	public static void Bigestnumber() {

		int[] numbers = { 1, 222, 3, 10, 20 };
		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			while (numbers[i] < min) {

				min = numbers[i];

			}

		}
		System.out.println(min);

	}

	public static void palindromletter() {
		String str = "karthi";
		char ch;
		String rstr = "";
		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			rstr = ch + rstr;

		}
		System.out.println(rstr);

		if (rstr.equals(str)) {
			System.out.println("it is palindrom");
		} else {
			System.out.println("not a palindrome");
		}

	}

	public static void totalaccurances() {

		String str = "Java";

		char[] ch = str.toCharArray();

		Map<Character, Integer> accurance = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {

				if (ch[i] == ch[j]) {

					count++;

				}

			}
			accurance.put(ch[i], count);

		}
		System.out.println(accurance);

		for (Character key : accurance.keySet()) {
			System.out.println(key + " = " + accurance.get(key));

		}

	}

	public static void Mostrepetative() {

		String str = "aabbb";

		Map<Character, Integer> map = new HashMap();

		for (Character c : str.toCharArray()) {

			map.merge(c, 1, Integer::sum);
		}
		System.out.println(map.entrySet());

		Entry<Character, Integer> entry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
		System.out.println(entry.getKey() + "=" + entry.getValue());

	}

	public static void Swapnumber() {

		int a = 2;
		int b = 6;

		System.out.println(" a = " + ((a + b) - a));
		System.out.println(" b = " + ((a + b) - b));

	}

	public static boolean palin(String st) {

		int i1 = 0;
		int i2 = st.length() - 1;

		while (i1 < i2) {

			if (st.charAt(i1) != st.charAt(i2)) {
				// System.out.println("word not palindrome");
				return false;

			} else {

				i1++;
				i2--;
			}
		}
		return true;

	}

	public static void palindromeline() {
		String str = "mom";
		String[] strarray = str.split(" ");

		for (String word : strarray) {

			int i1 = 0;
			int i2 = str.length() - 1;

			while (i1 < i2) {

				if (str.charAt(i1) != str.charAt(i2)) {

				}
				i1++;
				i2--;

			}
			System.out.println(word);

		}
	}

	public static void Accurance(String str) {
		// String str = "aaabbc";
		// int min = 0;
		char[] ch = str.toCharArray();
		int count = 0;

		Map<Character, Integer> charmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {

			count = 0;
			for (int j = 0; j < str.length(); j++) {

				if (ch[i] == ch[j]) {

					count++;
				}
			}
			charmap.put(ch[i], count);

		}

		System.out.println(charmap);

		for (Character key : charmap.keySet()) {
			System.out.println(key + " = " + charmap.get(key));
		}

	}

	public static void palindrom(String str) {

		// String str = "madam";
		String rstr = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			rstr = ch + rstr;

		}
		System.out.println(rstr);

		if (str.equalsIgnoreCase(rstr)) {
			System.out.println("it is a palindrome");
		} else {

			System.out.println("it is not a palindrom");
		}
	}

	public static void duplicate() {

		String str = "aaba";
		int count = 0;
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < ch.length; i++) {
			count = 0;
			for (int j = 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					count++;
				}

				// System.out.println(map);
			}
			map.put(ch[i], count);
			for (Character c : map.keySet()) {
				System.out.println(c + " " + count);
			}
		}

	}

	public static void totalaccurance() {

		String strr = "oh my god";
		int count = 0;
		char ch[] = strr.toCharArray();
		// int count = 0;
		// Map<Character,Integer> str = new HashMap<>();

		for (int i = 0; i < strr.length(); i++) {

			for (int j = i + 1; j < strr.length(); j++) {

				if (ch[i] == ch[j]) {
					System.out.println(ch[i]);
					count++;

				}
			}
			// str.put(ch[i], count);

		}
		System.out.println(count);

	}

}
