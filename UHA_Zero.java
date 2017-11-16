
public class UHA_Zero implements Hasher{
    @Override
    public int hash(String s) {
        int sum = 0;
        for(int i = 1; i <= s.length(); i++){
            sum += i * Character.getNumericValue(s.charAt(i - 1));
        }
        sum =  sum >> s.hashCode();
        return sum;
    }

    @Override
    public String getAuthors() {
        return "Bert";
    }
}
