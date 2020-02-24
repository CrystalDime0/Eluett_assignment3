import java.security.SecureRandom; 
import java.util.Scanner;

public class CAI3 {
	
    public static void main(String args[]) {
    	SecureRandom rand = new SecureRandom();
    	int rand_int1 = rand.nextInt(10);
    	int rand_int2 = rand.nextInt(10);
    	quiz(rand_int1,rand_int2,0,0);
    }
    public static void quiz(int rand_int1,int rand_int2,int tally,int count){
    	if (count >= 10) {
    		displayCompletionMessage(tally);
    		count = 0;
    		tally = 0;
    	}
    	count++;
    	askQuestion(rand_int1,rand_int2);
    	int result = readResponse();
    	int correct = isAnswerCorrect(result, (rand_int1 * rand_int2));
    	if (correct == 1) {
    		displayCorrectResponse();
    		tally++;
        	SecureRandom rand = new SecureRandom();
        	int rand_int11 = rand.nextInt(10);
        	int rand_int12 = rand.nextInt(10);
    		quiz(rand_int11,rand_int12,tally,count);
    	}
    	else {
    		displayIncorrectResponse();
        	SecureRandom rand = new SecureRandom();
        	int rand_int13 = rand.nextInt(10);
        	int rand_int24 = rand.nextInt(10);
    		quiz(rand_int13,rand_int24,tally,count);
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
}
