package controller;

public class St_controller {
	
	public String cal_grade(int marks)
	{
		if(marks>90)
		{
			return "O";
		}
		else if(marks>80)
		{
			return "A+";
		}
		else if(marks>70)
		{
			return "A";
		}
		else if(marks>60)
		{
			return "B+";
		}
		else if(marks>50)
		{
			return "B";
		}
		else if(marks>40)
		{
			return "C";
		}
		else if(marks>35)
		{
			return "D";
		}
		else
		{
			return "F";
		}
		
		
	}
	
}
