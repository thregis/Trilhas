package dados;

import service.Dados;

public class D12 implements Dados{

	public void rolagem(int quantDados) {
		for (int i = 1; i<=quantDados; i++) {
			int roll = (int) (1+ Math.random()*((12-1)+1));
			System.out.println("d12 nº "+i+": "+roll);
		}
	}
}
