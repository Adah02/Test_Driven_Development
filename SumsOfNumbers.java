import java.util.Arrays;
public class SumsOfNumbers{

	public static int[] sumsIn(int array[]){
	
	int i = 0;
	int[] sum = new int[array.length];
	int maximum = sum[i];
	int minimum = 2147483647;
	
	for( ; i < array.length; i++){
		for (int j = 0; j < array.length; j++){
		if(array[i] == array[j]) continue;
		sum[i] += array[j];
		}
		//System.out.println(Arrays.toString(sum));
		if (sum[i] > maximum) maximum = sum[i];
		if (sum[i] < minimum) minimum = sum[i];
	}
	System.out.println("Maximum: " + maximum);
	System.out.println("Minimum: " + minimum);
	return sum;
	}
	

}