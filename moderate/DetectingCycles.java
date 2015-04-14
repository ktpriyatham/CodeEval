package moderate;
/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
import java.lang.*;
public class DetectingCycles {
    public static void main (String[] args) throws IOException {
        File file = new File("/Users/Priyatham/Git/CodeEval/bin/text.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] str = line.split("\\s+");
            Set<String> h1 = new LinkedHashSet<String>();
            Set<String> h2 = new LinkedHashSet<String>();
            StringBuffer sb = new StringBuffer();
            for(int i=0; i< str.length; i++){
            	if(!h1.contains(str[i])){
            		h1.add(str[i]);
            		continue;
            	}else if(h1.contains(str[i]) && !h2.contains(str[i])){
            		h2.add(str[i]);
            		sb.append(str[i]+" ");
            	}else{
            		break;
            	}
            }
            System.out.println(sb.toString().trim());
            
        }
    }
}
