package br.bom.alura.conversordemoeda;

import javax.swing.JOptionPane;

public class Menu {
	
		private static double valorTotal;
		private static double valor = 0;

		public static void main(String[] args) {
		
		int option = 0;
		
		
		
		do {
			option = Integer.parseInt(JOptionPane.showInputDialog("1.Real para Dolar\n" 
		+ "2.Real para Euro\n" 
		+ "3.Real para Libras\n" 
		+ "4.Real para Peso Argentino\n" 
		+ "5.Real para Peso Chileno\n" 
		+ "6.Dolar para Real\n" 
		+ "7.Euro para Real\n" 
		+ "8.Libras para Real\n"
		+ "9.Peso Argentino para Real\n"));
					
				
			switch (option) {
			case 1: 
				try {
				Double.valueOf(JOptionPane.showConfirmDialog(null,"Real para Dolar"));						
			   double valor =  Double.valueOf(JOptionPane.showInputDialog("Informe o valor desejado"));
				valorTotal = valor * 4.80;
				JOptionPane.showMessageDialog(null, "O total é " + valorTotal);
				} catch (Exception ex) {
					 break;
				}
			case 2:
				try {
					Double.valueOf(JOptionPane.showConfirmDialog(null,"Real para Euro"));						
				   double valor =  Double.valueOf(JOptionPane.showInputDialog("Informe o valor desejado"));
					valorTotal = valor * 5.38;
					JOptionPane.showMessageDialog(null, "O total é " + valorTotal);
					} catch (Exception ex) {
						 break;
					}				
			case 3:
				try {
					Double.valueOf(JOptionPane.showConfirmDialog(null,"Real para Libras"));						
				   double valor =  Double.valueOf(JOptionPane.showInputDialog("Informe o valor desejado"));
					valorTotal = valor * 6.29;
					JOptionPane.showMessageDialog(null, "O total é " + valorTotal);
					} catch (Exception ex) {
						 break;
					}				
			case 4:
				try {
					Double.valueOf(JOptionPane.showConfirmDialog(null,"Real para Peso Argentino"));						
				   double valor =  Double.valueOf(JOptionPane.showInputDialog("Informe o valor desejado"));
					valorTotal = valor * 0.018;
					JOptionPane.showMessageDialog(null, "O total é " + valorTotal);
					} catch (Exception ex) {
						 break;
					}
				
			case 5:
				try {
					Double.valueOf(JOptionPane.showConfirmDialog(null,"Real para Peso Chileno"));						
				   double valor =  Double.valueOf(JOptionPane.showInputDialog("Informe o valor desejado"));
					valorTotal = valor * 0.0059;
					JOptionPane.showMessageDialog(null, "O total é " + valorTotal);
					} catch (Exception ex) {
						 break;
					}
				
			case 6:
				try {
					Double.valueOf(JOptionPane.showConfirmDialog(null,"Dolar para Real"));						
				   double valor =  Double.valueOf(JOptionPane.showInputDialog("Informe o valor desejado"));
					valorTotal = valor / 4.80;
					JOptionPane.showMessageDialog(null, "O total é " + valorTotal);
					} catch (Exception ex) {
						 break;
					}
				
			case 7:
				try {
					Double.valueOf(JOptionPane.showConfirmDialog(null,"Real para Euro"));						
				   double valor =  Double.valueOf(JOptionPane.showInputDialog("Informe o valor desejado"));
					valorTotal = valor / 5.38;
					JOptionPane.showMessageDialog(null, "O total é " + valorTotal);
					} catch (Exception ex) {
						 break;
					}
				
			case 8:
				try {
					Double.valueOf(JOptionPane.showConfirmDialog(null,"Libras para Real"));						
				   double valor =  Double.valueOf(JOptionPane.showInputDialog("Informe o valor desejado"));
					valorTotal = valor / 6.29;
					JOptionPane.showMessageDialog(null, "O total é " + valorTotal);
					} catch (Exception ex) {
						 break;
					}	
			case 9:
				try {
					Double.valueOf(JOptionPane.showConfirmDialog(null,"Peso Argentino para Real"));						
				   double valor =  Double.valueOf(JOptionPane.showInputDialog("Informe o valor desejado"));
					valorTotal = valor / 0.018;
					JOptionPane.showMessageDialog(null, "O total é " + valorTotal);
					} catch (Exception ex) {
						 break;
					}
				
			case 10:
				try {
					Double.valueOf(JOptionPane.showConfirmDialog(null,"Peso Chileno para Real"));						
				   double valor =  Double.valueOf(JOptionPane.showInputDialog("Informe o valor desejado"));
					valorTotal = valor * 0.0059;
					JOptionPane.showMessageDialog(null, "O total é " + valorTotal);
					} catch (Exception ex) {
						 break;
					}
			default: {
			  break;
			}
		
			}
		} while (option <= 9);
    	
		
		
}

			public static double getValor() {
			return valor;
		}

		public static void setValor(double valor) {
			Menu.valor = valor;
		}
	}