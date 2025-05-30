import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtmCardNumberTest{

	AtmCardNumber quiz = new AtmCardNumber();

	@Test
	public void cardNumberCheckForAtmCards(){

	int[] check = {3,5,6,7,4,6,4,5,6,5,7,4,6};
	String expected = "Invalid length";
	
	assertEquals(expected, quiz.cardNumberIn(check));
	}

	@Test
	public void checkForVisaAtmCards(){

	int[] actual = {4,3,5,6,7,4,6,4,5,6,5,7,4,6,5,7};
	String feedBack = "Visa";

	assertEquals(feedBack, quiz.cardNumberIn(actual));
	}

	@Test
	public void checkForMastercardAtmCards(){

	int[] actual = {5,3,5,6,7,4,6,4,5,6,5,7,4,6,5,7};
	String feedBack = "Mastercard";

	assertEquals(feedBack, quiz.cardNumberIn(actual));
	}

}
