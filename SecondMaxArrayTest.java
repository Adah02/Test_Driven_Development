import org.junit.jupiter.api.Test;
import static
org.junit.jupiter.api.Assertions.assertEquals;
public class SecondMaxArrayTest {

	@Test
	public void testForSecondMaxNumber(){

	SecondMaxArray quiz = new SecondMaxArray();

	int[] numbers = {6,8,11,13,12};
	
	int check = quiz.secondMin(numbers);

	int expectedValue = 12;

	assertEquals(expectedValue, check);
	}

}