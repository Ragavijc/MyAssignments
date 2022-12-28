package week1day2assignment;

public class intersection {
	public static void main(String[] args) {
		int x[]= {3,2,11,4,6,7};
		int y[]= {1,2,8,4,9,7};
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < y.length; j++) 
			{
				
			
			if (x[j]==x[i]) {	
				System.out.println("First array"+x[i]);
				break;
			}
		}
	}
	}
}
