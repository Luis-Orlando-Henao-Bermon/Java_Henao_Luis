/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Uniminuto Tibu
 */
public class Mail {
    private String auditor;
	private String mensaje;

	public Mail to(String auditor) {
		this.auditor = auditor;
		return this;
	}

	public Mail withBody(String mensaje) {
		this.mensaje = mensaje;
		return this;
	}

	public String getAuditor() {
		return auditor;
	}

	public String getMensaje() {
		return mensaje;
	} 
}
