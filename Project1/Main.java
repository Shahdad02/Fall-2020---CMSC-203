import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
    
		String answer = "";
	    Scanner user = new Scanner(System.in);
	    
		    System.out.println("Reboot the computer and try to connect");
			System.out.println("Did that fix the problem?");
			    
			answer = user.nextLine(); 
			
			while(answer.equalsIgnoreCase("no")){
				System.out.println("Reboot the router and try to connect");
				System.out.println("Did that fix the problem?");
				        
				answer = user.nextLine();
				if (answer.equalsIgnoreCase("no")){
					System.out.println("Make sure the cable connecting the router are firmly plugged in and power is getting to the router");
				    System.out.println("Did that fix the problem?");
				        
				    answer = user.nextLine();
				    if (answer.equalsIgnoreCase("no")){
				    	System.out.println("Move the computer closer to the router and try to connect");
				        System.out.println("Did that fix the problem?");
				            
				        answer = user.nextLine();
				        if (answer.equalsIgnoreCase("no")) {
				        	System.out.println("Contact your ISP");
				        	System.exit(0);
				        }
				        else if (answer.equalsIgnoreCase("yes")){
				        	System.exit(0);
				        }
				                 
				    }
				       
				}
			    
			}
	}
}

