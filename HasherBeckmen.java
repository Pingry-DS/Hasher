public class HasherBeckmen
{
  /*This will return a unique hash for every set of n numbers where n is the length of the hash set
  The pattern repeats for every set of n numbers.*/
  public int hash(String s)
  {
    double hash = s.length();
    hash = Math.pow(hash, 3);
    hash = hash % length;
    return (int) hash;
  }

  public String getAuthors()
  {
    return "Introduced by Ms. Thuzar - every value from 0 to (length - 1) will hash to a unique value.";
  }
}