import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();

String s2="";
for (int i=s1.length()-1;i>=0;i--)
{
	s2=s2+s1.charAt(i);
}
System.out.println(s2);
	}

}
