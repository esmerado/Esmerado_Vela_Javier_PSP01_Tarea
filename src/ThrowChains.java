import java.util.Scanner;

/**
 * 
 * Tercera Parte - Javier Esmerado Vela - PSP
 * 
 * @author esmer
 *
 */
public class ThrowChains {

	/**
	 * Declaramos todas nuestras variables.
	 */
	private int numInstances = 0;

	
	/**
	 * Constructor
	 */
	public ThrowChains() {
		super();
	}
	
	/**
	 * 
	 * M�todo encargado de ejecutar el n�mero de veces introducida la app.
	 * 
	 * @param sc
	 */
	public void numberOfInstances(Scanner sc) {
		try {
			System.out.println("Introduce el n�mero de veces que quieres que se ejecute(1-10): ");
			numInstances = sc.nextInt();
			if(numInstances > 10 || numInstances <= 0) {
				System.err.println("Debe introducir un n�mero v�lido.");
				numberOfInstances(sc);
			} else {
				Chains c = new Chains();
				
				for(int i = 0; i < numInstances; i++) {
					c.randomGeneratorText();
				}
				
			}
		} catch (Exception e) {
			System.err.println("Debe introducir un valor v�lido.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ThrowChains tc = new ThrowChains();
		tc.numberOfInstances(sc);
	}
}

