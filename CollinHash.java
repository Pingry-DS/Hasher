public class CollinHash implements Hasher {
	public int hash(String s) {
		double hash = 0;
		int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
		for(int i = 0; i < s.length(); i++) {
			hash = hash*primes[i%primes.length] + s.charAt(i)*primes[i%primes.length];
		}
		return (int)(hash % Integer.MAX_VALUE);
	}
	public String getAuthors() {
		return "Collin";
	}
}