
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String str
	            = "The quick brown fox jumps over the lazy dog";
	 
	        if (checkPangram(str) == true)
	            System.out.print(str + " \nis a pangram.");
	        else
	            System.out.print(str + " \nis not a pangram.");
	    
	}
	public static boolean checkPangram(String str)
    {
		str=str.toLowerCase();
        
        boolean[] mark = new boolean[26];
 
        
        int index = 0;
 
        // Traverse all characters
        for (int i = 0; i < str.length(); i++) {
            
          if ('a' <= str.charAt(i)
                     && str.charAt(i) <= 'z')
 
                index = str.charAt(i) - 'a';
 
            // If this character is other than english
            // lowercase and uppercase characters.
            else
                continue;
            mark[index] = true;
        }
 
        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
 
        // If all characters were present
        return (true);
    }
 

}
