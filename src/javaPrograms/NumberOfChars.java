package javaPrograms;

public class NumberOfChars {

	public static void main(String[] args) {
		String str="The best of both worlds";
		int count = 0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=' ') {
										count++;
				
									}
			
			
			
			}
		System.out.println(count);
	}

}
