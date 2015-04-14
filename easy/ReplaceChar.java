package easy;
/* Sample code to read in test cases:*/
import java.io.*;
public class ReplaceChar {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] s = line.split(",");
            String l = s[0].trim();
            String ch = s[1].trim();
            
            
            for(int i=0;i<ch.length();i++){
            	String c = ch.charAt(i)+"";
            	l = l.replaceAll(c,"");
            }
            System.out.println(l);
        }
    }
}
