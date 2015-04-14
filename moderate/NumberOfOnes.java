package moderate;
/* Sample code to read in test cases:*/
import java.io.*;
public class NumberOfOnes {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String s = Integer.toBinaryString(Integer.parseInt(line));
            
            int n;
            n=0;
            for(int i=0; i<s.length();i++){
            	if(s.charAt(i)=='1'){
            		n++;
            	}
            }
            System.out.println(n);
        }
    }
}
