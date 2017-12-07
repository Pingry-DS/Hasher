
public class KrishHasher implements Hasher{
	/**
	* Sets up sum to be final hashcode value
	* Iterates through each char in the string and multiplies the sum by 17 (prime number)
	* and then adds the ascii value of the char
	* @param s String to be find hashvalue of
	* @return Hash value as an interface
	*/
	public int hash(String s){
		int sum = 0;
		for(int i = 0; i < s.length(); i ++){
			char c = s.charAt(i);
			int ascii = (int) c;
			sum *= 17;
			sum += ascii;
		}
		return sum;
	}
	public String getAuthors(){
		return "Krish Bhavnani";

	}

}
