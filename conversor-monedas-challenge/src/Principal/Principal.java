package Principal;

import javax.swing.JOptionPane;

import ConversorDistancia.OpcionesDistancia;
import ConversorMoneda.OpcionesConversion;
import ConversorTemperatura.OpcionesTemperatura;

public class Principal{
	
    public static void main(String[] args) {
        OpcionesConversion monedas = new OpcionesConversion();
        OpcionesTemperatura temperatura = new OpcionesTemperatura();
        OpcionesDistancia distancia = new OpcionesDistancia();
        
        boolean salir = false;

        while (salir == false) {

            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE,
                    null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura","Conversor de Distancia"}, "Seleccion")).toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        monedas.ConvertirMonedas(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Continuando con el programa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            salir = true;
                         
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if ((respuesta == 0) && (ValidarNumero(input) == true)) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            salir = true;
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
                    
                case "Conversor de Distancia":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la Distancia que deseas convertir ");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        distancia.ConvertirDistancia(Minput);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if ((respuesta == 0) && (ValidarNumero(input) == true)) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            salir = true;
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break; 
            }
        }

    }

    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}