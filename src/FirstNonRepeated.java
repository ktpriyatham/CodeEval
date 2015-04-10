/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
public class FirstNonRepeated {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            HashMap<Character, Boolean> hm = new LinkedHashMap<Character, Boolean>();
            
            for(int i=0;i<line.length();i++){
            	char ch = line.charAt(i);
            	if(hm.containsKey(ch)){
            		hm.put(ch,false);
            		continue;
            	}
            	hm.put(ch, true);
            }
            for(Entry<Character, Boolean> e: hm.entrySet())
            if(e.getValue()){
            	System.out.println(e.getKey());
            	break;
            }
        }
    }
}
