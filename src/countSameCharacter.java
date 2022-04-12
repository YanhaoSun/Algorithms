import java.util.HashMap;

public class countSameCharacter
{
    private static final int R    = 256;

    public static void printRLE(final String input)
    {
        int N = input.length();
        char[] array = input.toCharArray();
        int[] count = new int[R+1];
        HashMap<Character, Integer> myMap = new HashMap<>();
        for(int i=0; i<N; i++)
        {
            if(!myMap.keySet().contains(array[i])){
                myMap.put(array[i], 1);
            }
            else {
                int occurence = myMap.get(array[i]);
                occurence += 1;
                myMap.put(array[i], occurence);
            }
        }
        for(char key : myMap.keySet())
        {
            System.out.println("%d%c".formatted(myMap.get(key), key));
        }
    }
    public static void main(String[] args) {
        RunLengthEncodingStrings.printRLE("Homeiswheretheheartis");
    }
}

//for(int i=0; i<R; i++)
//        {
//        count[i+1] += count[i];
//        }}
