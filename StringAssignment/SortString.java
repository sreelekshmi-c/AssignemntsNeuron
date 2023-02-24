import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char[] c=s1.toCharArray();
		
	Arrays.sort(c);
System.out.println(c);			
		}
	

}
