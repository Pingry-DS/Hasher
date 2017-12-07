public class TomHasher implements Hasher
{
  private int r;

  public TomHasher()
  {
    r = 0;

  }
  public int hash(String s)
  {
    int lengthValue = (s.length() * 10000) - 10000; //String of 1 length starts at 0
    int firstLetterValue = (int) (s.charAt(0) * 100) - 6500; //Subtracting ascii value of A
    int secondLetterValue = (int) s.charAt(1) - 65;

    r = lengthValue + firstLetterValue + secondLetterValue;
    return r;





  }

  public String getAuthors()
  {
    return "Tom";
  }

}
