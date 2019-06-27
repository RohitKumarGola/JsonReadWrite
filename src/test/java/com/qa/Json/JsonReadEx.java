package com.qa.Json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonReadEx {

	public static void main(String[] args) throws IOException, ParseException, JSONException {
		// TODO Auto-generated method stub
		/* 
		  String e=" "; 
		  Reader r = new FileReader("naam2.json"); 
		  JSONParser a = new JSONParser(); 
		  JSONObject jo =(JSONObject) a.parse(r);
		  JSONArray a1= new JSONArray();
		  a1=(JSONArray)jo.get("name");
		  System.out.println(a1.toString());
		  a1=(JSONArray)jo.get("name1");
		  System.out.println(a1.toString());
		  a1=(JSONArray)jo.get("name2");
		  System.out.println(a1.toString());
		  a1=(JSONArray)jo.get("name3");
		  System.out.println(a1.toString());
		  a1=(JSONArray)jo.get("name4");
		  System.out.println(a1.toString());
	
		*/  
		  
		  
		  Reader r = new FileReader("read.json");
		  JSONParser parser = new JSONParser();
		  Object obj  = parser.parse(r);
		  JSONArray array =  new JSONArray();
		  array.add(obj);
		//  JSONObject d;
		  for(int i=0;i<array.size();i++) { 
				System.out.println(array.get(i));
			 } 
		  
	}

}
                                                            