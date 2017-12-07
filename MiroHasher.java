public class MiroHasher implements Hasher
{

	/**
	 * Calculates a custom hash of a String
 	* @param s The string to be hashed
 	* @return The hash value as an int
	 */

	public int hash(String s)
	{
		char character = s.charAt(0);
		char character2 = s.charAt(s.length()-1);
		int ascii = (int) character;
		int ascii2 = (int) character2;
		return ascii + ascii2;
	}
	
	/**
 	* Credit the author or author of the hash algo
 	* May also include the name of the algo
 	* Should not exceed ~40 characters.
 	* @return The authors(s) and optionally description
	 */
	public String getAuthors()
	{
		return "Author: Miroslav Bergam";
	}
}