import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HashRunner {
    private static List<Hasher> students;
    private static List<String> words;


    public static void main(String [] args) throws FileNotFoundException {
        // Load the hashers
        students = loadHashers();

        // Read words in from file
        String filename = "100Words.txt";
        if (args.length > 0) {
          filename = args[0];
        }

        words = loadWords(filename);

        // Test each of the hashers
        for(Hasher h : students)
        {
            System.out.println(h.getAuthors() + " " + testHash(100, h)); //change first parameter to change hashtable size
        }
    }

    private static int testHash(int size, Hasher stdnt){
        int collisions = 0;
        int [] hashTable = new int [size];
        for(int j = 0; j < words.size(); j++)
        {
            int hashcode = Math.abs(stdnt.hash(words.get(j)));
            if(hashTable[hashcode%size] == 1)
                collisions++;
            else
            {
                hashTable[hashcode%size] = 1;
            }
        }
        return collisions;
    }


    private static List<Hasher> loadHashers(){
       List<Hasher> hashers = new ArrayList<>();

       hashers.add(new SumHasher());
       hashers.add(new LengthHasher());
       hashers.add(new BuiltinHasher());
       hashers.add(new ProudHasher());

       return hashers;
    }

    private static List<String> loadWords(String filename) throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        Scanner s = new Scanner(new File(filename));

        while (s.hasNextLine()){
            words.add(s.nextLine());
        }

        s.close();
        return words;
    }

}
