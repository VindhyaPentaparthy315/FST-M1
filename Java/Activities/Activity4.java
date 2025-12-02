package Examples;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int[] A={10,34,6,8,2,9,3,2,19,22,4};
		sortmethod(A);
		System.out.println(Arrays.toString(A));
	}
		public static void sortmethod(int array[])
		{
			for (int i=0;i<array.length;i++)
			{
				int x= array[i];
				int y=i-1;
				while(y>=0 && x<array[y])
				{
					array[y+1]=array[y];
					--y;// TODO Auto-generated method stub
				}
				array[y+1]=x;
			}
		}

	}


