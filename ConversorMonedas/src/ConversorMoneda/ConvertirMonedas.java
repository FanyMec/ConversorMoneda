package ConversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void ConvertirPesoMexicanoDolares(double valor) {
		double monedaDolar = valor / 0.056;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares" );
	}
	
	public void ConvertirPesoMexicanoEuro(double valor) {
		double monedaEuro = valor / 0.052;
		monedaEuro = (double)Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros" );
	}
	
	public void ConvertirPesoMexicanoLibra(double valor) {
		double monedaLibra = valor / 0.045;
		monedaLibra = (double)Math.round(monedaLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libra" );
	}
	
	public void ConvertirPesoMexicanoYen(double valor) {
		double monedaYen = valor / 7.80;
		monedaYen = (double)Math.round(monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen" );
	}
	
	public void ConvertirPesoMexicanoWon(double valor) {
		double monedaWon = valor / 75.10;
		monedaWon = (double)Math.round(monedaWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won" );
	}
	
	//Conversion de otras monedas a Pesos Mexicanos
	public void ConvertirDolaresPesoMexicano(double valor) {
		double monedaDolar = valor *17.73;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " en pesos mexicanos" );
	}
	
	public void ConvertirEurosPesoMexicano(double valor) {
		double monedaEuro = valor *19.08;
		monedaEuro = (double)Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " en pesos mexicanos" );
	}
	
	public void ConvertirLibraPesoMexicano(double valor) {
		double monedaLibra = valor *21.97;
		monedaLibra = (double)Math.round(monedaLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " en pesos mexicanos" );
	}
	
	public void ConvertirYenPesoMexicano(double valor) {
		double monedaYen = valor *0.13;
		monedaYen = (double)Math.round(monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " en pesos mexicanos" );
	}
	
	public void ConvertirWonPesoMexicano(double valor) {
		double monedaWon = valor *0.013;
		monedaWon = (double)Math.round(monedaWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " en pesos mexicanos" );
	}
	
	
	
}
