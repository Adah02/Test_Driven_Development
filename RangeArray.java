public class RangeArray {

	public static int[] arrayCount(int[] array){

	int largest = array[0];
	int smallest = array[0];

	for(int i = 0; i <= array.length -1; i++){
		if (array[i] > largest){
		largest = array[i];
		}
		if (array[i] < smallest){
		smallest = array[i];
		}
	}
	int[] range = {largest - smallest};
	System.out.print(range);
	return range;
	}

}