import javax.swing.JOptionPane;


public class Inversion {


	public static void main(String args[]){
		String cantidad = JOptionPane.showInputDialog("Cantidad a Invertir?");
		String interes = JOptionPane.showInputDialog("Tasa de interes?");
		double p = Double.parseDouble(cantidad);
		double r = Integer.parseInt(interes)/100.0;
		StringBuilder result = new StringBuilder("Tabla de Intereses Ganados\n");
		result.append("Año     Total\n");
		for(int i=1; i <= 10; i++){
			double a = p * Math.pow((1 + r),i);
			result.append(i+"     "+a+"\n");
		}
		JOptionPane.showMessageDialog(null,result.toString());
	}
}
