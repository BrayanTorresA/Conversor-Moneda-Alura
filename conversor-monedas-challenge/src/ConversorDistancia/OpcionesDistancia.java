package ConversorDistancia;

import javax.swing.JOptionPane;


public class OpcionesDistancia {
	
	ConvertirDistancia distancia = new ConvertirDistancia();
	
	public void ConvertirDistancia(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Distancia", JOptionPane.PLAIN_MESSAGE, null,
                new Object[] {"Metros a Millas", "Metros a Yardas", "Metros a Pulgadas","Millas a Metros","Yardas a Metros",
                    "Pulgadas a Metros"}, "Seleccion")).toString();
        
        switch(opcion) {
        case "Metros a Millas":
        	distancia.convertirMetrosAMillas(Minput);
        	break;
        case "Metros a Yardas":
            distancia.convertirMetrosAYardas(Minput);
            break;
        case "Metros a Pulgadas":
           distancia.convertirMetrosAPulgadas(Minput);
           break;
        case "Millas a Metros":
           distancia.convertirMillasAMetros(Minput);
           break;
        case "Yardas a Metros":
        	distancia.convertirYardasAMetros(Minput);
        	break;
        case "Pulgadas a Metros":
        	distancia.convertirPulgadasAMetros(Minput);
        	break;
        }
	}
}
