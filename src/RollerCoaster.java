/* Sample code to read in test cases:*/
import java.io.*;
public class RollerCoaster {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line = " To be, or not to be: that is the question.";
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            boolean cap = true;
            StringBuffer sb = new StringBuffer();
            char ch;
            for(int i=0;i<line.length();i++){
            	ch = line.charAt(i);
            	if(Character.isAlphabetic(ch)){
            		if(cap){
            			ch = Character.toUpperCase(ch);
            			cap = false;
            		}else{
            			ch = Character.toLowerCase(ch);
            			cap = true;
            		}
            	}
            	sb.append(ch);
            }
            System.out.println(sb.toString());
            sb = new StringBuffer();
        }
    }
}
