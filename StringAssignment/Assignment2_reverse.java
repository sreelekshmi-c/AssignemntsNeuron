import java.util.Arrays;

public class Assignment2_reverse {
//WAP to reverse a sentence while preserving the position.
	public static void main(String[] args) {
		String s1="Think Twice";
		String a[]=s1.split(" ");
		String s2="";
		System.out.println(Arrays.asList(a));
		for (int i=0;i<a.length;i++)
		{
			String s3=a[i];
			//System.out.println("s3"+s3);
			for (int j=s3.length()-1;j>=0;j--)
			{
				s2=s2+s3.charAt(j);
				//System.out.println(s2);
			}
			s2=s2+ " ";
			
		}
		System.out.println(s2);
	}
	
}
