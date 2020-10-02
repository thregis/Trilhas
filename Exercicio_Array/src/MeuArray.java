

public class MeuArray {
	
String[] vetor;;
public MeuArray() {
	String[] vetor= new String[3];
	this.vetor = vetor;
	
}

public String[] incrementar(String algo){
	for (int i = 0; i<vetor.length; i++) {
		if (vetor[i]==null) {
			vetor[i] = algo;
			break;
		}
	}
return vetor;
}

public void remover(int x) {
	vetor[x] = null;	
}
public void ler(int x) {
	if ((x >=0)&& (x<=vetor.length)) {
	System.out.println("A posição pedida ("+x+") possui \""+vetor[x]+"\".");
	}
}
}
