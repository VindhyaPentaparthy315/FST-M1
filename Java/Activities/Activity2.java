package Examples;

public class Activity2 {

	public static void main(String[] args) {
		int[] aray= {10,77,10,54,-11,10};
		int actual=0;
		int expected=30;
		for(int i=0;i<aray.length;i++)
		{
			if(aray[i]==10)
			{
				actual+=aray[i];
			}
		}
		if(actual==expected)
		{
			System.out.println("The actual and expected are:" +actual);
		}
		else
		{
			System.out.println("The actual Num is " +actual +" and is not equal to " +expected);
		}
				

	}

}
