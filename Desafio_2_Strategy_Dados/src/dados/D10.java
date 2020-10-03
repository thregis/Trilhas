package dados;

import service.Dados;

public class D10 implements Dados{
	
	public void rolagem(int quantDados) {
		for (int i = 1; i<=quantDados; i++) {
			int roll = (int) (1+ Math.random()*((10-1)+1));
			System.out.println("d10 nº "+i+": "+roll);
		}
	}

}
