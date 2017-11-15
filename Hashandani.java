public class Hashandani implements Hasher
{
	public String getAuthors()
	{
		return "Ami";
	}
	
	public int hash(String s)
	{
		int hashed = 0;
		int finalHash = 0;
		
		for (int x = 0; x < s.length(); x++)
		{
			hashed = (int) s.charAt(x);
			hashed = hashed % 17;
			hashed *= Math.pow(17, x);
			finalHash += hashed;
		}
		//System.out.println(finalHash);
		return finalHash;
		
	}
}