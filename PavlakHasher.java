
import java.lang.Math;
/**
* Class that implements hasher and is an attempt at creating a hash function
* for Strings with minimal collisions.
*/
public class PavlakHasher implements Hasher
{
  /**
  * Returns a distinct int value for a given string
  * @return int a distinct and repeatable int value that corresponds to a String
  */
  public int hash(String s)
  {
    int sum = 0;
    for(int i = 0; i<s.length(); i++)
    {
      sum = (sum - ((int) s.charAt(i)) ) * 67; //overflows change the sign
    }
    return Math.abs(sum);
  }
  /**
  * returns the authors of this program as a string
  * @return "Mitchell Pavlak and Pingry's Data Structure's class"
  */
  public String getAuthors()
  {
    return "Mitchell Pavlak";
  }
}
