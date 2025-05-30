public class AtmCardNumber {

	public static String cardNumberIn (int[] array){

	boolean valid = false;
	String issuer = "";

	if (array[0] == 4 && array.length == 16){
		issuer = "Visa";  valid = true;
	}
	else if (array[0] == 5 && array.length == 16){
		issuer = "Mastercard";  valid = true;
	}
	else if (array[0] == 6 && array.length == 16){
		issuer = "Discover";  valid = true;
	}
	else if (array[0] == 3 && array.length == 15){
		issuer = "American Express";  valid = true;
	}
	else {
		valid = false; issuer = "Invalid length";
	}
	return issuer;
	}

}