import javax.swing.JOptionPane;

public class ConjuntosDos
{ 	
	static int a[],b[];
	
		
	public static void leerA() // realiza la lectura del conjunto A
    { 
       int n = Integer.parseInt(JOptionPane.showInputDialog(" de que tama�o es el conjunto A"));
	   a = new int[n]; // se hace el conjunto A
	   for(int k =0; k<n; k++)
	     a[k] = Integer.parseInt(JOptionPane.showInputDialog("Dame el valor A[" + k + "] "));

	}	
	

	public static void leerB() // realiza la lectura del conjunto B
    { 
       int n = Integer.parseInt(JOptionPane.showInputDialog(" de que tama�o es el conjunto B"));
	   b = new int[n]; // se hace el conjunto A
	   for(int k =0; k<n; k++)
	     b[k] = Integer.parseInt(JOptionPane.showInputDialog("Dame el valor B[" + k + "] "));

	}	
		
  
  public static void imprimirConjunto(int arr[]) // imprime el conjunto que se le env�e al m�todo
   {
    String resultado = "El conjunto es = {";
      
	 for (int k =0; k < arr.length; k++)
	   resultado += arr[k] + ", ";
	   
	resultado += "}";  // se cierra la llave
	
	JOptionPane.showMessageDialog(null,resultado);
	
   }	
	 
   
   public static void imprimirAmbos() // imprime en el area de texto ambos conjuntos
   {
     String resultado = "A = {";
	 for (int k = 0; k < a.length ; k++)
	    resultado += a[k] + ", ";
	
	resultado += "}\n";

    resultado += "B = {";
	for (int k = 0; k < b.length ; k++)
	    resultado += b[k] + ", ";

    resultado += "}";

	JOptionPane.showMessageDialog(null,resultado);
		
   }

    public static boolean busca(int x, int arr[])
    {
       for (int k = 0; k < arr.length ; k++)
          if ( x == arr[k])
            return true;

        return false;
    }

    
	public static void aMenosB()
	{
	  String resultado = "A - B = {";
      
	  for (int k=0; k < a.length; k++)
        if (!busca(a[k],b))
           resultado += "" + a[k] + ", ";
		   
	  resultado += "}";
      JOptionPane.showMessageDialog(null,resultado);
    }	  

	private static void bMenosA() {
		String resultado = "B - A = {";
		  //agregar todos los elementos de b que no esten en a
		  for (int k=0; k < b.length; k++)
	        if (!busca(b[k],a))
	           resultado += "" + b[k] + ", ";
			   
		  resultado += "}";
		  JOptionPane.showMessageDialog(null,resultado);
	}
	
	public static void aUnionB()
	{
	 String resultado = "A u B = {";
	 //resultado es todos los elementos de A
	 for (int k=0; k < a.length; k++)
	 {
		 resultado += "" + a[k] + ", ";
	 }
	 //y los elementos de B (Elementos que ya se hayan agregado en A no se agregan)
	 for (int k=0; k < b.length; k++)
	 {
		if (!busca(b[k], a))
		{
		 resultado += "" + b[k] + ", ";
		}
	 }
	 
	 resultado += "}";
	 JOptionPane.showMessageDialog(null, resultado);
	}
	
	public static void aInterseccionB(){
		String resultado = "A n B = {";
		 for (int k=0; k < a.length; k++){
			 //Si el elemento de a se encuentra en B es parte de la interseccion
			 if (busca(a[k], b))
				 resultado += "" + a[k] + ", ";
		 }
		 resultado += "}";
		 JOptionPane.showMessageDialog(null, resultado);
	}
	
	public static void main(String arg[])
    { 
     String lectura;
     int opcion;
	 
	 do
	 { 
       lectura = JOptionPane.showInputDialog(" CONJUNTOS \n" +
                                             "1. leer conjunto A \n"+	   
											 "2. leer conjunto B \n"+
											 "3. Ver conjunto A \n" +
											 "4. Ver conjunto B \n" +
											 "5. Ver ambos conjuntos\n " +
											 "6. Calcular A U B \n" +
											 "7. Calcular A n B \n" +
											 "8. Calcular A - B \n" +
											 "9. Calcular B - A \n" +
											 "10. terminar" );
		opcion = Integer.parseInt(lectura);
		switch(opcion)
		{
		  case 1: leerA();break;
		  case 2: leerB();break;
		  case 3: imprimirConjunto(a);break;
		  case 4: imprimirConjunto(b);break;
		  case 5: imprimirAmbos();break;
		  case 6: aUnionB(); break;
		  case 7: aInterseccionB(); break;
		  case 8: aMenosB();break;
		  case 9: bMenosA(); break;
		}
	 } while (opcion != 10); // fin del do
   } // fin del main	 


} // fin de la clase ConjuntosDos








 
