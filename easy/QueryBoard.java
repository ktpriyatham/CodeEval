package easy;
/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
import java.lang.*;
public class QueryBoard {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int A[][] = new int[256][256];
        for(int i=0;i<256;i++){
        	for(int j=0;j<256;j++){
        		A[i][j]=0;
        	}
        }
        int c,r,val;
        int sum=0;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] str = line.split("\\s+");
            switch(str[0]){
            case("SetCol"):{
            	c=Integer.parseInt(str[1]);
            	val = Integer.parseInt(str[2]);
            	for(int i=0;i<256;i++){
            		A[i][c] = val;
            	}
            	break;
            }
            case("SetRow"):{
            	
            	r=Integer.parseInt(str[1]);
            	val = Integer.parseInt(str[2]);
            	for(int i=0;i<256;i++){
            		A[r][i] = val;
            	}
            	break;
            }
            case("QueryCol"):{
            	c = Integer.parseInt(str[1]);
            	sum=0;
            	for(int i=0;i<256;i++){
            		sum+=A[i][c];
            	}
            	System.out.println(sum);
            	break;
            }
            case("QueryRow"):{
            	r = Integer.parseInt(str[1]);
            	sum=0;
            	for(int i=0;i<256;i++){
            		sum+=A[r][i];
            	}
            	System.out.println(sum);
            	break;
            }
            }
        }
    }
}
