
public class LimitaArray extends MeuArray{
	public LimitaArray() {
		String[] vetor= new String[3];
		this.vetor = vetor;
	}
	
	@Override
	public String[] incrementar(String algo){
		for (int i = 0; i<vetor.length; i++) {
				if (vetor[i]==null) {
					vetor[i] = algo;
					return vetor;			
				}
				
				if((i == vetor.length-1) && (vetor[vetor.length-1] != null)) {
					System.out.println("Limite de tamanho alcançado. Operação não permitida.");
				}
			}
		return vetor;
		}
	
}

