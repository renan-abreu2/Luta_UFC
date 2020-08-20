package UltraCombat;

public class Programa {
	public static void main(String[] args) {
		
	Lutador l[] = new Lutador[6];
		
	  l[0] = new Lutador("Renan", "Brasil", 26, 1.86f, 105.1f, 10, 0 ,2 );	
	  
	  l[1] = new Lutador("Bruno", "Espanha", 34, 1.66f, 76.5f, 2, 8 ,2 );	
	  
	  l[2] = new Lutador("Carlos", "EUA", 26, 1.86f, 105.1f, 10, 0 ,2 );	
	  
	  l[3] = new Lutador("Marcos", "Japão", 26, 1.86f, 105.1f, 10, 0 ,2 );	
	  
	  l[4] = new Lutador("Naldo", "Alemanha", 26, 1.86f, 105.1f, 10, 0 ,2 );	
	  
	  l[5] = new Lutador("Vander", "Argentina", 26, 1.86f, 105.1f, 10, 0 ,2 );	
		
	
	
	
		Luta UEC01 = new Luta();
		
		UEC01.marcarLuta(l[3], l[0]);
		UEC01.lutar();
		
		
		
		
		l[3].status();
	
	}

}
