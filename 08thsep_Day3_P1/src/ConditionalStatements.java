
public class ConditionalStatements 
{
	public void ifElseCondition(int a)
		{
			if(a>=20 && a<=60)
				System.out.println("You are an adult");
			else if(a>=13 && a<=19)
				System.out.println("You are a Teenager");
			else if(a>=1 && a<13)
				System.out.println("You are a child");
			else 
				System.out.println("You are a senior citizen");		
		}
		public void forLoopEven(int b)
		{
			for(int i=0;i<=b;i+=2)
			{
				if(i%20==0)
					continue;
				System.out.println(i);
			}
		}
		public void whileLoopOdd(int b)
		{
			int j = 1;
			System.out.println("\n\n");
			while(j<=b)
			{
				if(j>25)
					break;
				System.out.println(j);
				j+=2;
			}
		}
		public void switchcase(int a)
		{
			switch(a)
			{
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			default:
				System.out.println("Other than 1 and 2");
				break;
			}
		}
	}