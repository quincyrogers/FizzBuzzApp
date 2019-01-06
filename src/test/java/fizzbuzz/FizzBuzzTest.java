package fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz underTest = new FizzBuzz();

	@Test
	public void shouldRespond1WhenUserEnters1(){
		FizzBuzz underTest = new FizzBuzz();
		String result = underTest.response(1);
		assertEquals("1", result);	
	}
	@Test
	public void shouldRespond2WhenUserEnters2(){
		String result = underTest.response(2);
		assertEquals("2", result);	
	}
	
	@Test
	public void shouldRespondFizzWhenUserEnters3(){
		String result = underTest.response(3);
		assertEquals("Fizz", result);	
	}
	
	@Test
	public void shouldRespond4WhenUserEnters4(){
		String result = underTest.response(4);
		assertEquals("4", result);	
	}
	
	@Test
	public void shouldRespondBuzzWhenUserEnters5(){
		String result = underTest.response(5);
		assertEquals("Buzz", result);	
	}
	
	@Test
	public void shouldRespondFizzWhenUserEnters6(){
		String result = underTest.response(6);
		assertEquals("Fizz", result);
	}
	@Test
	public void shouldRespondBuzzWhenUserEnters10(){
		String result = underTest.response(10);
		assertEquals("Buzz", result);	
	}
	@Test
	public void shouldRespondFizzBuzzWhenUserEnters15(){
		String result = underTest.response(15);
		assertEquals("FizzBuzz", result);	
	}
}
