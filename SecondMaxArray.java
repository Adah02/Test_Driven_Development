import java.util.Arrays;
public class SecondMaxArray {

	public static int secondMin (int[] integers) {

	int maximum = -27783487;
	int second_maximum = 0;
	for (int index = 0; index < integers.length; index++){
	if (integers[index] > maximum){
		second_maximum = maximum;
		maximum = integers[index];
		}
		for (int i = 0; i <= 1; i++){
		if (integers[index] > second_maximum && integers[index] != maximum){
		second_maximum = integers[index];
		}
	}
	
	}
	System.out.print("The second maximum is " + second_maximum);
	return second_maximum;
	}

}