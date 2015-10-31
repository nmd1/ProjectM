package project.m;

import java.util.ArrayList;

public class Processing{
String text;
final double timeVarience = 1.2;//TODO
public Processing()
{
	text = "";
}
public char inputText(ArrayList<cord> grid)
{
	shift(grid);//makes it all left bound
	ArrayList<keystroke> swipes = new ArrayList<keystroke>();
	
	
	return 'a';
}


public static void shift(ArrayList<cord> cordinates)//shifts to leftmost position
{
	int smallestX = cordinates.get(0).getX();
	for(cord s:cordinates)//calculates the smallest x value in the array
	{
		if(s.getX()<smallestX)
		{
			smallestX = s.getX();
		}
	}
	
	if(smallestX>0)
	{
		for(cord s:cordinates)//Moves all elements to the left until one of them is left most
		{
			s.setX(s.getX()-smallestX);
		}
	}
}
}
