import javax.swing.JOptionPane;


public class e {

	public static void main(String args[]){
		
		String sX = JOptionPane.showInputDialog("Valor de X?");
		String sN = JOptionPane.showInputDialog("Valor de N?");
		
		int x = Integer.parseInt(sX);
		int n = Integer.parseInt(sN);
		//iniciar la sumatoria
		double e = 1 + x ;
		System.out.print("1 + "+x);
		for (int i=2; i <= n ; i++){
			//calcular el factorial
			int factorial = 1;
			for (int j=1; j<=i;j++){
				factorial *= j;
			}
			
			//realizar la potencia entre el factorial
			double suma = Math.pow(x, i)/factorial;
			//sumar al resultado 
			e+=suma;
			System.out.print(" + ("+x+" ^ "+i+" / "+i+"!)");
		}
		System.out.println("\nEl resultado de e es: "+e+"\n");
	}
	
}
