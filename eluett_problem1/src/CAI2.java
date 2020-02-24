import java.security.SecureRandom; 
import java.util.Scanner;

public class CAI2 {
	
    public static void main(String args[]) {
    	SecureRandom rand = new SecureRandom();
    	int rand_int1 = rand.nextInt(10);
    	int rand_int2 = rand.nextInt(10);
    	quiz(rand_int1,rand_int2);
    }
    public static void quiz(int rand_int1,int rand_int2){
    	askQuestion(rand_int1,rand_int2);
    	int result = readResponse();
    	int correct = isAnswerCorrect(result, (rand_int1 * rand_int2));
    	if (correct == 1) {
    		displayCorrectResponse();
    		
    	}
    	else {
    		displayIncorrectResponse();
    		quiz(rand_int1,rand_int2);
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
    		
    	 
    	}
 
    }
}
