package Blockchain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonBasics {
	
	private final static Logger LOG = LoggerFactory.getLogger(GsonBasics.class);
	
	public static void main(String[] args)
	   {
		GsonBasics gsonTests = new GsonBasics();
		gsonTests.getNameFromJson("{\"name\": \"lukas\"}");
	   }
	
	@SuppressWarnings("deprecation")
	public String getNameFromJson(String json) {
		LOG.info("Start");
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(json);
		LOG.info("Json erfolgreich geparsed");
		JsonObject object = element.getAsJsonObject();
		String name = object.get("name").getAsString();
		LOG.info("Name: {}", name);
		
		return name;
	}
}
