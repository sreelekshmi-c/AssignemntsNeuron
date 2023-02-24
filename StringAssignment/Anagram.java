import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Input: str1 = “listen”  str2 = “silent”
		//An anagram of a string is another string that contains the same characters,
		//only the order of characters can be different. 
		System.out.println("Enter first String");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("Enter second String");
		String s2=sc.nextLine();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("not anagram");
			//break;
		}
		else
		{
			char[] firstString=reverseString(s1);
		//	System.out.println(firstString);
			char[] SecondString= reverseString(s2);
		//	System.out.println(SecondString);
			String sorts1=new String(firstString);
			String sorts2=new String(SecondString);
			//System.out.println(sorts1 + "   "+sorts2);
			if(sorts1.equalsIgnoreCase(sorts2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not an angram");
			}
			
		}
		
		
	}
	public static char[] reverseString(String s)
	{
		char temp=0;
		char a[]=s.toLowerCase().toCharArray();
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		//System.out.println("Reverse String "+Arrays.toString(a));
		return a;
		//
		
	
	}

}
