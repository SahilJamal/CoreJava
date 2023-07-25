import java.util.*;  //project work
public class new_124 {
	    public static void main(String[] args) {
			int Level,total;
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the Level you want to play \n1:Easy \n2:Medium \n3:Hard");
			Level=sc.nextInt();
			int ans, guess, guessNum = 0,score=0;
			String str, playAgain = "y";
			switch(Level)
			{
			case 1:
             final int maxGuesses = 6;
      while (playAgain.equals("y") || playAgain.equals("Y")) {
    	  Scanner scan = new Scanner(System.in);
          Random generator = new Random();
          ans = generator.nextInt(101) + 1;                         //(101) is the range and + 1 is starting point
          System.out.println("Guess a number between 1 and 100");
          System.out.println("Guess a number (0 to quit):");

          guess = scan.nextInt();
          guessNum = 0;
          while (guess != 0)
          {
              guessNum++;
              if (guess == ans) {
            	 // credits on=new credits();
                  //on.dis3();
				  score=0+score;
				  score++;
                  break;
              } else if (guess < ans)
                  System.out.println("Opss! Your guess was too LOW, try some higher numbers.");
              else if (guess > ans)
                  System.out.println("Opps! Your guess was too HIGH, Try some lower numbers");
			  if(guessNum == maxGuesses) {
				  System.out.println("The number was " + ans);
  					 //credits on=new credits();
  				      //on.dis4();
				 break;
              }
              System.out.println("Enter your guess (0 for quit):");
              guess = scan.nextInt();
          }
		  System.out.println("Your Score ="+score);
          System.out.println("Want to Play again?(y/n)");
          playAgain = scan.next();
      }
	  total=score
     /* credits on=new credits();
      on.dis1();
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      on.dis2();
	  break;*/
	  
	  
		case 2:
      final int maxGuesses1 = 7;
      while (playAgain.equals("y") || playAgain.equals("Y")) {
    	  Scanner scan = new Scanner(System.in);
          Random generator = new Random();
          ans = generator.nextInt(501) + 50;
          System.out.println("Guess a number between 1 and 500");
          System.out.println("Guess a number (0 to quit):");

          guess = scan.nextInt();
          guessNum = 0;
          while (guess != 0)
          {
              guessNum++;
              if (guess == ans) {
            	  //credits on=new credits();
                  //on.dis3();
                  break;
              } else if (guess < ans)
                  System.out.println("Opss! Your guess was too LOW, try some higher numbers.");
              else if (guess > ans)
                  System.out.println("Opps! Your guess was too HIGH, Try some lower numbers");
              if (guessNum == maxGuesses1) {
                  System.out.println("The number was " + ans);
  					// credits on=new credits();
  				      //on.dis4();
                  break;
              }
              System.out.println("Enter your guess (0 for quit):");
              guess = scan.nextInt();
          }
          System.out.println("Want to Play again?(y/n)");
          playAgain = scan.next();
      }
     /* credits on=new credits();
      on.dis1();
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      on.dis2();*/
	  break;
	  
		case 3:
		final int maxGuesses2 = 10;
      while (playAgain.equals("y") || playAgain.equals("Y")) {
    	  Scanner scan = new Scanner(System.in);
          Random generator = new Random();
          ans = generator.nextInt(1001) + 100;
          System.out.println("Guess a number between 1 and 1000");
          System.out.println("Guess a number (0 to quit):");

          guess = scan.nextInt();
          guessNum = 0;
          while (guess != 0)
          {
              guessNum++;
              if (guess == ans) {
            	  //credits on=new credits();
                  //on.dis3();
                  break;
              } else if (guess < ans)
                  System.out.println("Opss! Your guess was too LOW, try some higher numbers.");
              else if (guess > ans)
                  System.out.println("Opps! Your guess was too HIGH, Try some lower numbers");
              if (guessNum == maxGuesses2) {
                  System.out.println("The number was " + ans);
  					// credits on=new credits();
  				      //on.dis4();
                  break;
              }
              System.out.println("Enter your guess (0 for quit):");
              guess = scan.nextInt();
          }
          System.out.println("Want to Play again?(y/n)");
          playAgain = scan.next();
      }
     /* credits on=new credits();
      on.dis1();
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      on.dis2();*/
	  break;
	  
			}
		}
	    }