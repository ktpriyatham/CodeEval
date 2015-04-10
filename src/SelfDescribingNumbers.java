/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
import java.lang.*;

public class SelfDescribingNumbers {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line="2020";
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
            
            for(int i=0;i<line.length();i++){
            	char ch = line.charAt(i);
            	int n = Integer.parseInt(ch+"");
            	if(!hm.containsKey(n)){
            		hm.put(n,1);
            	}else{
            		hm.put(n,hm.get(n)+1);
            	}
            }
            int len=0;
            for(int i=0;i<line.length();i++, len++){
            	int n= Integer.parseInt(line.charAt(i)+"");
            	if(hm.containsKey(i) && n != hm.get(i)){
            		System.out.println(0);
            		hm.clear();
            		break;
            		
            	}
            }
            if(len == line.length()){
            	System.out.println(1);
            }
        }
    }
}
