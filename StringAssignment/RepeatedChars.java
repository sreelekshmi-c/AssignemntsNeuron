import java.util.Scanner;

public class RepeatedChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char[] c=s1.toCharArray();
		int count ;
		for(int i = 0; i <c.length; i++) {
			 count=1;
			for (int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count ++;
					c[j]='0';
					
				}
			}
			
		
		if(count>1 && c[i]!='0')
		{
			System.out.println(c[i]);
		}
		}
		

	}

}
