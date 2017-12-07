
public class DillonHasher implements Hasher
{
	public int hash(String s)
    {
        int returnVal = 0;
        int temp = 0;
        for(int i = 0; i < s.length() - 1; i++)
        {
            temp = (int) s.charAt(i);
            temp = temp % 13;
            returnVal = returnVal + temp;
        }
        returnVal = returnVal % 40;
        return returnVal;
    }
	public String getAuthors()
	{
		return "Dillon Shu";
	}
}