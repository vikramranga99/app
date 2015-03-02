package myApp;

import java.util.List;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class Test {

	public static void main(String[] args) throws Exception {

		//Mongo mongo = new Mongo("localhost", 27017);		 
		// Since 2.10.0, uses MongoClient
		//>C:\mongodb\bin\mongod.exe --dbpath "C:\mongodb\data"
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		DB db = mongo.getDB("database name");
		List<String> dbs = mongo.getDatabaseNames();
		for(String db2 : dbs){
			//System.out.println(db2);
		}
		
		/*
		 * imagedb local mydb test admin
		 */
		
	 
		
		
		
		DB db4 = mongo.getDB("mydb");
		Set<String> tables = db4.getCollectionNames();
	 
		for(String coll : tables){
			System.out.println("---------------------------");
			System.out.println("collection name :" +coll);
			DBCollection rows = db4.getCollection(coll);
			System.out.println(" There are a total of "+rows.getCount()+" entries.");
			DBCursor cursor = db4.getCollection(coll).find();
			while(cursor.hasNext()) {
			    System.out.println(cursor.next());
			  
			}
 

 
			
		}

	}

}
