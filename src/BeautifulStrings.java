/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.lang.*;

class ValueComparator implements Comparator<Character>{
	Map<Character, Integer> m;
	
	public ValueComparator(Map<Character, Integer> m){
		this.m = m;
	}
	
	@Override
	public int compare(Character o1, Character o2) {
		if(m.get(o1) < m.get(o2)){
			return 1;
		}else{
			return -1;
		}
		
	}
	
}
public class BeautifulStrings {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line="Good luck in the Facebook Hacker Cup this year!";
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int n;
            n=26;
            HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
            
            for(int i=0;i<line.length();i++){
            	char ch =Character.toLowerCase(line.charAt(i));
            	if(Character.isAlphabetic(ch)){
            		if(hm.containsKey(ch)){
            			hm.put(ch,(hm.get(ch)+1));
            		}else{
            			 hm.put(ch,1);
            		}
            	}          		
            }
            ValueComparator vc = new ValueComparator(hm);
            SortedMap<Character,Integer> sortedHm = new TreeMap<Character,Integer>(vc);
            sortedHm.putAll(hm);
            hm.clear();
            int sum;
            sum=0;
            for(Entry e: sortedHm.entrySet()){
            	sum+= ((int)e.getValue())*n--;
            }
            System.out.println(sum);
            sortedHm.clear();
        }
    }
}
