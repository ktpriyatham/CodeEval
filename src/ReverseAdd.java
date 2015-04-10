/* Sample code to read in test cases:*/
import java.io.*;
public class ReverseAdd {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            long n = Long.parseLong(line);
            long rn = Long.parseLong(revString(line));
            long x = 0;
            int a=0;
            for(long i=0; i<100; i++){
            	x = n+rn;
            	a++;
            	if(isPalindrome(Long.toString(x)) && (x/10) != 0){
            		break;
            	}
            	n=x;
            	rn = Long.parseLong(revString(Long.toString(n)));
            }
            System.out.println(a+" "+Long.toString(x));
        }
    }

	private static boolean isPalindrome(String s) {
		long l = s.length()-1;
		for(long i=0; i<s.length()/2;i++){
			if(s.charAt((int) i) != s.charAt((int) (l-i))){
				return false;
			}
		}
		return true;
	}

	private static String revString(String line) {
		StringBuffer s = new StringBuffer();
		for(long i=line.length()-1; i>=0; i--){
			s.append(line.charAt((int) i));
		}
		return s.toString();
	}
}
