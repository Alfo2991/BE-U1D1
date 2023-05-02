import java.util.Arrays;
 
public class Main1 {

	public static void main(String[] args) {

		System.out.println("Ciao questo è il mio primo progetto Backend!");
		
		int a = 2;
		int b = 5;
		int moltiplicazione = Moltiplica (a,b);
		System.out.println("Il risultato della moltiplicazione di "+ a +" * " + b + " è uguale a " + moltiplicazione );
		
		
		String s = "Gelati";
		int n = 2;
		String concatena = Concatena (s,n);
		System.out.println("Mangerei non 1 ma " + concatena);
		
		 String[] arr = {"uno", "due", "tre", "quattro", "cinque"};
		    String str = "sei";
		    String[] nuovoArr = InserisciInArray(arr, str);
		    System.out.println("Il nuovo array è: " + Arrays.toString(nuovoArr));

		}
		
		
	
	public static int Moltiplica(int x, int y) {
        return x * y;
    }
	public static String Concatena(String s, int n) {
        String stringaNumero = Integer.toString(n);
        return s + stringaNumero;
    }public static String[] InserisciInArray(String[] arr, String str) {
        String[] newArr = new String[6];
        newArr[0] = arr[0];
        newArr[1] = arr[1];
        newArr[2] = str;
        newArr[3] = arr[2];
        newArr[4] = arr[3];
        newArr[5] = arr[4];
        return newArr;
    }

}
