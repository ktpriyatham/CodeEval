/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
import java.lang.*;

public class DataRecovery {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] str = line.split(";");
            String[] sentence = str[0].split("\\s+");
            String[] numbers = str[1].split("\\s+");
            HashMap<Integer,String> hm = new HashMap<Integer,String>();
            int i=0;
            boolean[] visited = new boolean[sentence.length];
            Arrays.fill(visited, false);
            while(i<sentence.length && i<numbers.length){
                hm.put(Integer.parseInt(numbers[i]),sentence[i]);
                visited[i] = true;
                i++;
            }
            
            StringBuffer sb = new StringBuffer();
            int j=0;
            while(j<sentence.length || i<sentence.length){
            	if(hm.containsKey(j+1)){
            		sb.append(hm.get(j+1)+" ");
            	}else if(i<sentence.length){
            		sb.append(sentence[i]+" ");
            		i++;
            	}
            	j++;
            }
            
            
            System.out.println(sb.toString().trim());
        }
    }
}
