
public class Date {
	int dd;
	int mm;
	int yy;
public Date(int dd,int mm,int yy)
{
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
}
public void displayDate(int d,int m,int y)
{
	System.out.println(d+"/"+m+"/"+y);
}
public void checkDate(int d,int m,int y)
{
	if(m==1 || m==3 ||m==5 ||m==7 || m==8 || m==10 || m==12)
	{
		if(d>=1 && d<=31)
		{
			if(y>=1 && y<=99 )
				System.out.println("Valid Date");
			else
				System.out.println("Invalid Date");
		}
		else
			System.out.println("Invalid Date");
	}
	else if(m==4 || m==6 ||m==9 ||m==11)
	{
		if(d>=1 && d<=30)
		{
			if(y>=1 && y<=99 )
				System.out.println("Valid Date");
			else
				System.out.println("Invalid Date");
		}
		else
			System.out.println("Invalid Date");
	}
	else if(m==2)	{
		if(d>=1 && d<=29)
		{
			if(y>=1 && y<=99 )
				System.out.println("Valid Date");
			else
				System.out.println("Invalid Date");
		}
		else
			System.out.println("Invalid Date");
	}
	else
		System.out.println("Invalid Date");
}
}
