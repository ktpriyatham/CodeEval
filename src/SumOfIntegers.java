/* Sample code to read in test cases:*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class SumOfIntegers {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] str = line.split(",");
            int[] n = new int[str.length];
            if(line.length()==0){
            	continue;
            }
            for(int i=0; i<str.length;i++){
            	n[i] = Integer.parseInt(str[i]);
            }
            int maxEnding = n[0];
            int tempEnding = 0;
            
            for(int i=0;i<n.length;i++){
            	for(int j=i;j<n.length;j++){
            		tempEnding = 0;
            		for(int k=i;k<=j;k++){
            			tempEnding+=n[k];
            		}
            		
            		if(maxEnding < tempEnding){
            			maxEnding = tempEnding;
            		}
            		if(tempEnding < 0){
            			tempEnding=0;
            		}
            	}
            }
            
            
            System.out.println(maxEnding);
        }
    }
}
