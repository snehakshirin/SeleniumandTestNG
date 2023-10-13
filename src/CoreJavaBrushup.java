import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] names= {"sneha","nalla"};
//		
//		for(String n: names){
//			System.out.println(n);
//			}
//		
//		List<String> locations =  Arrays.asList("india","usa");
//		locations.forEach(System.out::println);
//		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<numbers.length;i++) {
			if((numbers[i])%2 == 0){
					System.out.println(numbers[i]);
					}
		}
		
		
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("sneha");
//		names.add("teja");
//		for(int i=0;i<names.size();i++) {
//		System.out.println(names.get(i));
//		}
//		
//		for( String val: names) {System.out.println(val);}
//		System.out.println(names.contains("sneha"));
		
		String fullname ="sneha nalla";
		String[] splittednames = fullname.split(" ");
		
		for(  String val : splittednames){System.out.println(val);}
				
	}	

}
