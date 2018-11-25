
public class MostrarMensaje { 
	
        public static void main(String[] args) {
        	
	        System.out.println("Proyecto de desarrollo");
	        
        	System.out.println(" Hola Mundo");
        	
        	int num1 = 10;
        	double doble = 7;
        	
        	double resultado = 0;
        	
			resultado = (int) num1 / doble;
			
			System.out.println(resultado);
			
		// REALIZAMOS UN CAMBIO EN EL PROYECTO	
			
			 int contador=0;
			 int acumulador=0;
			 int aleatorio=0;
			 aleatorio=(int)(Math.random()*10+1);
			 while (aleatorio!=3);
			 {
				 
				 System.out.println("aleatorio " +aleatorio);
				 acumulador+=aleatorio;
				 contador++;
				 aleatorio=(int)(Math.random()*10+1);
			 }
			 System.out.println(contador);
			 System.out.println(acumulador);
	
        }
}
