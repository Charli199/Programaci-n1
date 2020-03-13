package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	String opc;
	int opci;
	String alim;
	String alim1;
	String alim2;

	public void mostrarMenu() {

		boolean salir = false;

		opc = "0";
		opci = Integer.parseInt(opc);
		opci = 0;

		while (opci < 1 || opci > 4) {

			opc = JOptionPane.showInputDialog(null,
					"SELECCIONAR UNA OPCION: \n 1.-Alimentar al Canino\n 2.-Alimentar al Felino\n 3.-Alimentar al Roedor\n 4.-Salir ");
			opci = Integer.parseInt(opc);

		}

	}

	public int leerObccion() {

		return opci;

	}

	public void alimetarCon() {

		alim = JOptionPane.showInputDialog(null, "Con que quiere alimentar el canino: ");

	}
	
	public void alimetarFe() {

		alim1 = JOptionPane.showInputDialog(null, "Con que quiere alimentar el felino: ");

	}
	
	
	public void alimetarRo() {

		alim2 = JOptionPane.showInputDialog(null, "Con que quiere alimentar el roedor: ");

	}

	public String getAlim() {
		return alim;
	}

	public void setAlim(String alim) {
		this.alim = alim;
	}

	
	public String getAlim1() {
		return alim1;
	}

	public void setAlim1(String alim1) {
		this.alim1 = alim1;
	}
	
	public String getAlim2() {
		return alim2;
	}

	public void setAlim2(String alim2) {
		this.alim2 = alim2;
	}
}
