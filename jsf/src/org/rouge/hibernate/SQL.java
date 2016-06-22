package org.rouge.hibernate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class SQL {
	public static String sqlFolder = "/org/rouge/sqlFiles/";
	
	public static String getQuery(String sqlFile, String queryName){
		String line = null;
		 		BufferedReader br = null;
		 		URL path = SQL.class.getResource(sqlFolder + sqlFile + ".sql");
		 		FileReader fr;
		 		try{
		 			fr = new FileReader(path.getPath());
		 			br = new BufferedReader(fr);
		 			String query = "";
		 			boolean writeQuery = false;
		 			while((line = br.readLine()) != null){
		 				if (line.contains("{")){
		 					if(line.equals(queryName + "{")){
		 						writeQuery = true;
		 						continue;
		 					}
		 				}
		 				if(line.contains("}")){
		 					writeQuery = false;
		 				}
		 				if(writeQuery){
		 					query += line;
		 				}
		 			}
		 			return query;
		 		}catch(IOException e){
		 			System.out.println(e.getMessage() + e.getCause().toString());
		 			return "";
		 		}finally{
		 			try{
		 				br.close();
		 			}catch(IOException | NullPointerException e){
		 				System.out.println(e.getMessage());
		 			}
		 		}
	}
}
