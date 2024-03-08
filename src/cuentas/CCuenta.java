package cuentas;

/**
 * @author Moisés Antonio Pestano Castro
 */
public class CCuenta {


    /**
     * Nombre del propietario de la cuenta
     */
    private String nombre;
    /**
     * Nombre de la cuenta
     */
    private String cuenta;
    /**
     * Saldo disponible en la cuenta
     */
    private double saldo;
    /**
     * Tipo de interés asociado a la cuenta
     */
    private double tipoInterés;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * 
     * @param nom  Nombre del propietario de la cuenta
     * @param cue  Nombre de la cuenta
     * @param sal  Saldo disponible en la cuenta
     * @param tipo Tipo de interés asociado a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * @return Saldo asociado a la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * @param cantidad Cantidad a ingresar
     * @throws Exception Excepción por defecto
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * @param cantidad Cantidad a retirar
     * @throws Exception Excepción por defecto
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * @return Tipo de interés asociado a la cuenta
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés Tipo de interés asociado a la cuenta
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * @return Saldo de la cuenta
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo Saldo de la cuenta
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return Nombre de la cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta nombre de la cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return Nombre del propietario de la cuenta
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre Nombre del propietario de la cuenta
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
