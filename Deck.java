import java.util.*;

public class Deck {
	ArrayList<Card> deck = new ArrayList<Card>();
	ArrayList<Card> removed = new ArrayList<Card>();
	int pos = 0;
	
	public Deck()
	{
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= 13; j++)
			{
				deck.add(new Card(j, i));
				pos++;
			}
		}
	}
	
	public void shuffle(){
		Collections.shuffle(deck);
	}
	
	public void removeFromDeck()
	{
		
	}
	
	public String toString()
	{
		String result = "";
		for (int i = 0; i < deck.size(); i++)
		{
			result += deck.get(i);
			if (i != deck.size() - 1)
			{
				result += "\n";
			}
		}
		return result;
	}
	
	
}
