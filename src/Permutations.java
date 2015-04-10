/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
import java.lang.*;

public class Permutations {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            ArrayList<String> a = new ArrayList<String>();
            a = permute(line,a,0,line.length()-1);
            Collections.sort(a);
            StringBuffer sb = new StringBuffer();
            for(String s: a){
                sb.append(s+",");
            }
            a.clear();
            System.out.println(sb.toString().substring(0, sb.length()-1));
        }
    }

	private static ArrayList<String> permute(String line, ArrayList<String> a,
			int sI, int eI) {
		if(sI==eI){
			a.add(line);
		}else{
			for(int j=sI;j<=eI;j++){
				line = swap(line, sI,j);
				permute(line,a,sI+1,eI);
				line = swap(line, sI,j);
			}
		}
		
		return a;
	}

	private static String swap(String line, int sI, int eI) {
		if(sI >= eI){
			return line;
		}
		char[] ch = line.toCharArray();
		char temp = ch[sI];
		ch[sI] = ch[eI];
		ch[eI] = temp;
		return new String(ch); 
	}
}
