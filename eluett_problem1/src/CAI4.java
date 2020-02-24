import java.security.SecureRandom; 
import java.lang.Math;
import java.util.Scanner;

public class CAI4 {
	
    public static void main(String args[]) {
    	System.out.println("Enter Difficulty");
    	int result = readDifficulty();
    	quiz(generateQuestionArgument(result),generateQuestionArgument(result),0,0,result);
    }
    public static void quiz(int rand_int1,int rand_int2,int tally,int count,int diff){
    	if (count >= 10) {
    		displayCompletionMessage(tally);
    		System.out.println("Would you like to start a new problem set (1 == yes) (0 == no)");
            int s = readResponse();
            if (s == 1) {
            	;
            }
            else if (s == 0) {
            	System.exit(0);
            }
    		count = 0;
    		tally = 0;
        	System.out.println("Enter Difficulty");
    		diff = readDifficulty();
    	}
    	count++;
    	askQuestion(rand_int1,rand_int2);
    	int result = readResponse();
    	int correct = isAnswerCorrect(result, (rand_int1 * rand_int2));
    	if (correct == 1) {
    		displayCorrectResponse();
    		tally++;

    		quiz(generateQuestionArgument(diff),generateQuestionArgument(diff),tally,count,diff);
    	}
    	else {
    		displayIncorrectResponse();
    		quiz(generateQuestionArgument(diff),generateQuestionArgument(diff),tally,count,diff);
    	}
 
    }
    public static void askQuestion(int one, int two){
    	System.out.println("How much is " + one +" times " + two);
    }
    public static int readResponse(){
    	 Scanner in = new Scanner(System.in);
         String s = in.nextLine();
         return Integer.parseInt(s);    	
    }
    public static int isAnswerCorrect(int result,int compar) {
    	if (result == compar) {
    		return 1;
    	}
    	
    	return 0;
    }
    public static void displayCorrectResponse() {
    	SecureRandom rand2 = new SecureRandom();
    	int result = rand2.nextInt(5) + 1;
    	switch(result) {
    	    case 1: 
    		    System.out.println("Very good!");
    		    break;
    	    case 2: 
    		    System.out.println("Excellent!");
    		    break;
    	    case 3: 
    		    System.out.println("Nice work!");
    		    break;
    	    case 4: 
    		    System.out.println("Keep up the good work!");
    		    break;
    		default:
    			System.out.println("Keep up the good work!");
    			break;
    		
    	 
    	}
    }
    public static void displayIncorrectResponse() {
    	SecureRandom rand3 = new SecureRandom();
    	int result = rand3.nextInt(5) + 1;
    	switch(result) {
    	    case 1: 
    		    System.out.println("No. Please try again.");
    		    break;
    	    case 2: 
    		    System.out.println("Wrong. Try once more");
    		    break;
    	    case 3: 
    		    System.out.println("Don’t give up!");
    		    break;
    	    case 4: 
    		    System.out.println("No. Keep trying.");
    		    break;
    		default:
    			System.out.println("No. Keep trying.");
    			break;
    		
    	 
    	}
 
    }
    public static void displayCompletionMessage(int tally){
    	int score = tally * 10;
    	System.out.println(tally);
    	if (tally < 8) {
    		System.out.println("Please ask your teacher for extra help");
    	}
    	else {
    		System.out.println("Congratulations, you are ready to go to the next level!");
    	}
    	
    }
    public static int readDifficulty() {
    	
    	return readResponse();
    }	
    public static int generateQuestionArgument(int dif) {
    	if (dif > 4) {
    		dif = 4;
    	}
    	SecureRandom rand = new SecureRandom();
    	int max = (int) Math.pow(10, dif);
    	int result = rand.nextInt(max);
    	return result;
    }
}
