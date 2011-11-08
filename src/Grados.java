import javax.swing.JOptionPane;


public class Grados {

	
	public static void main(String args[]){
		String valInicial = JOptionPane.showInputDialog("Valor inicial?");
		String valFinal = JOptionPane.showInputDialog("Valor Final?");
		String valIncremento = JOptionPane.showInputDialog("Incremento?");
		
		int vInicial = Integer.parseInt(valInicial);
		int vFinal = Integer.parseInt(valFinal);
		int incremento = Integer.parseInt(valIncremento);
		
		//revisar si el incremento debe ser negativo
		if (vFinal < vInicial){
			incremento = -1 * incremento;
		}
		
		StringBuilder resultado = new StringBuilder("Tabla de equivalencias de grados centigrados, farenheit, kelvin y Rankie\n");
		resultado.append("Centi\tFaren\tKelvin\tRankie\n");
		boolean terminar = false;
		while(!terminar)
		{
			double centi = vInicial;
			double fare = 1.8 * centi + 32;
			double kelvin = centi + 273.15;
			double rankie = 1.8 * kelvin;
			resultado.append(centi+"\t"+fare+"\t"+kelvin+"\t"+rankie+"\n");
			//incrementar el valor inicial
			vInicial += incremento;
			//revisar si es necesario terminar.
			if (incremento < 0){
				//revisar si el valor inicial es menor que el final si el incremento es negativo
				terminar = (vInicial < vFinal);
			}else{
				terminar = (vFinal < vInicial);
			}
		}
		//Mostrar el resultado en consola
		System.out.println(resultado.toString());
	}
}
