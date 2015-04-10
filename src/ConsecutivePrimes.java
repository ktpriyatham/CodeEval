/* Sample code to read in test cases:*/
import java.io.*;
public class ConsecutivePrimes {
    public static void main (String[] args) throws IOException {
        File file = new File("/Users/Priyatham/Git/CodeEval/bin/text.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int n = Integer.parseInt(line);
            if(n%2 !=0){
            	System.out.println(0);
            	continue;
            }
            int A[] = new int[n];
            for(int i=0;i<n; i++){
            	A[i] = i+1; 
            }
            System.out.println(ePermute(A,0,0,A.length-1));
        }
    }

	private static int ePermute(int[] A, int i, int start, int end) {
		if(consPrime(A)){
			i++;
		}
		
		for(int j=start; j<=end; j+=2){
			int temp = A[start];
			A[start] = A[j];
			A[j] = temp;
			i = ePermute(A, i, j, end);
			temp = A[start];
			A[start] = A[j];
			A[j] = temp;
		}
		
		return i;
	}

	private static boolean consPrime(int[] a) {
		if(!isPrime(a[0]+a[a.length-1])){
			return false;
		}
		for(int k=0; k<a.length-1;k++){
			if(!isPrime(a[k]+a[k+1])){
				return false;
			}
		}
		return true;
	}

	private static boolean isPrime(int a) {
		for(int i=2; i<i/2; i++){
			if(a%i ==0){
				return false;
			}
		}
		return true;
	}
}
