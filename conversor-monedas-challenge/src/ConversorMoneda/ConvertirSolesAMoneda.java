package ConversorMoneda;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class ConvertirSolesAMoneda {
    
    public void solesADolar(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double dolar = valor / 3.86;
        JOptionPane.showMessageDialog(null, "Tienes " + df.format(dolar) + " dólares");
    }
    
    public void solesAEuro(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double euro = valor / 3.88;
        JOptionPane.showMessageDialog(null, "Tienes €" + df.format(euro) + " euros");
    }
    
    public void solesALibras(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double dolar = valor /4.54;
        JOptionPane.showMessageDialog(null, "Tienes £" + df.format(dolar) + " libras esterlinas");
    }
    
    public void solesAYenes(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double dolar = valor / 0.028;
        JOptionPane.showMessageDialog(null, "Tienes ¥" + df.format(dolar) + " yenes");
    }
    
    public void solesAWones(double valor){
        DecimalFormat df = new DecimalFormat("#.00");
        double dolar = valor / 0.0029;
        JOptionPane.showMessageDialog(null, "Tienes " + df.format(dolar) + " wones surcoreanos");
    }
    
}