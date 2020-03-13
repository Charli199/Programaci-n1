package co.edu.unbosque.model;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.View;

public class Felino extends Mamifero {

	private String alimento;

	public void alimentar() {

		View vis = new View();

		vis.alimetarFe();

		alimento = vis.getAlim1();

		JOptionPane.showMessageDialog(null, "EL felino fue alimentado con: " + alimento);

	}
}
