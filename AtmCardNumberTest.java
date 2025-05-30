import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtmCardNumberTest{

	AtmCardNumber quiz = new AtmCardNumber();

	@Test
	public void cardNumberCheckForAtmCards(){

	int[] check = {3,5,6,7,4,6,4,3,3,5,6,5,7,4,6};

	String expected = "American Express";

	assertEquals(expected, quiz.cardNumberIn(check));
	}
}
