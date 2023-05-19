package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversionTemperatura {
	
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double valor) {
		String datoConv = (JOptionPane.showInputDialog(null,
				"Elije la Temperatura que quieras convertir","Temperatura",
	            JOptionPane.PLAIN_MESSAGE,null,new Object[] 
	            		{"De Celsius a Kelvin","De Kelvin a Celsius",
	            },"Seleccion")).toString();
	
		switch (datoConv) {
		case "De Celsius a Kelvin":
			temperatura.ConvertirCelsiusKerlvin(valor);
			break;
			
		case "De Kelvin a Celsius":
			temperatura.ConvertirKerlvinCelsius(valor);
			break;
		}
		
	}
}
