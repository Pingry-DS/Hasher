

public class JackHasher implements Hasher
{
  String[] sauce;

  public JackHasher(int i)
  {
    sauce = new String[i];
  }

  public JackHasher()
  {
    sauce = new String[15];
  }

  public void put(String s)
  {
    int hx = hash(s);
    int temp = hx;
    boolean is = true;
    if (contains(s))
    {
      is = false;
    }
    if(sauce[hx] == null)
    {
      sauce[hx] = s;
    }
    else
    {
      int count = hx;

      while(count < sauce.length && sauce[count] != null)
      {
        count++;
      }
      if(count < sauce.length)
      {
        sauce[count] = s;
        is = false;
      }
      for(int i = 0; i < temp; i++)
      {
        if(sauce[i] == null && is == true)
        {
          sauce[i] = s;
          is = false;
        }
      }

    }
  }

  public boolean contains(String f)
  {
    int hc = hash(f);
    for(int i = hc; i < sauce.length; i++)
    {
      if(sauce[i] != null && sauce[i].equals(f))
        return true;
    }
    for(int j = 0; j < hc; j++)
    {
      if(sauce[j] != null && sauce[j].equals(f))
        return true;
    }
    return false;

  }


  public int hash(String s)
  {
    double f = Math.sqrt(s.hashCode());

    double soFar = f * s.charAt(s.length() - 1);

    while(soFar >= sauce.length)
    {
      soFar *= f;
      soFar %= sauce.length;
    }

    return (int)soFar;
  }

  public String toString()
  {
    String output = "{ ";
    for(int i = 0; i < sauce.length - 1; i++)
    {
      output += sauce[i] + ", ";
    }
    output += sauce[sauce.length - 1] + " }";

    return output;
  }

  public String getAuthors()
  {
    return "Jack Gambello";
  }

}
