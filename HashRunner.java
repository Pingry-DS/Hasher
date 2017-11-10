import java.util.List;
import java.util.ArrayList;

public class HashRunner {
    private static List<Hasher> students;
    private static List<String> words;


    public static void main(String [] args){
        // Load the hashers
        students = loadHashers();

        // Read words in from file
        //String filename
        words = loadWords();

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
            if(hashTable[hashcode%size] != 0)
                collisions++;
            else
            {
                hashTable[hashcode%size] = hashcode;
            }
        }
        return collisions;
    }


    private static List<Hasher> loadHashers(){
       List<Hasher> hashers = new ArrayList<>();

       hashers.add(new SumHasher());
       hashers.add(new LengthHasher());

       return hashers;
    }

    private static List<String> loadWords()
    {
        List<String> words = new ArrayList<>();
        words.add("dog");
        words.add("god");
        words.add("trophy");
        words.add("tree");
        words.add("bear");
        words.add("leak");
        words.add("fish");
        words.add("caller");
        words.add("lake");
        words.add("turing");
        words.add("cellar");
        words.add("cat");
        words.add("spongebob");
        words.add("egoes");
        words.add("psychology");
        words.add("recall");
        words.add("goes");
        words.add("supercalifragilisticexpialidocious");
        words.add("onomatopoeia");
        words.add("together");
        words.add("aches");
        words.add("face");
        words.add("eggplant");
        words.add("thaw");
        words.add("what");
        words.add("faceplant");
        words.add("cafe");
        words.add("facepalm");
        words.add("its");
        words.add("sit");
        words.add("language");
        words.add("xylophone");
        words.add("pterodactyl");
        words.add("bologna");
        words.add("orangatang");
        words.add("shall");
        words.add("halls");
        words.add("orange");
        words.add("cosmic");
        words.add("comics");
        words.add("kale");
        words.add("vase");
        words.add("save");
        words.add("dew");
        words.add("wed");
        words.add("rebuild");
        words.add("builder");
        words.add("Pneumonoultramicroscopicsilicovolcanoconiosis");
        words.add("icon");
        words.add("coin");
        //words.add("none");
        words.add("neon");
        words.add("cast");
        words.add("acts");
        words.add("cats");
        words.add("relay");
        words.add("layer");
        words.add("early");
        words.add("eats");
        words.add("seat");
        words.add("teas");
        return words;
    }

}
