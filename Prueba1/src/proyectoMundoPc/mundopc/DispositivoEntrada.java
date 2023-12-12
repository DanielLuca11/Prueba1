package proyectoMundoPc.mundopc;

public class DispositivoEntrada {

	private String tipoEntrada;
	private String marca;
	
	
	public DispositivoEntrada(String tipoEntrada, String marca) {
		super();
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DispositivoEntrada [tipoEntrada=");
		builder.append(tipoEntrada);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
