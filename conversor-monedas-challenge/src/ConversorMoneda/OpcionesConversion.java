package ConversorMoneda;

import javax.swing.JOptionPane;

public class OpcionesConversion {

    ConvertirMonedaASoles monedas = new ConvertirMonedaASoles();
    ConvertirSolesAMoneda soles = new ConvertirSolesAMoneda();

    public void ConvertirMonedas(double valor) {
        String opciones = (JOptionPane.showInputDialog(null, "Seleccione el tipo de moneda a convertir", "Monedas", JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{"Soles a Dólar", "Soles a Euros", "Soles a Libras Esterlinas", "Soles a Yen",
                    "	Soles a Won Surcoreano", "Dólar a Soles", "De Euro a Soles", "De Libras Esterlinas a Soles", "De Yen a Soles",
                    "De Won Surcoreano a Soles"}, "Seleccion")).toString();

        switch (opciones) {
            case "Soles a Dólar":
                soles.solesADolar(valor);
                break;
            case "Soles a Euros":
                soles.solesAEuro(valor);
                break;
            case "Soles a Libras Esterlinas":
                soles.solesALibras(valor);
                break;
            case "Soles a Yen":
                soles.solesAYenes(valor);
                break;
            case "Soles a Won Surcoreano":
                soles.solesAWones(valor);
                break;
            case "Dólar a Soles":
                monedas.dolarASoles(valor);
                break;
            case "De Euro a Soles":
                monedas.eurosASoles(valor);
                break;
            case "De Libras Esterlinas a Soles":
                monedas.librasASoles(valor);
                break;
            case "De Yen a Soles":
                monedas.yensASoles(valor);
                break;
            case "De Won Surcoreano a Soles":
                monedas.wonASoles(valor);
                break;
            default:
                throw new AssertionError();
        }
    }
}
