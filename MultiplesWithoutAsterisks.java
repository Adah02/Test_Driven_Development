public class MultiplesWithoutAsterisks {

	public static void main(String[] args){

	double baseNumber = 10.5;
	int multiple = 12;
	double total = 0;

	for (int index = 0; index < multiple; index++){
		total += baseNumber;
	}
	System.out.print(total);
	}

}