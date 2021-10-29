
/**
 * 
 * Segunda Parte - Javier Esmerado Vela - PSP
 * 
 * @author esmer
 *
 */
public class Chains {

	/**
	 * Declaramos todas nuestras variables.
	 */
	private int random = 0;
	private String fullText = "";
	private Integer max_lenght = 0;

	/**
	 * Constructor
	 */
	public Chains() {
		super();
	}

	/**
	 * Getters and Setters
	 */
	public Integer getRandom() {
		return random;
	}

	public void setRandom(Integer random) {
		this.random = random;
	}

	public String getFullText() {
		return fullText;
	}

	public void setFullText(String fullText) {
		this.fullText = fullText;
	}

	
	/**
	 * Método encargado de generar la cadena de tetxto.
	 */
	public void randomGeneratorText() {

		// Creamos un StringBuilder para unir las letras.
		StringBuilder strBld = new StringBuilder();
		
		// Generamos un número aleatorio de letras.
		max_lenght = (int) (Math.random() * (20 + 1 - 1) + 1);
		
		for (int i = 0; i < max_lenght; i++) {
			// Generamos un número ASCII aleatorio.
			random = (int) (Math.random() * (122 + 1 - 97) + 97);
			strBld.append(Character.toString((char) random));
		}
		fullText = strBld.toString();
		
		resultText();
	}

	/**
	 * Método que muestra el resultado.
	 */
	public void resultText() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return  fullText;
	}

	public static void main(String[] args) {

		Chains c = new Chains();

		c.randomGeneratorText();

	}

}
