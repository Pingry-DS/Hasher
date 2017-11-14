public class BestHasherZhang implements Hasher {

  public String getAuthors(){return "Zhang";}


  public int hash(String s){
    int numOfConsonants = 0;
    for(int i = 1; i <= s.length(); i++){
      if( !s.substring(i-1, i).equals("a") || !s.substring(i-1, i).equals("e") ||
          !s.substring(i-1, i).equals("i") || !s.substring(i-1, i).equals("o") || !s.substring(i-1, i).equals("u")){
        numOfConsonants++;
      }
    }
    int firstLetter = (int) s.charAt(0);
    int sum = firstLetter ^ firstLetter;
    sum = sum >> firstLetter;
    return sum;
  }
}
