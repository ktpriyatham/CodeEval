package moderate;

import java.io.*;
import java.util.*;
import java.lang.*;
public class DoubleSquares {
    public static void main (String[] args) throws IOException {
        File file = new File("/Users/Priyatham/Git/CodeEval/bin/text.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        boolean t = true;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(t){
            	t=false;
            	continue;
            }
            long x = checkForWays(Long.parseLong(line));
            
            System.out.println(x);
        }
    }
	public static long checkForWays(long n){
		long ret=0;
		long sq = (long)Math.sqrt(n);
		long t1;
		long t2;		
		for(long i=sq;i>=0;i--){
			t1 = i*i;
			t2 = (long) Math.sqrt(n-(i*i));
			if(t2>i){
				break;
			}
			if((t1)+(t2*t2)==n){
				ret++;
			}
		}
		return ret;
	}
}
