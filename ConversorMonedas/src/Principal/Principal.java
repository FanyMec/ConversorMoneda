package Principal;

import javax.swing.JOptionPane;

import ConversorMoneda.OpcionesConversionMoneda;
import ConversorTemperatura.OpcionesConversionTemperatura;

public class Principal {
	public static void main(String[] args) {

	OpcionesConversionMoneda conversionM = new OpcionesConversionMoneda();
	OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();
	
	while(true) {
		String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de Conversion", "Menú", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"Convertidor de Monedas","Convertidor de Temperatura"}, "Elegir").toString();
		
		switch (opciones) {
		case "Convertidor de Monedas":
			String input = JOptionPane.showInputDialog(null,"Ingrese el valor a convertir");
			double valorRecibido = Double.parseDouble(input);
			conversionM.ConvertirMonedas(valorRecibido);
			
			int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra Conversión?");
			if(JOptionPane.OK_OPTION == respuesta) {
				System.out.println("");
			}else {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
			}
			break;
			
			
		case "Convertidor de Temperatura":
			String input2 = JOptionPane.showInputDialog(null,"Ingrese el valor a convertir");
			double valorRecibidoT = Double.parseDouble(input2);
			conversionT.ConvertirTemperatura(valorRecibidoT);
			
			int respuestaT = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra Conversión?");
			if(JOptionPane.OK_OPTION == respuestaT) {
				System.out.println("");
			}else {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
			}
			break;
			
		}
	}
}

}
