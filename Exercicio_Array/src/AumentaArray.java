
public class AumentaArray extends MeuArray{
	public AumentaArray() {
		String[] vetor= new String[3];
		this.vetor = vetor;
	}
	@Override
	public String[] incrementar(String algo) {
		for (int i = 0; i<vetor.length; i++) {
			if (vetor[i]==null) {
				vetor[i] = algo;
				return vetor;
			}
		}
		int tamanho = (int)(1.5*(vetor.length));
		
		String vetor2[] = new String[tamanho];
		
		for (int i = 0; i<vetor.length; i++) {
			vetor2[i] = vetor[i];
		}
		
		vetor2[vetor.length] = algo;
		vetor = vetor2;
		return vetor;
	}
}