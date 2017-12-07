/**
* Joseph Beatty
* 12/6/17
* Hash function class
*
*/
public class HashFunction implements Hasher
{
  /**
  * Hash function makes the String into an int by getting the sum of every characters
  * ascii value and then returning that value to the third power.
  */
  public int hash(String s)
  {
    int index = 0;
    int sum = 0;
    while(index < s.length())
    {
      sum += (int) s.charAt(index);
      index++;
    }
    return (int) Math.pow(sum, 3);
  }

  public String getAuthors()
  {
    return "Joseph Beatty";
  }

}
