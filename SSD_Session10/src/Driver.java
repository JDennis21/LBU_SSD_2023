import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map.Entry;

import json.JSONException;
import json.JSONFactory;
import json.JSONObject;
import json.JSONParser;
import json.JSONValue;

public class Driver {

	/**
	 * Prints details about a student, by extracting the property members from a given {@link JSONObject}.
	 * 
	 * @param id the ID of the student
	 * @param properties the {@link JSONObject} containing the properties of the student
	 * @throws JSONException if the given JSON object does not contain the expected property member.
	 */
	private static void printStudentDetails(String id, JSONObject properties) throws JSONException {
		
		System.out.println("\n--------------");
		System.out.println("ID : " + id +"\n");
		
		String name = properties.getMember("name").asString();
		String uni = properties.getMember("University").asString();
		String course = properties.getMember("course").asString();
		int year = properties.getMember("year").asInteger();
		double average = properties.getMember("average").asDouble();
		
		System.out.println("The student name is " + name + ", and they are studying " + course);
		System.out.println("They are studying at " + uni);
		System.out.println("They are currently studying year " + year);
		System.out.println("The average mark is " + average);
		
		if ( properties.getMember("enrolled").asBoolean() == false ) {
			System.out.println("NOTE: THEY ARE NOT CURRENTLY ENROLLED");
		}
	}
	
	/////////////////////////////////////////////
	
	private static void generateJSON() throws FileNotFoundException {
		
		// TODO: populate this method for task 4
	}
	
	/////////////////////////////////////////////
	
	public static void main(String[] args) {

		try {
			// parse the JSON file, this returns a JSONValue object which represents an internal representation of the parsed data
			JSONValue value = JSONParser.parseFile("student_info.json");

			// get the JSON value, converted to a JSONObject, allowing extraction of the properties
			JSONObject rootObj = value.asObject();

			// loop over each JSONObject available
			for (Entry<String, JSONValue> next : rootObj) {

				// print the student details present in the next JSON object
				printStudentDetails(next.getKey(), next.getValue().asObject());
			}

			////////////////////////////////////////////////////////

			// Add code for Task 3 here (parsing module_info.json file).
			
			////////////////////////////////////////////////////////
			
			generateJSON();	// do not remove: Used for Task 4
			
		} catch (IOException e) {

			System.err.println("I/O Error : " + e.getMessage());
			
		} catch (JSONException e) {

			System.err.println("Parse Error : " + e.getMessage());
		}

	}

}
