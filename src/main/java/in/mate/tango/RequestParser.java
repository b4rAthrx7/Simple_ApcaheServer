package in.mate.tango;

import java.io.*;

public class RequestParser {
    //parses the browsers http request and seperates protocol version such as http 1.0,1.1 etc...
    //also identifies the type of method that it supports this onluy supports GET and HEAD methods
     

static String requestmethod ;
static String protocolversion ;
public static void parser(InputStream in)throws IOException{

int i;
StringBuffer sb = new StringBuffer();
    while((i=in.read() ) != -1){
        if(i==10){
         segr(sb.toString());
          return;
        }
        else{
           sb.append((char)i);
        }
    }
    return;
    }
    public static void segr(String s){
 int count =0;
 int order =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ' && count == 0){
                count++;
                RequestParser.requestmethod=s.substring(0, i);
            }
            else if(s.charAt(i)=='1' && order == 0){
              order++;
                RequestParser.protocolversion=s.substring(i,s.length()-1);
            }
            else{
                continue;
            }    
        }
    }
}
