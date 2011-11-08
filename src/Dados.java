import javax.swing.JOptionPane;


public class Dados {

	public static void main(String args[]){
		
		String sPersonas = JOptionPane.showInputDialog("Cuantas personas lanzarán dados?");
		int personas = Integer.parseInt(sPersonas);
		int ganadores5 = 0;
		int ganadores3 = 0;
		int perdedores = 0;
		
		for (int i=0; i < personas; i++){
			int dados = (int) (Math.random()*6)+1;
			dados += (int) (Math.random()*6)+1;
			if (dados == 7 || dados == 11){
				//ganas 5 pesos
				ganadores5++;
			}else if (dados == 2 || dados == 3 || dados == 12){
				ganadores3++;
			}else{
				perdedores++;
			}
		}
		
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("Personas que ganaron $5 = "+ganadores5+"\n");
		mensaje.append("Personas que ganaron $3 = "+ganadores3+"\n");
		mensaje.append("Personas que no ganaron nada = "+perdedores+"\n");
		JOptionPane.showMessageDialog(null, mensaje.toString());
	}
	
}
