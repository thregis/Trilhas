
public class Principal{
public static void main(String[] args) {
	MeuArray array = new MeuArray();
	DobraArray arrayDobra = new DobraArray();
	AumentaArray arrayAumenta = new AumentaArray();
	LimitaArray arrayLimita = new LimitaArray();
	

	/*
	array.incrementar("algo");
	for(int i= 0; i< array.vetor.length; i++) {
		System.out.println(array.vetor[i]);
	}
	array.remover(2);
	for(int i= 0; i< array.vetor.length; i++) {
		System.out.println(array.vetor[i]);
	}
	array.ler(2);
	

	}*/
	
	//IMPLEMENTAÇÃO DOBRANDO A ARRAY
	System.out.println("----------DOBRA----------------");
	arrayDobra.incrementar("a");
	arrayDobra.incrementar("b");
	arrayDobra.incrementar("c");
	arrayDobra.incrementar("d");
	arrayDobra.incrementar("e");
	for(int i= 0; i< arrayDobra.vetor.length; i++) {
		System.out.println(arrayDobra.vetor[i]);
	}
	System.out.println("-------------------------------");
	arrayDobra.remover(2);
	arrayDobra.remover(3);
	
	arrayDobra.ler(0);
	arrayDobra.ler(2);
	arrayDobra.ler(4);
	System.out.println("-------------------------------");
	
	System.out.println("-----------+METADE-------------");
	
	arrayAumenta.incrementar("1");
	arrayAumenta.incrementar("2");
	arrayAumenta.incrementar("3");
	arrayAumenta.incrementar("4");
	arrayAumenta.incrementar("5");
	for(int i = 0; i<arrayAumenta.vetor.length;i++) {
		System.out.println(arrayAumenta.vetor[i]);
	}
	System.out.println("-------------------------------");
	arrayAumenta.remover(1);
	arrayAumenta.remover(2);
	
	arrayAumenta.ler(0);
	arrayAumenta.ler(2);
	arrayAumenta.ler(3);
	System.out.println("-------------------------------");
	
	System.out.println("----------LIMITANDO------------");
	arrayLimita.incrementar("alfa");
	arrayLimita.incrementar("beta");
	arrayLimita.incrementar("gama");
	arrayLimita.incrementar("delta");
	for(int i = 0; i<arrayLimita.vetor.length; i++) {
		System.out.println(arrayLimita.vetor[i]);
	}
	arrayLimita.remover(2);
	arrayLimita.ler(2);
	arrayLimita.incrementar(":D");
	arrayLimita.ler(2);
	
	
	
	
}
}