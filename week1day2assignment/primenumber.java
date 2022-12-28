package week1day2assignment;

public class primenumber {
		public static void main (String[] args) {
			int input=13;
			boolean flag=false;
			for (int i = 2; i<=input/2; i++) {
				if(input%i==0) {
					flag=true;
					break;
				}	
			}
			if(flag==true) {
				System.out.println(input+" is not a prime number.");
			}
			else {
				System.out.println(input+" is a prime number.");
			}
			
		}

	}