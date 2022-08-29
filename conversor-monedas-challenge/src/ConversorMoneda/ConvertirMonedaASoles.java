package ConversorMoneda;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class ConvertirMonedaASoles {
    
     public void dolarASoles(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double soles = valor * 3.86;
        JOptionPane.showMessageDialog(null, "Tienes S/" + df.format(soles) + " soles");
    }
    
    public void eurosASoles(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double soles = valor * 3.88;
        JOptionPane.showMessageDialog(null, "Tienes S/" + df.format(soles) + " soles");
    }
    
    public void librasASoles(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double soles = valor * 4.54;
        JOptionPane.showMessageDialog(null, "Tienes S/" + df.format(soles) + " soles");
    }
    
    public void yensASoles(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double soles = valor * 0.028;
        JOptionPane.showMessageDialog(null, "Tienes S/" + df.format(soles) + " soles");
    }
    
    public void wonASoles(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double soles = valor * 0.0029;
        JOptionPane.showMessageDialog(null, "Tienes S/" + df.format(soles) + " soles");
    }
}