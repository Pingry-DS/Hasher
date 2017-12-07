public class HashSet
{
  private int size;
  private String[] arr;

  public HashSet()
  {
    size = 15;
    arr = new String[size];
  }

  public void put(String str)
  {
    int hashValue = hashCode(str) % size;
    while (arr[hashValue] != null)
    {
      if (hashValue >= size - 1)
        hashValue = 0;
      else
        hashValue++;
    }
    arr[hashValue] = str;
  }

  public boolean contains(String str)
  {
    int hashValue = hashCode(str) % size;
    int counter = 1;
    while ((arr[hashValue] != str) && (counter < size))
    {
      if (hashValue >= size - 1)
        hashValue = 0;
      else
        hashValue++;
      counter++;
    }
    if (counter < 15)
      return true;
    else
      return false;
  }

  public int hashCode(String str)
  {
    return str.length();
  }

  public String toString()
  {
    String str = "{";
    for (int i = 0; i < arr.length - 1; i++)
    {
      str += arr[i] + ", ";
    }
    str += arr[arr.length - 1];
    str += "}";
    return str;
  }

  public int hash(String s)
  {
    int num = 0;
    for (int i = 0; i < s.length(); i++)
    {
      num += (int)(s.charAt(i));
    }
    return (int)((Math.pow(num, 3)) % 10);
  }

  public String getAuthors()
  {
    return "Ascii values cubed: by Jeremy Newman";
  }
}
