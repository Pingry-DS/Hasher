public class LengthHasher implements Hasher {

  public String getAuthors(){return "Orndorff";}

  public int hash(String s){return s.length();}
}
