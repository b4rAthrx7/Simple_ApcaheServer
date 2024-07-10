package in.mate.tango;

import java.io.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parss{
    //this class parses the json file and assign the port and webroot to the CManager class 
    
    private static ObjectMapper obj=getOM();
    
    public static ObjectMapper getOM(){
        ObjectMapper om = new ObjectMapper();
        return om;
    }

    public static JsonNode soon(File source)throws IOException{
        return obj.readTree(source);
    }

    public static <A> A paaser(JsonNode node, Class<A> clz)throws JsonProcessingException{

        return obj.treeToValue(node, clz);
    }
}
