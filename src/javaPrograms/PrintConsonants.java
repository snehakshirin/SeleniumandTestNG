package javaPrograms;

import java.util.Arrays;
import java.util.List;

public class PrintConsonants {
	
	public static void main(String[] args) {
		
		String name="sneha nalla";
		char[] nameArray=name.toCharArray();
		for(char letter :nameArray) {
			if(letter!='a' && letter!='e'&& letter!='i' && letter!='o' &&letter!='u' ) {
				System.out.print(letter);
				
			}
		}
	}

}
