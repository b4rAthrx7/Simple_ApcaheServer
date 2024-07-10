package in.mate.tango;

import java.io.*;

import com.fasterxml.jackson.databind.JsonNode;

public class CManager {
    
    private static CManager cmngr =null;
    public static Config con = null;
    public static CManager gted(){
        if(cmngr == null){
            cmngr = new CManager();
        }
        return cmngr;
    }


    public static void load(File file)throws IOException{
        JsonNode jn = Parss.soon(file);
            con = Parss.paaser(jn, Config.class);
        
    }

    public static Config curr(){
        if(con == null) con =new Config();
        return con;
    }
}
