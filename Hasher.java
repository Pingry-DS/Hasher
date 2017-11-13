public interface Hasher {

  /**
   * Calculates a custom hash of a String
   * @param s The string to be hashed
   * @return The hash value as an int
   */
  public int hash(String s);

  /**
   * Credit the author or author of the hash algo
   * May also include the name of the algo
   * Should not exceed ~40 characters.
   * @return The authors(s) and optionally description
   */
  public String getAuthors();

}
