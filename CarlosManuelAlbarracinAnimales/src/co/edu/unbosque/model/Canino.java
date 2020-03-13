package co.edu.unbosque.model;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.View;

public class Canino extends Mamifero {

	private String alimento;

	public void alimentar() {

		View vis = new View();

		vis.alimetarCon();

		alimento = vis.getAlim();

		JOptionPane.showMessageDialog(null, "EL canino fue alimentado con: " + alimento);

	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

}
