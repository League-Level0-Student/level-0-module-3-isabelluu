package extra;

public class SpudCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String p = "potato";
		
		for(int i=1; i<7; i++)
		{
			if(i<4)
			{
		System.out.print(i + " " + p + ", " );	
		
			}
			
			else if(i==4)
			{ System.out.print(i);
			System.out.println();;
			}
			
			else if(i>4)
			{System.out.print(i + " " + p + ", ");
			
			}
			
			else 
			{ System.out.print("more");
			}
			}
		}
	}


