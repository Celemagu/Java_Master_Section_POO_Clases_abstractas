package com.cmateus.pooclasesabstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

import com.cmateus.pooclasesabstractas.form.validador.LargoValidador;
import com.cmateus.pooclasesabstractas.form.validador.Validador;
import com.cmateus.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

abstract public class ElementoForm { //la clase debe ser abstracta para que sus metddos puedan ser abstractos
	
	protected String valor;
	protected String nombre;
	
	private List<Validador> validadores;
	private List<String> errores;
	
	public ElementoForm() {
		this.validadores= new ArrayList<>();
		this.errores= new ArrayList<>();
	}

	public ElementoForm(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public ElementoForm addValidador(Validador validador) {
		this.validadores.add(validador);
		return this;
	}
	
	public List<String> getErrores() {
		return errores;
	}
	
	


	public void setValor(String valor) {
		this.valor = valor;
	}

	
	public boolean esValido() {
		for (Validador v: validadores) {
			if(!v.esValido(this.valor)) {
				if (v instanceof MensajeFormateable) {
					this.errores.add(((MensajeFormateable)v).getMensajeFormateado(nombre));
				}else {
				this.errores.add(String.format(v.getMensaje(),nombre));
				}
			}
		}
		
		return this.errores.isEmpty();
	}
	
	abstract public String dibujarHtml();// clases abstractas no tienen cuerpo por lo tanto no deben llevar { }
	
	

	
	
	
	
	
}
