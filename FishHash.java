import java.util.Map;
public class FishHash implements Hasher{
	
	//uses a caesar cipher with a fish
	private String fish = "><(((.>";
	
	public int hash(String s){
		
		int sum = 0;
		int n;
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			n = (int) c;
			n += (int)(fish.charAt(i%7));
			n = n % 255;
			sum += n*(Math.pow(10, i));
		}
		return sum - s.length() + (int) s.charAt(0);
		
		
	}
	
	public String getAuthors(){
		return "Jenny";
	}
	
	
	
}