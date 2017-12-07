public class HasherBeckmen<E> implements Hasher
{
  Object[] data;
  int length;

  public HasherBeckmen()
  { length = 15;
    data = new Object[15]; }

  public HasherBeckmen(int length)
  { this.length = length;
    data = new Object[length]; }

  public String printArr()
  { String a = new String("{");
    for (int i = 0; i < length; i++)
      a += data[i] + ", ";
    a += "}";
    return a;
  }

  public void put(E n)
  {
    int hash = n.hashCode() % length; //will call the correct hash code based on the parameterized type
    if (data[hash] == null)
    { data[hash] = n; }

    else {
      System.out.println("Collision");
      boolean located = false;

      for (int i = hash; i < length; i++) {
        if (data[i] == null) {
          data[i] = n;
          located = true;
          break;
        }
      }
      //going back around to the front of the array
      if (!located) {
        for (int i = 0; i < hash; i++) {
          if (data[i] == null) {
            data[i] = n;
            break;
          }
        }
      }
    }
  }

  public boolean contains(E x)
  {
    int hash = x.hashCode() % length;
    if (x.equals(data[hash]))
      return true;

    //need to loop through according to linear probing scheme
    else
    {
      for (int i = hash; i < length; i++)
      {
        if (x.equals(data[i]))
          return true;
      }
      //only make it this far if you havent' found it yet (looping back around the other side)
      for (int h = 0; h < hash; h++)
      {
        if (x.equals(data[h]))
          return true;
      }
    }
    return false;
  }

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
    return "Drew Beckmen";
  }
}
