import org.junit.jupiter.api.Test;
import static
org.junit.jupiter.api.Assertions.assertArrayEquals;
public class RangeArrayTest {

	@Test
	public void rangeTest() {

	RangeArray quiz = new RangeArray();

	int[] arrayNumbers = {2,4,5,6,7,3,6,9};

	int[] check = quiz.arrayCount(arrayNumbers);

	int[] expectedValue = {7};

	assertArrayEquals(expectedValue, check);
	}
}
