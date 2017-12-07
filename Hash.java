/**
*
* @author Wallace Truesdale
* @date 12/6/17
*
*/

public class Hash implements Hasher
{

  public int hash(String entry)
  {
    int change = (((int)(Math.pow(entry.length(), 3))) % 10);
    int change2 = (change + (int)entry.charAt(0)) % 10;
    return change2;
  }

  public String getAuthors()
  {
    String name = "Wallace";
    return name;
  }

}
