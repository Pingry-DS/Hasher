public class BestHasherZhang implements Hasher {

  public String getAuthors(){return "Zhang";}


  public int hash(String s){

    int firstLetter = (int) s.charAt(0);
    int sum = firstLetter ^ firstLetter;
    sum = sum >> firstLetter;
    return sum;
  }
}
