package Tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Blockchain.GsonBasics;

public class JsonTest {
	
	@Test
	void test() {
		//given
		String input = "{\"name\": \"lukas\"}";
		
		//when
		GsonBasics gsonBasics = new GsonBasics();
		String name = gsonBasics.getNameFromJson(input);
		
		//then
		assertEquals("lukas", name);
	}
}
