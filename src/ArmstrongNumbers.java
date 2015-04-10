/* Sample code to read in test cases:*/
import java.io.*;
import java.util.*;
import java.lang.*;

public class ArmstrongNumbers {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line = "153";
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            System.out.println(checkArmstrong(line.length(),Integer.parseInt(line)));
        }
    }

	private static String checkArmstrong(int length, int n) {
		if(n==0){
			return "False";
		}
		int arm=0;
		int check = n;
		while(n!=0){
			arm += Math.pow(n%10,(double)length);
			n= n/10;
		}
		if(arm == check){
			return "True";
		}
		return "False";
	}
}
