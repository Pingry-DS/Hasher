/*
@author Arnav Agrawal
My own hash function that takes in a String and return an int
*/

public class ArnavHasher implements Hasher
{

/*
* Takes the ASCII value of the first 3 characters, or the first n characters if the
*  String length is less than 3
* Puts the ASCII value of the next char onto the first char
* So "AND" would be hashed to 657868 because the ASCII value of 'A' is 65, of 'N' is
* 78, and of 'D' is 68
* Can't do any more than 3 characters because that might put the resultant hash value
* over the MAX limit of an int
* @param s: The String that is to be hashed
* @return the hash value of the string
*/
  public int hash(String s)
  {
    if (s.length() == 1)
    {
      char character = s.charAt(0);
      int result = (int)character;
      return result;
    }

    else if (s.length() == 2)
    {
      String hashValue = "";
      char character = s.charAt(0);
      int ascii = (int) character;
      hashValue += ascii;
      char character2 = s.charAt(1);
      int ascii2 = (int) character2;
      hashValue += ascii2;
      int result = Integer.parseInt(hashValue);
      return result;
    }
    else if (s.length() >= 3)
    {
      String hashValue = "";
      char character = s.charAt(0);
      int ascii = (int) character;
      hashValue += ascii;
      char character2 = s.charAt(1);
      int ascii2 = (int) character2;
      hashValue += ascii2;
      char character3 = s.charAt(2);
      int ascii3 = (int) character3;
      hashValue += ascii3;
      int result = Integer.parseInt(hashValue);
      return result;
    }
    return 0;
  }

/*
* Returns the author of the hash function
* @return The author of the hash function
*/
  public String getAuthors()
  {
    return "Arnav Agrawal";
  }

}
