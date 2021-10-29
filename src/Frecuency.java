import java.util.Scanner;

/**
 * 
 * Primera Parte - Javier Esmerado Vela - PSP
 * 
 * @author esmer
 *
 */
public class Frecuency {

	/**
	 * Declaramos todas nuestras variables.
	 */
	private String inputText;
	private Integer a = 0;
	private Integer e = 0;
	private Integer i = 0;
	private Integer o = 0;
	private Integer u = 0;

	/**
	 * 
	 * Constructor
	 * 
	 */
	public Frecuency() {
	}

	// Getters and Setters
	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText) {
		this.inputText = inputText;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getE() {
		return e;
	}

	public void setE(Integer e) {
		this.e = e;
	}

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public Integer getO() {
		return o;
	}

	public void setO(Integer o) {
		this.o = o;
	}

	public Integer getU() {
		return u;
	}

	public void setU(Integer u) {
		this.u = u;
	}

	/**
	 * 
	 * Método encargado de contar las vocales.
	 * 
	 * @param inputText
	 */
	public void vocalCount(String inputText) {

		// Convertimos nuestro String en un Char para separar los carácteres.
		char[] charText = inputText.toCharArray();

		// Iteramos nuestro char para que vaya analizando cada una de nuestras letras.
		for (int var = 0; var < charText.length; var++) {
			char letra = inputText.charAt(var);
			// Contamos las vocales.
			if (String.valueOf(letra).equals("a")) {
				a += 1;
			} else if (String.valueOf(letra).equals("e")) {
				e += 1;
			} else if (String.valueOf(letra).equals("i")) {
				i += 1;
			} else if (String.valueOf(letra).equals("o")) {
				o += 1;
			} else if (String.valueOf(letra).equals("u")) {
				u += 1;
			}
		}

		
		showResult();
		
	}
	
	/**
	 * Método encargado en mostrar el resultado
	 */
	public void showResult() {
		System.out.println(toString());
	}

	/**
	 * 
	 * Método encargado de obtener el texto a procesar.
	 * 
	 * @param sc
	 */
	public void inputTextScanner(Scanner sc) {

		String tmp = ""; 
		
		System.out.println("Introduzca la palabra que desea examinar: ");
		tmp = sc.next();
		this.inputText = tmp;
	}

	@Override
	public String toString() {
		return "Palabra: " + inputText + "\n a: " + a + " | e: " + e + " | i: " + i + " | o: " + o + " | u: " + u;
	}

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Frecuency f = new Frecuency();
		
		f.inputTextScanner(sc);
		f.vocalCount(f.getInputText());
		
	}

}