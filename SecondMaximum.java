import java.util.Scanner;
public class SecondMaximum {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	SecondMaxArray quiz = new SecondMaxArray();
/*
	System.out.printf("Enter your range: ");
	int range = input.nextInt(); 
	
	int[] integers = new int[range];

	for(int i = 0; i < range; i++){
	System.out.printf("Enter number %d: ", (i + 1));
	int userInput = input.nextInt();
	integers[i] = userInput;
	}
*/
	int[] integers = {9,6,8,14,13};
	quiz.secondMin(integers);
	}
}