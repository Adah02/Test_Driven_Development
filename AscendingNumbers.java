import java.util.Arrays;
public class AscendingNumbers{

	public static int[] ascendingIn(int array[]){

	int[] ascending = new int[array.length];

	final int MAX_VALUE = 2147483647;
	for(int i = 0; i < MAX_VALUE; i++){
		for (int j = 0 ; j < array.length; j++){
		if(i == array[j]){
		ascending[j] = i;
		System.out.print(i + " ");
		}
	}
	}
	return ascending;
	}
	

}