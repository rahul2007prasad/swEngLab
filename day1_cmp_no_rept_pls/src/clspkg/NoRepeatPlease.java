package clspkg;

/*
 * Return the number of total permutations of the provided string that
 *  don't have repeated consecutive letters.
 *  Assume that all characters in the provided string are each unique.
 */
public class NoRepeatPlease {
	/*
	 * public static void main(String [] args) {
	 * 
	 * }
	 */

	public void noRepeat(String str)
	{
	
		int strLen = str.length();
		
		for(int i = 0 ; i < strLen ; i++)
		{
			for(int j = i+1 ; j < strLen ; j++)
			{
				if(str.charAt(i) == (str.charAt(j)))
					break;
				
					
			}
		}
		
		
	}

}
