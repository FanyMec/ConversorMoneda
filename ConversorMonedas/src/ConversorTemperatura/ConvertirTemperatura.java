package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	public void ConvertirCelsiusKerlvin(double valor) {
		double CelKel = valor / 274.15;
		CelKel = (double)Math.round(CelKel * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + CelKel + "° Kelvin" );
	}
	
	public void ConvertirKerlvinCelsius(double valor) {
		double KelCel = valor + (-274.15);
		KelCel = (double)Math.round(KelCel * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + KelCel + "° Celsius" );
	}
}
