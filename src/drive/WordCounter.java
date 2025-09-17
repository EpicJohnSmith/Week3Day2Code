package drive;

public class WordCounter
{
    public static void main(String[] args)
    {
        String text = "I am the way, the truth, and the life.";

        System.out.println("Text: \"" + text + "\"");
        System.out.println("occurrence of \"the\": " + Occurrence(text, "the"));        
        System.out.println("occurrence of \"way\": " + Occurrence(text, "way"));     
        System.out.println("occurrence of \"holy\": " + Occurrence(text, "holy"));
    }
	
    public static int Occurrence(String str, String word)
    {
        if (str == null || word == null || word.isEmpty()) //AI HELPED ME HERE, not sure why it'd do this.
        {
            return 0;
        }

        // Convert both to lowercase
        str = str.toLowerCase();
        word = word.toLowerCase();

        int count = 0;
        int index = str.indexOf(word);
        while (index != -1)
        {
            count++;
            // Move index forward to look for next occurrence
            index = str.indexOf(word, index + word.length());
        }

        return count;
    }
 }