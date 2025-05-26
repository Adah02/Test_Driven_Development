import java.util.Arrays;
public class AscendingNumbers{

	public static int[] ascendingIn(int array[]){

	int[] ascending = new int[array.length];

	final int MAX_VALUE = 2147483647;
	for(int index = 0; index < MAX_VALUE; index++){
		for (int j = 0 ; j < array.length; j++){
		if(index == array[j]){
		ascending[j] = index;
		System.out.print(index + " ");
		}
	}
	}
	return ascending;
	}
	

}