package ConversorMoneda;

import javax.swing.JOptionPane;

public class OpcionesConversionMoneda {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
		String datoConv = (JOptionPane.showInputDialog(null,
				"Elije la Moneda que quieras convertir","Moneda",
	            JOptionPane.PLAIN_MESSAGE,null,new Object[] 
	            		{"De Dolar a Peso Mex","De Euro a Peso Mex","De Libra a Peso Mex","De Yen a Peso Mex","De Won a Peso Mex",
	            		"De Peso Mex a Dolar","De Peso Mex a Euro","De Peso Mex a Libra","De Peso Mex a Yen","De Peso Mex a Won",
	            },"Seleccion")).toString();

		switch (datoConv) {
		case "De Dolar a Peso Mex":
			monedas.ConvertirDolaresPesoMexicano(valor);
			break;
			
		case "De Euro a Peso Mex":
			monedas.ConvertirEurosPesoMexicano(valor);
			break;
		
		case "De Libra a Peso Mex":
			monedas.ConvertirLibraPesoMexicano(valor);
			break;
		
		case "De Yen a Peso Mex":
			monedas.ConvertirYenPesoMexicano(valor);
			break;
			
		case "De Won a Peso Mex":
			monedas.ConvertirWonPesoMexicano(valor);
			break;
		
		case "De Peso Mex a Dolar":
			monedas.ConvertirPesoMexicanoDolares(valor);
			break;
		
		case "De Peso Mex a Euro":
			monedas.ConvertirPesoMexicanoEuro(valor);
			break;
			
		case "De Peso Mex a Libra":
			monedas.ConvertirPesoMexicanoLibra(valor);
			break;
			
		case "De Peso Mex a Yen":
			monedas.ConvertirPesoMexicanoYen(valor);
			break;
			
		case "De Peso Mex a Won":
			monedas.ConvertirPesoMexicanoWon(valor);
			break;
		}
	}
}
