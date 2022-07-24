//Grind 75 problem 5
//checks for a valid palindrome

import java.util.*;

class Valid_Palindrome_5{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string > s = ");
		String s = in.next();
		s = s.toLowerCase();
		char[] phrase = s.toCharArray();
		int i = 0;
		int j = phrase.length - 1;
		boolean valid = true;
		while(i != j){
			if(!Character.isLetterOrDigit(phrase[i])){
				i++;
				j--;
			}
			else if(Character.isLetterOrDigit(phrase[i])){
				if(phrase[i] != phrase[j]){
					valid = false;
					break;
				}
				else if(phrase[i] == phrase[j]){
					valid = true;
					i++;
					j--;
				}
			}
		}
		System.out.println(valid);
	}
}
