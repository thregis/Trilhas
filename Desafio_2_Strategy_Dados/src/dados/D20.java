package dados;

import service.Dados;

public class D20 implements Dados{
	
	public void rolagem(int quantDados) {
		for (int i = 1; i<=quantDados; i++) {
			int roll = (int) (1+ Math.random()*((20-1)+1));
			System.out.println("d20 nº "+i+": "+roll);
		}
	}
}
