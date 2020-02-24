import java.security.SecureRandom; 
import java.util.Scanner;

public class CAI1 {
	
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
    		System.exit(0);
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
    	System.out.println("Very good");
    }
    public static void displayIncorrectResponse() {
    	System.out.println("No.Please try again");
    }
}
