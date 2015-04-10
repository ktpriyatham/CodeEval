/* Sample code to read in test cases:*/

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.lang.*;

public class LongestLines {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;int n= -1;
        SortedMap<Integer,String> sm = new TreeMap<Integer, String>(Collections.reverseOrder());
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(n==-1){
            	n= Integer.parseInt(line);
            	continue;
            }
            
            if(sm.size()<n){
            	sm.put(line.length(),line);
            }else if(sm.lastKey() < line.length()){
            	sm.remove(sm.lastKey());
            	sm.put(line.length(), line);
            }
            
        }

        for(Entry<Integer, String> e: sm.entrySet()){
        	System.out.println(e.getValue());
        }
    }
}




/* Sample code to read in test cases:
import java.io.*;
import java.util.*;
import java.lang.*;
class Node{
	int len;
	String line;
	public Node(int len, String line){
		this.len = len;
		this.line = line;
	}
	
	public static ArrayList<Node> insert(ArrayList<Node> al, String line, int n){
		if(al.size()<n){
			al.add(new Node(line.length(),line));
		}
		else if(al.get(al.size()-1).line.length()<line.length()){
			al.remove(al.size()-1);
			al.add(new Node(line.length(),line));
		}
		swim(al);
		return al;
	}

	private static void swim(ArrayList<Node> al) {
		int p = (al.size()-1)/2;
		int c = (al.size()-1);
		while(p>=0){
			if(al.get(c).len > al.get(p).len){
				Node e = al.get(c);
				al.set(c,al.get(p));
				al.set(p,e);
				c = p;
				p = c/2;
			}else{
				break;
			}
		}
	}
}
public class LongestLines {
    public static void main (String[] args) throws IOException {
        File file = new File("/Users/Priyatham/Git/CodeEval/bin/text.txt");
        ArrayList<Node> al = new ArrayList<Node>();
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int n = Integer.parseInt(line);
            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                al = Node.insert(al, line,n);
            }
        }
        for(Node e: al){
        	System.out.println(e.line);
        }
    }
}
*/