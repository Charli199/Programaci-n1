package co.edu.unbosque.model;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.View;

public class Roedor extends Mamifero {

	private String alimento;

	public void alimentar() {

		View vis = new View();

		vis.alimetarRo();

		alimento = vis.getAlim2();

		JOptionPane.showMessageDialog(null, "EL roedor fue alimentado con: " + alimento);

	}

}
