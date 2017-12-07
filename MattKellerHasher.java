
public class MattKellerHasher implements Hasher
{

  public int hash(String s)
  {
    double i = Math.abs(s.hashCode());
    i = i/1000000;

    for (int j = 0; j < s.length() % 7; j++)
      i *= (int) s.charAt(j);
    i += s.length();
    i *= i;
    i = i/ 506509876;
    
    if (i * 1000000 < Integer.MAX_VALUE)
      return (int) (i * 1000000);
    else
      {
        i = Math.ceil(i);

        i = (int) i;

        //k = k % 1000;
        return (int) i;
      }
  }

  public String getAuthors()
  {
    return "Matt 'The Endatron' Keller";
  }
}
