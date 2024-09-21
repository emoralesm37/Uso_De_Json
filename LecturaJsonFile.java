package usoJson;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class LecturaJsonFile {

	public static void main(String[] args) {

				JSONParser parser = new JSONParser();
				
				try {
					Object obj = parser.parse(new FileReader("usuarios.json"));
					JSONObject jsonObject = (JSONObject) obj;
					System.out.println("JSON LEIDO: " + jsonObject);
				
				JSONArray array = (JSONAarray) jsonObject.get("Usuarios");
				System.out.println("");
				
				for(int i=0; i < array.size(); i++) {
					JSONObject jsonObject1 = (JSONObject) array.get(i);
					
					System.out.println("Datos del usuario: " + i);
					System.out.println("ID: " + jsonObject1.get("id"));
					System.out.println("Nombre: " + jsonObject1.get("nombre"));
					System.out.println("Telefono: " + jsonObject1.get("telefono"));
					System.out.println("Email: " + jsonObject1.get("email"));
					
					System.out.println("");
				}
					
					
				}catch(FileNotFoundException e) {}
				catch(IOException e) {}
				catch(ParseException e) {}

			}

		}
		
