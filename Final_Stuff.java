import java.util.Scanner;
import java.util.Arrays;

public class Final_Stuff {

	public static void main(String[] args) {

		printstatement();
		printfstatement();
		secondstominutes();
		sort5numbers();
		countdown();
		magiceightball();
		rockpaperscissors();
		additionquiz();

	}
	//https://swosu.instructure.com/courses/24827/discussion_topics/128110
	private static void additionquiz() {
		int inputOne = (int)(Math.random()*20+1);
		int inputTwo = (int)(Math.random()*20+1);
		System.out.printf("What is %d plus %d?\nPress enter when complete\n",
		inputOne, inputTwo );
		Scanner input = new Scanner(System.in);
		int userAnswer = input.nextInt();
		if(userAnswer == (inputOne + inputTwo)){
		System.out.println("CORRECT!");
		} else {
		System.out.println("INCORRECT!");
		}
		
	}
	//https://swosu.instructure.com/courses/24827/discussion_topics/128110
	private static void rockpaperscissors() {
		int computerGuess = (int)(Math.random()*3+1);
		System.out.printf("Comptuer Guess %d.\n", computerGuess);
		System.out.println("Please enter 1, 2, or 3.");
		Scanner input = new Scanner(System.in);

		int userGuess = input.nextInt();

		if(userGuess == 1 && computerGuess == 1){
			System.out.println("Draw!");
		}
		if(userGuess == 1 && computerGuess == 2){
			System.out.println("You lose!");
		}
		if(userGuess == 1 && computerGuess == 3){
			System.out.println("You win!");
		}

		if(userGuess == 2 && computerGuess == 1){
			System.out.println("You lose!");
		}
		if(userGuess == 2 && computerGuess == 2){
			System.out.println("Draw!");
		}
		if(userGuess == 2 && computerGuess == 3){
			System.out.println("You lose!");
		}
		if(userGuess == 3 && computerGuess == 1){
			System.out.println("You win!");
		}
		if(userGuess == 3 && computerGuess == 2){
			System.out.println("You lose!");
		}
		if(userGuess == 3 && computerGuess == 3){
			System.out.println("Draw!");
		}

	}
	//https://swosu.instructure.com/courses/24827/discussion_topics/128110
	private static void magiceightball() {
		int randomAnswerSelection = (int)(Math.random()*8+1);
		switch(randomAnswerSelection){
		case 1 : System.out.println("Maybe."); break;
		case 2 : System.out.println("Yes."); break;
		case 3 : System.out.println("No."); break;
		case 4 : System.out.println("Tuesday."); break;
		case 5 : System.out.println("I don't know. Ask your mother."); break;
		case 6 : System.out.println("They don't pay me enough for this s***."); break;
		case 7 : System.out.println("Sure, why not?"); break;
		case 8 : System.out.println("Could you repeat that?"); break;
		default : System.out.println("Try again later."); break;
		}

	}
	//https://stackoverflow.com/questions/26732846/how-to-count-from-10-to-1-in-java?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
	private static void countdown() {
		for (int i=20; i>-1; i-=2) {
			System.out.println("i= "+i);
		}
	}
	//https://github.com/swosu/Eclipse/blob/master/COMSC_1033_Ch07/src/sortNumbersQuiz.java
	private static void sort5numbers() {
		int[] steve = {13,1,6,4,42};
		Arrays.sort(steve);
		for(int i = 0; i<steve.length; i++){
			System.out.printf("At address %d is %d\n" , i, steve[i]);
		}

	}
	//https://swosu.instructure.com/courses/24827/discussion_topics/128110
	private static void secondstominutes() {
		double seconds = 3691.7;
		System.out.printf(
				"3691.7 seconds is %d minutes and %f seconds.\n",
				(int)(seconds/60), seconds%60);

	}

	private static void printfstatement() {
		int num = 42;
		System.out.printf("The meaning of life is %d.\n", num);;

	}

	private static void printstatement() {
		System.out.println("I hope I pass.");

	}

}
