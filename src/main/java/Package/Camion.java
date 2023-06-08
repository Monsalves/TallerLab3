package Package;

public class Camion {

	private String marca;
	private Boolean obsoleto;
	private String ruedas;
	private String motor;

	public Camion(String marca , Boolean obs, String ruedas,String motor){
		this.marca = marca;
		this.obsoleto = obs;
		this.ruedas = ruedas;
		this.motor = motor;
	}

	public String getMotor() {
		return this.motor;
	}

	/**
	 *
	 * @param motor
	 */
	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getRuedas() {
		return this.ruedas;
	}

	/**
	 *
	 * @param ruedas
	 */
	public void setRuedas(String ruedas) {
		this.ruedas = ruedas;
	}

	public Boolean getObsoleto() {
		return this.obsoleto;
	}

	/**
	 *
	 * @param obsoleto
	 */
	public void setObsoleto(Boolean obsoleto) {
		this.obsoleto = obsoleto;
	}

	public String getMarca() {
		return this.marca;
	}

	/**
	 *
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return ("Marca: "+ marca +"\n" +"Está obsoleto: " + obsoleto +"\n"+"Ruedas: " + ruedas+"\n" + "Motor: " + motor);
	}
}