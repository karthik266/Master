package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectiontopics {

	public static void hashmapconecpts(String str) {

		char ch;
		String rstr = "";

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			rstr = ch + rstr;
		}

		System.out.println(rstr);

		if (str.equalsIgnoreCase(rstr)) {

			System.out.println("it is a palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

	public static  void ReverseUsingCollection() {
		String str = "java";

		List<Character> list = new ArrayList<Character>();
		
		//for(int i = 0 ;i<str.length(); i++) {
			
		//list.add(str.charAt(i));
		for(char st : str.toCharArray()) {
			list.add(st);
			
		}
			
	 Collections.reverse(list);

list.toString();
System.out.println(list);
				
	}

}
