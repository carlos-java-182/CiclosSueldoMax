package sueldo;

import javax.swing.JOptionPane;

public class Máximo {

	public static void main(String[] args) {
		
		int num;
		float sueldo, mayor = 0, menor = 100000;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digita los sueldos que vas a ingresar"));
		
		for(int i=1; i<=num; i++) {
			
			sueldo=Float.parseFloat(JOptionPane.showInputDialog("Digita el sueldo No. "+i));
			
			if(sueldo>mayor) {
				
				mayor=sueldo;
			}
			if(sueldo<menor) {
				menor=sueldo;
			}
				
		}
		
		
		System.out.println("El sueldo mayor es: "+mayor);
		System.out.println("El sueldo menor es: "+menor);
		
		

	}

}
