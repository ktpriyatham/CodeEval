/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
import java.lang.*;
public class SimpleSorting {
    public static void main (String[] args) throws IOException {
//        File file = new File(args[0]);
//        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line = "70.920 -38.797 14.354 99.323 90.374 7.581 0";
        double[] d;
//        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] str = line.split("\\s+");
            d = new double[str.length];
            for(int i=0;i<str.length;i++){
                d[i] = Double.parseDouble(str[i]);
            }
            
            Arrays.sort(d);
            
            for(int i=0;i<d.length;i++){
                if(i<d.length-1){
                System.out.print(d[i]+" ");continue;}
                System.out.println(d[i]);
            }
        }
    }
//}
