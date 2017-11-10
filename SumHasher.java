public class SumHasher implements Hasher {

  public String getAuthors(){return "Orndorff";}

  public int hash(String s){
    int sum = 0;
    for (int i = 0; i < s.length(); i++){
      sum += (int) s.charAt(i);
    }
    return sum;
  }
}
