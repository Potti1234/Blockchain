import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonTests {
	public static void main(String[] args)
	   {
		GsonTests gsonTests = new GsonTests();
		gsonTests.getNameFromJson("{\"name\": \"lukas\"}");
	   }
	
	public void getNameFromJson(String json) {
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(json);
		JsonObject object = element.getAsJsonObject();
		String name = object.get("name").getAsString();
		System.out.println(name);
	}
}
