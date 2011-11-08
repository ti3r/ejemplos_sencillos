import javax.swing.JOptionPane;


public class Pi {

	public static void main(String args[]){
		//preguntar el numero de terminos
		String sTerminos = JOptionPane.showInputDialog("Cuantos terminos deseas incluir?");
		int terminos = Integer.parseInt(sTerminos);
		
		double pi = 4;
		double dividendo = 3;
		for(int i=0; i < terminos; i++){
			double parte = 4 / (dividendo);
			//revisar si esta parte es positiva o negativa
			if ( (i % 2) == 0 ){
				//si es la primera parte o tercera o quinta... a sumar a pi tiene que ser negativa
				parte = -1 * parte;
			}
			pi += parte;
			//incrementar el dividendo
			dividendo+=2;
		}
		System.out.println("PI = "+pi);
	}
	
}
