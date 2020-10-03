package dados;

import service.Dados;

public class D8 implements Dados{

	public void rolagem(int quantDados) {
		for (int i = 1; i<=quantDados; i++) {
			int roll = (int) (1+ Math.random()*((8-1)+1));
			System.out.println("d8 nº "+i+": "+roll);
		}
	}
}
