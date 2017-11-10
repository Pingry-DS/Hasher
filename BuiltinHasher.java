public class BuiltinHasher implements Hasher {

  public String getAuthors(){return "Standard Library";}

  public int hash(String s){
    return s.hashCode();
  }
}
