package com.mycompany.gui_pairwise_sequence_alignment;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Connector {
    public static DBCollection con;
     public static void connect(){
         try{
              MongoClient client=new MongoClient("localhost",27017);
              DB db = client.getDB("sequence_alignment");
              //System.out.println("Connected");
              con= db.getCollection("alignment_data");
         }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Not connected");
            con=null;
        }
         
     }
    
}
