package project.m;
import java.util.ArrayList;

public class keyStrokeConverter {
	static char getLetter(int topRowKeys, int midTopRowKeys, int midBotRowKeys, int botRowKeys, ArrayList<keystroke> swipes)
	{
		if(swipes.size()>5)//default
			return ' ';
		if(swipes.size()==1)
		{
			if(swipes.get(0)==keystroke.UCurve)
			{
				return 'L';
			}
		}
		if(swipes.get(0)==keystroke.Backslash||swipes.get(0)==keystroke.Forwardslash||swipes.get(0)==keystroke.Unknownslash)//starts with a line
		{
			if(swipes.contains(keystroke.Forwardslash)&&swipes.contains(keystroke.Backslash)&&swipes.contains(keystroke.DashM))//capital A
			{
				return 'A';
			}
			if(swipes.contains(keystroke.Bbot)&&swipes.contains(keystroke.Btop))//capital B
			{
				return 'B';
			}
			if(swipes.contains(keystroke.DCurve))//capital D
			{
				return 'D';
			}
			if(swipes.contains(keystroke.DashM))//H or E or F
			{
				if(swipes.contains(keystroke.DashH))//E or F
				{
					if((swipes.indexOf(keystroke.DashM)!=swipes.lastIndexOf(keystroke.DashM))||swipes.contains(keystroke.DashL))//E
					{
						return 'E';
					}
					return 'F';
				}
				if(swipes.lastIndexOf(keystroke.Backslash)>0||swipes.lastIndexOf(keystroke.Forwardslash)>0||swipes.lastIndexOf(keystroke.Unknownslash)>0)//H
				{
					return 'H';
				}
			}
			if(swipes.contains(keystroke.Kbot)&&swipes.contains(keystroke.KTop))
			{
				return 'K';
			}
			if(swipes.contains(keystroke.Btop)&&swipes.contains(swipes.contains(keystroke.Kbot)))
			{
				return 'R';
			}
			if(swipes.contains(keystroke.Btop)&&swipes.size()<=2)
			{
				return 'P';
			}
		}
		if(swipes.contains(keystroke.CCurve))//starts with curve, curvey letter
		{

			 if(swipes.contains(keystroke.Bbot)||midTopRowKeys>1||midBotRowKeys>1)
				 return 'G';
			 if(swipes.size()==1)
				 return 'C';
			 if(swipes.contains(keystroke.DCurve))//O or Q
			 {
				 if(swipes.contains(keystroke.Kbot)||swipes.contains(keystroke.Backslash))
				 {
					 return 'Q';
				 }
				 return 'O';
			 }
		}
		
		if((swipes.get(0)==keystroke.Forwardslash||swipes.get(0)==keystroke.Unknownslash)&&((swipes.get(0)==keystroke.Backslash)
				||((swipes.get(1)==keystroke.Unknownslash)&&(swipes.get(0)!=swipes.get(1)))))//M, N, X(posibility)
		{
			if(swipes.size()==2)
			{
				return 'X';
			}
			if(swipes.get(2)==keystroke.Forwardslash||swipes.get(2)==keystroke.Unknownslash)//M or N
			{
				if(swipes.size()==3)
				{
					return 'N';
				}
				if(swipes.get(3)==keystroke.Backslash||swipes.get(3)==keystroke.Unknownslash)
				{
					return 'M';
				}
			}
		}
		if(swipes.contains(keystroke.DashH)&&(swipes.contains(keystroke.Backslash)
				||swipes.contains(keystroke.Unknownslash)||swipes.contains(keystroke.Forwardslash)))// I or Z or T
		{
			if(swipes.contains(keystroke.DashL))
			{
				if(swipes.contains(keystroke.Backslash))
				{
					return 'Z';
				}
				return 'I';
			}
			if(swipes.size()==2)
			{
				if(swipes.contains(keystroke.Backslash))//IMPORTANT, IF THERE IS A J AND T ERROR IT LIES HERE
					return 'J';
				return 'T';
			}
		}
		if((swipes.size()>1&&swipes.get(0)==keystroke.Backslash||swipes.get(0)==keystroke.Unknownslash)&&(swipes.get(1)==keystroke.Forwardslash
				||((swipes.get(1)==keystroke.Unknownslash) && swipes.get(1)!=swipes.get(0))))//V X or W
		{
			if(swipes.size()==2)
			{
				if(botRowKeys==1)
				{
					return 'V';
				}
				return 'X';///IMPORTANT, IF HAVING X AND U MIX UP ERROR THE PROBLEM IS IN THIS LINE, replace x with u
			}
			if(swipes.size()==4&&(swipes.get(3)==keystroke.Backslash||swipes.get(3)==keystroke.Unknownslash))
			{
				return 'W';
			}
		}
		
		if(swipes.contains(keystroke.UCurve)&&(swipes.contains(keystroke.Unknownslash)||swipes.contains(keystroke.Forwardslash)))
		{
			return 'U';
		}
		
		if(swipes.size()==2 && swipes.contains(keystroke.DashL)&&(swipes.contains(keystroke.Backslash)
				||swipes.contains(keystroke.Forwardslash)||swipes.contains(keystroke.Unknownslash)))
		{
			return 'L';
		}
		
		if(swipes.contains(keystroke.SCurve))
		{
			return 'S';
		}
		
		if(swipes.contains(keystroke.YSlash))
		{
			return 'Y';
		}
		
		return ' ';
	}

}
