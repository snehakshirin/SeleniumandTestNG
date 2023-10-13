package javaPrograms;

public class Strings {

	public static void main(String[] args) {
		//String is immutable;
		String str="code";
		str=str+"verse";
		System.out.println(str);	
		
		//StringBulider is mutable but not thread safe
		StringBuilder str1= new StringBuilder();
		str1.append("StringBuilder");
		str1.append(" is mutable");
		System.out.println(str1);
		
		//StringBuffer is  mutable and thread safe
		StringBuffer str2=new StringBuffer();
		str2.append("StringBuffer is ");
		str2.append("Thread safe");
		System.out.println(str2);


		
	}
	
}
