public class Ami3Hasher implements Hasher
{
	public String getAuthors()
	{
		return "Ami";
	}
	
	public int hash(String s)
	{
		int hashed = 0; 
		for (int x = 0; x < s.length(); x++)
		{
			hashed += (int) (s.charAt(x) * (x + 1));
		}
		hashed =  (int) Math.pow(5, hashed/(hashed-2));
		
		hashed = (int)hashed >> 3;
		
		hashed /= s.length();
		
		return (int) Math.floor(hashed);
	}
}