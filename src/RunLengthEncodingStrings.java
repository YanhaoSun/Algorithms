public class RunLengthEncodingStrings
{
    public static void printRLE(final String input)
    {
        int N = input.length();
        char[] array = input.toCharArray();
        int count=0;
        StringBuilder store = new StringBuilder();
        char now;
        now = array[0];
        for(int i=0; i<N; i++)
        {
            if(array[i]==now)
            {
                count++;
            }
            else
            {
                store.append(now);
                store.append(count);
                count = 1;
            }
            now = array[i];
        }

        store.append(now);
        store.append(count);
        System.out.println(store);
    }
    public static void main(String[] args) {
        RunLengthEncodingStrings.printRLE("Home is where the heart is");
    }
}