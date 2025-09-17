package drive;

public class UniqueChecker
{

public static void main (String[] args)
{
	System.out.println("unique(\"Julian\"): " + unique("Julian"));
	System.out.println("unique(\"paper\"): " + unique("paper"));
}

public static boolean unique(String str)
{
	for(int i = 0; i < str.length(); i++)
	{
		char currentChar = str.charAt(i);
		int count = 0;
		
		for (int j = 0; j < str.length(); j++)
		{
			if(str.charAt(j) == currentChar)
			{
				count++;
			}
		}
		
		if (count > 1)
		{
			return false;
		}
	}
	
	return true;
}

}