package moderate;
/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
import java.lang.*;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
public class MToLast {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] str = line.split("\\s+");
            int n = Integer.parseInt(str[str.length-1]);
            n++;
            
            if(n>str.length || n<1){
            	continue;
            }
            String res ="";
            for(int i=0; i<=(str.length - n); i++){
            	res = str[i];
            }
            System.out.println(res);
        }
    }
}
