import java.util.Arrays;
public class SquareOfAscendingValues{

	public static int[] squareOfNumberIn(int[] scores){

	int[] squares = new int[scores.length];

	for (int index = 0; index < Integer.MAX_VALUE; index++){
		for (int count = 0; count < scores.length; count++){
			if (index == scores[count]){
			squares[count] += (Math.pow(scores[count],2));
			System.out.print(squares[count] + " ");
			}
		}
	}
	
	return squares;
	}

}