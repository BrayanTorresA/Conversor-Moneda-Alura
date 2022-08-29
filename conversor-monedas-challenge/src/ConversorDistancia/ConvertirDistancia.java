package ConversorDistancia;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvertirDistancia {
	
	public void convertirMetrosAMillas(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        double millas = valor * 0.00062;
        JOptionPane.showMessageDialog(null, +valor + " metros son " + df.format(millas) + " millas");
    }
	
	public void convertirMetrosAYardas(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        double yardas = valor * 1.094;
        JOptionPane.showMessageDialog(null, +valor + " metros son " + df.format(yardas) + " yardas");
    }
	
	public void convertirMetrosAPulgadas(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        double yardas = valor * 39.37;
        JOptionPane.showMessageDialog(null, +valor + " metros son " + df.format(yardas) + " pulgadas");
    }
	
	public void convertirMillasAMetros(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        double metros = valor / 0.00062;
        JOptionPane.showMessageDialog(null, +valor + " millas " + df.format(metros) + " metros");
    }
	
	public void convertirYardasAMetros(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        double metros = valor / 1.094;
        JOptionPane.showMessageDialog(null, +valor + " yardas " + df.format(metros) + " metros");
    }
	
	public void convertirPulgadasAMetros(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        double metros = valor / 39.37;
        JOptionPane.showMessageDialog(null, +valor + " pulgadas " + df.format(metros) + " metros");
    }
	
	
}
