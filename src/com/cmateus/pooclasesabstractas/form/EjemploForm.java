package com.cmateus.pooclasesabstractas.form;

import java.util.ArrayList;
import java.util.List;

import com.cmateus.pooclasesabstractas.form.elementos.*;
import com.cmateus.pooclasesabstractas.form.elementos.select.Opcion;
import com.cmateus.pooclasesabstractas.form.validador.EmailValidador;
import com.cmateus.pooclasesabstractas.form.validador.LargoValidador;
import com.cmateus.pooclasesabstractas.form.validador.NoNuloValidador;
import com.cmateus.pooclasesabstractas.form.validador.NumeroValidador;
import com.cmateus.pooclasesabstractas.form.validador.RequeridoValidador;

public class EjemploForm {

	public static void main(String[] args) {
		
		InputForm username = new InputForm ("username");
		username.addValidador(new RequeridoValidador());
		
		InputForm password = new InputForm ("clave", "password");
		password.addValidador(new RequeridoValidador());
		password.addValidador(new LargoValidador(6,12));
		
		InputForm email = new InputForm ("email", "email");
		email.addValidador(new RequeridoValidador());
		email.addValidador(new EmailValidador());
		
		InputForm edad = new InputForm ("edad", "number");
		edad.addValidador(new NumeroValidador());	
		
		TextareaForm experiencia = new TextareaForm("exp", 5,9);
		
		SelectForm lenguaje = new SelectForm("Lenguaje");
		lenguaje.addValidador(new NoNuloValidador());
		
		Opcion java = new Opcion ("1", "java");
		lenguaje.addopcion(java);
		lenguaje.addopcion(new Opcion ("2","Python"));
		lenguaje.addopcion(new Opcion ("3","JavaScript"));
		lenguaje.addopcion(new Opcion ("4","TypeScript"));
		lenguaje.addopcion(new Opcion ("5","PHP"));
		
		ElementoForm saludar = new ElementoForm ("saludo") {

			@Override
			public String dibujarHtml() {
					return "<input disabled name ='"+this.nombre+"' value =\""+this.valor+ "\">";
			}
			
		};
		saludar.setValor("Hola que tal, este campo está deshabilitado");
		username.setValor("Cesar.Mateus");
		password.setValor("a1b2c3");
		email.setValor("cesar.mateus@correo.com");
		edad.setValor("32");
		experiencia.setValor("... más de 10 años de experiencia ...");
		java.setSelected(true);
		
		List<ElementoForm> elementos = new ArrayList<>();
		elementos.add(username);
		elementos.add(password);
		elementos.add(email);
		elementos.add(edad);
		elementos.add(experiencia);
		elementos.add(lenguaje);
		elementos.add(saludar);
		
		for (ElementoForm e: elementos) {
			System.out.println(e.dibujarHtml());
			System.out.println("<br>");
		}
		
		elementos.forEach(e -> {
			if (!e.esValido()) {
				e.getErrores().forEach(System.out::println);
			}
			
		});
		
	}

}
