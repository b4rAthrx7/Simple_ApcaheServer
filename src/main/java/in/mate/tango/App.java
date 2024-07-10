package in.mate.tango;

import java.io.File;
import java.io.IOException;

public class App 
{
    public static void main( String[] args){
        begin();
    }

    public static void begin(){

 File fil = new File("C:\\msys64\\home\\brad\\apche\\src\\main\\java\\in\\mate\\tango\\congif.json");
        try {
            CManager.gted();
            CManager.load(fil);
    Config con = CManager.curr();
           // System.out.println(con.getPort());
            Serve.sever(con.getPort());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
