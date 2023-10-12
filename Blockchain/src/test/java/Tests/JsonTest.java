package Tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Blockchain.GsonBasics;

public class JsonTest {
	
	@Test
	void test() {
		//given
		String input = "{\"name\": \"lukas\"}";
		GsonBasics gsonBasics = new GsonBasics();
		
		//when
		String name = gsonBasics.getNameFromJson(input);
		
		//then
		assertEquals("lukas", name);
	}
	
	@Test
	void noNameTest() {
		//given
		String input = "{\"username\": \"lukas\"}";
		GsonBasics gsonBasics = new GsonBasics();

		//then
		assertThrows(IllegalArgumentException.class, () -> gsonBasics.getNameFromJson(input));
	}
	
	@Test
	void nullTest() {
		//given
		String input = null; 
		GsonBasics gsonBasics = new GsonBasics();
		
		//then
		NullPointerException ex = assertThrows(NullPointerException.class, () -> gsonBasics.getNameFromJson(input));
		assertEquals(ex.getMessage(), "Input json can not be null");
	}
	
	@Test
	void wrongInputTest() {
		//given
		String input = "Bad";
		GsonBasics gsonBasics = new GsonBasics();

		//then
		assertThrows(IllegalStateException.class, () -> gsonBasics.getNameFromJson(input));
	}
}
