package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
        this.letras = letras;
	}
    
    public String getInterpretacion() {
        return interpretacion;
    }

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public int cantidadLetras() {
		int cantidad = 0;
		for (String i : letras) {
			if (i instanceof String) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public String interpretacion() {
		return interpretacion;
	}

	public String toString() {
		return String.join(", ", letras);
	}

}
