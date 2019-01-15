import java.lang.*;

public class sumUsingConstructor
{
	int x, y;

  calc(int a, int b)
	 {
  		x = a;
  		y = b;
   }

	public void sum()
	{
		System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
	}
}

class addition
{
	public static void main(String args[])
	{

		calc c = new calc(30, 10);
		c.sum();
	}
}
