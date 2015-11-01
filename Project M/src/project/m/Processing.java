package project.m;

import java.util.ArrayList;

public class Processing{
final double timeVarience = 1.2;//TODO
public Processing()
{
	
}
public void inputText(ArrayList<cord> grid)//takes input text and returns char's and 
{
	
	
	
	if(grid.size()==1)
	{
		System.out.println('.');
		return;
	}
	if(grid.size()==2)
	{
		System.out.println(',');
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
	getKeyStroke(swipes,grid);
	
	//swipes.remove(0);//nehemiah
	
	for(keystroke y:swipes)
	{
		System.out.println(y);
	}
	//THIS IS WHERE THE LETTER COMES OUT

	System.out.println((keyStrokeConverter.getLetter(topRow, midTop, midBot, bot, swipes)));//prints the char
}


public void getKeyStroke(ArrayList<keystroke> swipes, ArrayList<cord> grid)
{
	boolean inStroke = true;
	keystroke curentSuspected = keystroke.YSlash;
	int focus = 0;
	if(swipes.size()==0)
		inStroke = true;//change
	while(inStroke)
	{
		focus = 0;
		if(grid.get(focus).getX()==0&&grid.get(focus).getY()==0)//the 1 key
		{
			if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(grid.get(focus).getY()==1)
			{
				if(focus == grid.size()-1)
				{
					break;
				}
				focus++;
				if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
				{
					focus--;
					break;
				}
				if(grid.get(focus).getY()==3)
				{
					curentSuspected = keystroke.Backslash;
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)
					curentSuspected = keystroke.UCurve;
					focus--;
					break;
				}
				if(focus == grid.size()-1)
				{
					break;
				}
				focus++;
				if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
				{
					focus--;
					break;
				}
				if(grid.get(focus).getY()==3)
				{
					curentSuspected = keystroke.Backslash;
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)
					curentSuspected = keystroke.UCurve;
					focus--;
					break;
				}
				if(focus == grid.size()-1)
				{
					break;
				}
				focus++;
				if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
				{
					focus--;
					break;
				}
				if(grid.get(focus).getY()==3)
				{
					curentSuspected = keystroke.Backslash;
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)
					curentSuspected = keystroke.UCurve;
					focus--;
					break;
				}
				if(focus == grid.size()-1)
				{
					break;
				}
				focus++;
				if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
				{
					focus--;
					break;
				}
				if(grid.get(focus).getY()==3)
				{
					curentSuspected = keystroke.Backslash;
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)
					curentSuspected = keystroke.UCurve;
					focus--;
					break;
				}
				if(focus == grid.size()-1)
				{
					break;
				}
				focus++;
				if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
				{
					focus--;
					break;
				}
				if(grid.get(focus).getY()==3)
				{
					curentSuspected = keystroke.Backslash;
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)
					curentSuspected = keystroke.UCurve;
					focus--;
					break;
				}
				if(focus == grid.size()-1)
				{
					break;
				}
				focus++;
				if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
				{
					focus--;
					break;
				}
				if(grid.get(focus).getY()==3)
				{
					curentSuspected = keystroke.Backslash;
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)
					curentSuspected = keystroke.UCurve;
					focus--;
					break;
				}
			}
			if (grid.get(focus).getX()>0&&grid.get(focus).getY()==0)//the 2 key/ some thing on the top row
			{
				curentSuspected = keystroke.DashH;

				if(focus == grid.size()-1)
				{
					break;
				}
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
						if(grid.get(focus+1).getX()==1||(grid.size()-focus>1&&grid.get(focus+2).getX()==2))
						{
							break;
						}
						else
						{
							if(focus == grid.size()-1)
							{
								break;
							}
							focus++;
							if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
							{
								focus--;
								break;
							}
							if(grid.get(focus).getY()==2)
							{
								curentSuspected = keystroke.Unknownslash;
								if(focus == grid.size()-1)
								{
									break;
								}
								focus++;
								if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
								{
									focus--;
									break;
								}
								if(grid.get(focus).getY()==3)
									break;
							}
							
						}
					}
					else
					{
						curentSuspected = keystroke.DCurve;
						if(focus == grid.size()-1)
						{
							break;
						}
						focus++;
						if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
						{
							focus--;
							break;
						}
						
						if(grid.get(focus).getX()==2)
						{
							curentSuspected=keystroke.YSlash;
						}
						if(grid.get(focus).getX()==0)
						{
							curentSuspected = keystroke.Btop;
						}
						if(focus == grid.size()-1)
						{
							break;
						}
						focus++;
						if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
						{
							focus--;
							break;
						}
						if(grid.get(focus).getY()==3)
						{
							if(grid.get(focus).getX()>1)
								curentSuspected = keystroke.Backslash;
							else
								curentSuspected = keystroke.DCurve;
							break;
						}
						if(focus == grid.size()-1)
						{
							break;
						}
						focus++;
						if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
						{
							focus--;
							break;
						}
						if(grid.get(focus).getY()==3)
						{
							if(grid.get(focus).getX()>1)
								curentSuspected = keystroke.Backslash;
							else
								curentSuspected = keystroke.DCurve;
							break;
						}if(focus == grid.size()-1)
						{
							break;
						}
						focus++;
						if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
						{
							focus--;
							break;
						}
						if(grid.get(focus).getY()==3)
						{
							if(grid.get(focus).getX()>1)
								curentSuspected = keystroke.Backslash;
							else
								curentSuspected = keystroke.DCurve;
							break;
						}if(focus == grid.size()-1)
						{
							break;
						}
						focus++;
						if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
						{
							focus--;
							break;
						}
						if(grid.get(focus).getY()==3)
						{
							if(grid.get(focus).getX()>1)
								curentSuspected = keystroke.Backslash;
							else
								curentSuspected = keystroke.DCurve;
							break;
						}
						
					}
				}
				else if(grid.get(focus).getY()==0)
				{
					curentSuspected = keystroke.DCurve;
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					
					if(grid.get(focus).getX()==2)
					{
						curentSuspected=keystroke.YSlash;
					}
					if(grid.get(focus).getX()==0)
					{
						curentSuspected = keystroke.Btop;
					}
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)
					{
						if(grid.get(focus).getX()>1)
							curentSuspected = keystroke.Backslash;
						else
							curentSuspected = keystroke.DCurve;
						break;
					}
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)
					{
						if(grid.get(focus).getX()>1)
							curentSuspected = keystroke.Backslash;
						else
							curentSuspected = keystroke.DCurve;
						break;
					}if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)
					{
						if(grid.get(focus).getX()>1)
							curentSuspected = keystroke.Backslash;
						else
							curentSuspected = keystroke.DCurve;
						break;
					}if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)
					{
						if(grid.get(focus).getX()>1)
							curentSuspected = keystroke.Backslash;
						else
							curentSuspected = keystroke.DCurve;
						break;
					}
					
				}
			}
			
			
		}
		else if(grid.get(focus).getX()>0&&grid.get(focus).getY()==0)//it starts out on the top row but to the right of the 1 
		{
			curentSuspected = keystroke.KTop;
			if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}
			if(grid.get(focus).getX()>grid.get(focus-1).getX())
			{
				curentSuspected = keystroke.Unknownslash;
				if(focus == grid.size()-1)
				{
					break;
				}
				focus++;
				if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
				{
					focus--;
					break;
				}
				if(grid.get(focus).getY()==3)
				{
					break;
				}
				
				
			}
			if(grid.get(focus).getX()<grid.get(focus-1).getX())//its going left
			{
				if(grid.get(focus).getY()==1)//on new line which it should be
				{
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getX()<grid.get(focus-1).getX())
					{
						curentSuspected = keystroke.Forwardslash;
					}
					else if(grid.get(focus).getX()>grid.get(focus-1).getX())//going right
					{
						curentSuspected = keystroke.SCurve;
						break;
					}
					
					
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)//reached Bottom
					{
						if(grid.get(0).getX()-grid.get(focus).getX()>2)//
						{
							curentSuspected = keystroke.Forwardslash;
							break;
						}
						if(grid.get(0).getX()>1)
						{
							curentSuspected = keystroke.CCurve;
							break;
						}
						curentSuspected = keystroke.Unknownslash;
						if(focus == grid.size()-1)
						{
							break;
						}
						focus++;
						if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
						{
							focus--;
							break;
						}
						if(grid.get(focus).getY()==3)
						{
							curentSuspected= keystroke.UCurve;
						}
						focus--;
						break;
					}
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)//reached Bottom
					{
						if(grid.get(0).getX()-grid.get(focus).getX()>2)//
						{
							curentSuspected = keystroke.Forwardslash;
							break;
						}
						if(grid.get(0).getX()>1)
						{
							curentSuspected = keystroke.CCurve;
							break;
						}
					}
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)//reached Bottom
					{
						if(grid.get(0).getX()-grid.get(focus).getX()>2)//
						{
							curentSuspected = keystroke.Forwardslash;
							break;
						}
						if(grid.get(0).getX()>1)
						{
							curentSuspected = keystroke.CCurve;
							break;
						}
					}
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)//reached Bottom
					{
						if(grid.get(0).getX()-grid.get(focus).getX()>2)//
						{
							curentSuspected = keystroke.Forwardslash;
							break;
						}
						if(grid.get(0).getX()>1)
						{
							curentSuspected = keystroke.CCurve;
							break;
						}
					}
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)//reached Bottom
					{
						if(grid.get(0).getX()-grid.get(focus).getX()>2)//
						{
							curentSuspected = keystroke.Forwardslash;
							break;
						}
						if(grid.get(0).getX()>1)
						{
							curentSuspected = keystroke.CCurve;
							break;
						}
					}
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)//reached Bottom
					{
						if(grid.get(0).getX()-grid.get(focus).getX()>2)//
						{
							curentSuspected = keystroke.Forwardslash;
							break;
						}
						if(grid.get(0).getX()>1)
						{
							curentSuspected = keystroke.CCurve;
							break;
						}
					}
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)//reached Bottom
					{
						if(grid.get(0).getX()-grid.get(focus).getX()>2)//
						{
							curentSuspected = keystroke.Forwardslash;
							break;
						}
						if(grid.get(0).getX()>1)
						{
							curentSuspected = keystroke.CCurve;
							break;
						}
					}
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)//reached Bottom
					{
						if(grid.get(0).getX()-grid.get(focus).getX()>2)//
						{
							curentSuspected = keystroke.Forwardslash;
							break;
						}
						if(grid.get(0).getX()>1)
						{
							curentSuspected = keystroke.CCurve;
							break;
						}
					}
					if(focus == grid.size()-1)
					{
						break;
					}
					focus++;
					if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
					{
						focus--;
						break;
					}
					if(grid.get(focus).getY()==3)//reached Bottom
					{
						if(grid.get(0).getX()-grid.get(focus).getX()>2)//
						{
							curentSuspected = keystroke.Forwardslash;
							break;
						}
						if(grid.get(0).getX()>1)
						{
							curentSuspected = keystroke.CCurve;
							break;
						}
					}	
				}
			}
		}
		else if(grid.get(focus).getY()==2||grid.get(focus).getY()==3)//starts in the middle
		{
			curentSuspected = keystroke.DashM;
			if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}
			if(grid.get(focus).getY()<grid.get(focus-1).getY())//its going up
			{
				curentSuspected = keystroke.Btop;
				if(focus == grid.size()-1)
				{
					break;
				}
				focus++;
				if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
				{
					focus--;
					break;
				}
				if(grid.get(focus).getY()==0)
				{
					if(grid.get(focus).getX()==0)
					{
						break;
					}
					curentSuspected = keystroke.Forwardslash;
				}
			}
			else if(grid.get(focus).getY()==3)
			{
				if(grid.get(focus).getX()==0)
				{
					curentSuspected = keystroke.Bbot;
					break;
				}
				else
				{
					curentSuspected = keystroke.Kbot;
					break;
				}
			}
			if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}
			if(grid.get(focus).getY()==3)
			{
				if(grid.get(focus).getX()==0)
				{
					curentSuspected = keystroke.Bbot;
					break;
				}
				else
				{
					curentSuspected = keystroke.Kbot;
					break;
				}
			}

			if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}

			if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}

			if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}
				
		}
		else//starting from the bottom
		{
			curentSuspected = keystroke.Bbot;
			if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}
			if(grid.get(focus).getY()==3)
			{
				curentSuspected = keystroke.DashL;
			}
			else if(grid.get(focus).getX()<grid.get(focus-1).getX())
			{
				curentSuspected = keystroke.Bbot;
				if(grid.get(focus).getY()==grid.get(focus-1).getY())
				{
					break;
				}
			}
			if(grid.get(focus).getY()==0)
			{
				if(grid.get(focus).getX()-grid.get(0).getX()>1)
				{
					curentSuspected = keystroke.Forwardslash;
					break;
				}
				else if(grid.get(focus).getX()-grid.get(0).getX()<1)
				{
					curentSuspected = keystroke.Backslash;
					break;
				}
				else 
				{
					curentSuspected = keystroke.Unknownslash;
					break;
				}
			}
			if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}
			if(grid.get(focus).getY()==3)
			{
				curentSuspected = keystroke.DashL;
			}
			else if(grid.get(focus).getX()<grid.get(focus-1).getX())
			{
				curentSuspected = keystroke.Bbot;
				if(grid.get(focus).getY()==grid.get(focus-1).getY())
				{
					break;
				}
			}
			if(grid.get(focus).getY()==0)
			{
				if(grid.get(focus).getX()-grid.get(0).getX()>1)
				{
					curentSuspected = keystroke.Forwardslash;
					break;
				}
				else if(grid.get(focus).getX()-grid.get(0).getX()<1)
				{
					curentSuspected = keystroke.Backslash;
					break;
				}
				else 
				{
					curentSuspected = keystroke.Unknownslash;
					break;
				}
			}if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}
			if(grid.get(focus).getY()==3)
			{
				curentSuspected = keystroke.DashL;
			}
			else if(grid.get(focus).getX()<grid.get(focus-1).getX())
			{
				curentSuspected = keystroke.Bbot;
				if(grid.get(focus).getY()==grid.get(focus-1).getY())
				{
					break;
				}
			}
			if(grid.get(focus).getY()==0)
			{
				if(grid.get(focus).getX()-grid.get(0).getX()>1)
				{
					curentSuspected = keystroke.Forwardslash;
					break;
				}
				else if(grid.get(focus).getX()-grid.get(0).getX()<1)
				{
					curentSuspected = keystroke.Backslash;
					break;
				}
				else 
				{
					curentSuspected = keystroke.Unknownslash;
					break;
				}
			}if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}
			if(grid.get(focus).getY()==3)
			{
				curentSuspected = keystroke.DashL;
			}
			else if(grid.get(focus).getX()<grid.get(focus-1).getX())
			{
				curentSuspected = keystroke.Bbot;
				if(grid.get(focus).getY()==grid.get(focus-1).getY())
				{
					break;
				}
			}
			if(grid.get(focus).getY()==0)
			{
				if(grid.get(focus).getX()-grid.get(0).getX()>1)
				{
					curentSuspected = keystroke.Forwardslash;
					break;
				}
				else if(grid.get(focus).getX()-grid.get(0).getX()<1)
				{
					curentSuspected = keystroke.Backslash;
					break;
				}
				else 
				{
					curentSuspected = keystroke.Unknownslash;
					break;
				}
			}if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}
			if(grid.get(focus).getY()==3)
			{
				curentSuspected = keystroke.DashL;
			}
			else if(grid.get(focus).getX()<grid.get(focus-1).getX())
			{
				curentSuspected = keystroke.Bbot;
				if(grid.get(focus).getY()==grid.get(focus-1).getY())
				{
					break;
				}
			}
			if(grid.get(focus).getY()==0)
			{
				if(grid.get(focus).getX()-grid.get(0).getX()>1)
				{
					curentSuspected = keystroke.Forwardslash;
					break;
				}
				else if(grid.get(focus).getX()-grid.get(0).getX()<1)
				{
					curentSuspected = keystroke.Backslash;
					break;
				}
				else 
				{
					curentSuspected = keystroke.Unknownslash;
					break;
				}
			}if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}
			if(grid.get(focus).getY()==3)
			{
				curentSuspected = keystroke.DashL;
			}
			else if(grid.get(focus).getX()<grid.get(focus-1).getX())
			{
				curentSuspected = keystroke.Bbot;
				if(grid.get(focus).getY()==grid.get(focus-1).getY())
				{
					break;
				}
			}
			if(grid.get(focus).getY()==0)
			{
				if(grid.get(focus).getX()-grid.get(0).getX()>1)
				{
					curentSuspected = keystroke.Forwardslash;
					break;
				}
				else if(grid.get(focus).getX()-grid.get(0).getX()<1)
				{
					curentSuspected = keystroke.Backslash;
					break;
				}
				else 
				{
					curentSuspected = keystroke.Unknownslash;
					break;
				}
			}if(focus == grid.size()-1)
			{
				break;
			}
			focus++;
			if(isApart(grid.get(focus),grid.get(focus-1)))//they are more than 1 apart
			{
				focus--;
				break;
			}
			if(grid.get(focus).getY()==3)
			{
				curentSuspected = keystroke.DashL;
			}
			else if(grid.get(focus).getX()<grid.get(focus-1).getX())
			{
				curentSuspected = keystroke.Bbot;
				if(grid.get(focus).getY()==grid.get(focus-1).getY())
				{
					break;
				}
			}
			if(grid.get(focus).getY()==0)
			{
				if(grid.get(focus).getX()-grid.get(0).getX()>1)
				{
					curentSuspected = keystroke.Forwardslash;
					break;
				}
				else if(grid.get(focus).getX()-grid.get(0).getX()<1)
				{
					curentSuspected = keystroke.Backslash;
					break;
				}
				else 
				{
					curentSuspected = keystroke.Unknownslash;
					break;
				}
			}
		}
		focus++;
		break;
	}
	swipes.add(curentSuspected);//adds what it thinks the keystroke is to the array
	System.out.println(swipes.get(0));
	if(focus==0)
	{
		grid.remove(0);
	}
	while(focus>0)
	{
		focus--;
		grid.remove(0);
	}
	
	if(grid.size()>1)
	{
		shift(grid);
		getKeyStroke(swipes,grid);//recirsion//Nehemiah's going to fix it
	}
}

boolean isApart(cord a, cord b)
{
	return  (a.getX()-b.getX()>1||b.getX()-a.getX()>1||a.getY()-b.getY()>1||b.getY()-a.getY()>1);
}

public static void shift(ArrayList<cord> cordinates)//shifts to leftmost position
{
	if(cordinates.size()>0)
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
}
