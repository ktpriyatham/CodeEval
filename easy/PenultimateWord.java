package easy;
/* Sample code to read in test cases:*/
import java.io.*;
public class PenultimateWord {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] str = line.split("\\s+");
            
            System.out.println(str[str.length-2]);
        }
    }
}
