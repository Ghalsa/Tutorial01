import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author ghina.almira
 *
 */
public class lab1b {
	
	public static void main(String args[]){
		String[] kumpulanN;
		
		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){
			String[] angka = input.readLine().split("");
			int n = Integer.valueOf(angka[0]);
			int k = Integer.valueOf(angka[2]);
			
			kumpulanN = new String[n];
			String angkaN = input.readLine();

			for(int i = n; i>0; i--){
				kumpulanN[i] = angkaN;
			}
			
			System.out.println("done");
		}
		catch(Exception e ){
	    }
		
	}

}
