import java.util.Scanner;

public class CountSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char[] c=s1.toCharArray();
		int specialchars = 0;
		for(int i = 0; i <c.length; i++) {
			if(!((c[i]>='A'&& c[i]<='Z')||(c[i]>='a'&& c[i]<='z')||(c[i]>='0'&&c[i]<='9')))
			{
				specialchars++;
			}
			
	}
		System.out.println("Special character count is "+specialchars);
}
}
