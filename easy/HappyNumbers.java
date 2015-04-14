package easy;
/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
import java.lang.*;

public class HappyNumbers {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            long n = Long.parseLong(line);
            if(n==1){
                System.out.println(1);
                continue;
            }
            Set<Long> s = new HashSet<Long>();
            while(true){
            	if(n==1){
            		System.out.println(1);
            		break;
            	}else if(!s.contains(n)){
                	s.add(n);
                	n = sumOfNum(n); 
                }else{
                	System.out.println(0);
                	break;
                }
            }
            s.clear();
        }
    }

	private static long sumOfNum(long n) {
		long temp1=0;
		long temp2;
		while(n!=0){
			temp2 = n%10;
			temp1 += temp2*temp2;
			n=n/10;
		}
		return temp1;
	}
}
