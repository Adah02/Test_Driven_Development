import java.util.Arrays;
public class SecondMaxArray {

	public static int secondMin (int[] integers) {

	int maximum = -27783487;
	int second_maximum = -27783487;
	for (int j = 0; j < integers.length; j++){
	if (integers[j] > maximum){
		second_maximum = maximum;
		maximum = integers[j];
		if (integers[j] > second_maximum && integers[j] != maximum){
		second_maximum = integers[j];
		}
	}
	
	}
	System.out.print("The second maximum is " + second_maximum);
	return second_maximum;
	}

}