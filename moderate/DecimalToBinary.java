package moderate;

/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
public class DecimalToBinary {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int n = Integer.parseInt(line.trim());
            System.out.println(Integer.toBinaryString(n));
        }
    }
}
