import java.util.Scanner;

public class CountVowelsConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.out.println("Enter a String ");
		System.out.println("Enter a String ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char[] c=s1.toCharArray();
		int vowelcount=0;
		int constantcount=0;
		for(int i = 0; i <c.length; i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				vowelcount++;
			}
			else 
				constantcount++;
		}
		
		System.out.println("Vowel count is "+vowelcount+"  Constant count is "+constantcount);

	}

}
