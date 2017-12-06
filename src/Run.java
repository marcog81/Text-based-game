import java.util.Random;
import java.util.Scanner;
public class Run {
	Scanner sc = new Scanner(System.in);
	
		private void Instructions()
	{
		
		System.out.println("shhhhhhhh! You have been abducted by aliens and are on board an alien spaceship");
		System.out.println(" The only way to survive now is by escaping");
		System.out.println(" Now you are currently tied down laying on a flat platform");
		System.out.println(" You must struggle to set loose whatever alien thing that is tieing you down. Oh nvm it just rope ://");
		
		System.out.println(" Can you do that ?");
		String canYou=sc.next();
		if (userYes() )
		{
			System.out.println(" Well let's begin");
			System.out.println(" Best be ready to run foryour life !!!");
			
			
		}
		else
		{
			death
		}
	}
	
		
		
	private boolean userYes()
	
	{
	return	(sc.nextLine().equals("yes")) ;
			
	}
	{
		return if(sc.nextLine.equals("yes"));
		
	}

	private void death();
	{
		System.out.println("Congratulations you lil idiot. You were supposed succesfully run away from this alien spaceship but you have failed.");
		System.out.println("Do you want to play again? Enter Y for yes or N for no!");

        answer = in.nextLine();
        answer = answer.toLowerCase(); //change input to lowercase for bullet proofing
        if(answer.equals("y"))
        {
        done = false;
        player = "X";
        moveCounter = 0;
        game.resetTheGame();

        }

      else
         {
         System.exit(0); //program termination
       }


}

}
	}

}

	

	

