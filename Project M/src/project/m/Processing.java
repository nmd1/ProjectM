package project.m;

import java.util.ArrayList;

public class Processing{
String text;
final double timeVarience = 1.2;//TODO
public Processing()
{
	text = "";
}
public void inputText(ArrayList<cord> grid)//takes input text and returns char's and 
{
	if(grid.size()==1)
	{
		text+=".";
		return;
	}
	if(grid.size()==2)
	{
		text+=",";
		return;
	}
	int topRow = 0;
	int midTop = 0;
	int midBot = 0;
	int bot = 0;
	
	for(cord s:grid)
	{
		if(s.getY()==0)
		{
			topRow++;
		}
		else if(s.getY()==1)
		{
			midTop++;
		}
		else if(s.getY()==2)
		{
			midBot++;
		}
		else
		{
			bot++;
		}
	}
	
	shift(grid);//makes it all left bound
	ArrayList<keystroke> swipes = new ArrayList<keystroke>();
	
	text+=keyStrokeConverter.getLetter(topRow, midTop, midBot, bot, swipes);
}


public void getKeyStroke(ArrayList<keystroke> swipes, ArrayList<cord> grid)
{
	boolean inStroke = true;
	keystroke curentSuspected = keystroke.YSlash;
	int focus = 0;
	while(inStroke)
	{
		focus = 0;
		if(grid.get(focus).getX()==0&&grid.get(focus).getY()==0)//the 1 key
		{
			focus++;
			if (grid.get(focus).getX()>0&&grid.get(focus).getY()==0)//the 2 key/ some thing on the top row
			{
				curentSuspected = keystroke.DashH;
				focus++;
				if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
				{
					focus--;
					break;
				}
				if(grid.get(focus).getY()==1)
				{
					if(grid.get(focus).getX()<grid.get(focus-1).getX())
					{
						curentSuspected = keystroke.Btop;
					}
				}
			}
			
			
		}
	}
	swipes.add(curentSuspected);//adds what it thinks the keystroke is to the array
	while(focus>0)
	{
		focus--;
		grid.remove(0);
	}
}

boolean isApart(cord a, cord b)
{
	return  (a.getX()-b.getX()>1||b.getX()-a.getX()>1||a.getY()-b.getY()>1||b.getY()-a.getY()>1);
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
