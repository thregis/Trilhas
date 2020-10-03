package dados;

import java.util.Scanner;

import service.Dados;

public class Principal {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Qual o tipo de dado que quer rolar?\n (d4, d6, d8, d10, d12 ou d20)");
	String tipoDado = leitor.next();
	tipoDado = tipoDado.toLowerCase();
	
	System.out.println("Quantos dados do tipo especificado quer rolar?");
	int quantDados = leitor.nextInt();
	
	
	Dados dado;
	
	switch(tipoDado){
	case "d4":
		dado = new D4();
		break;
	case "d6":
		dado = new D6();
		break;
	case "d8":
		dado = new D8();
		break;
	case "d10":
		dado = new D10();
		break;
	case "d12":
		dado = new D12();
		break;
	case "d20":
		dado = new D20();
		break;
	default:
		System.out.println("Erro. tipo de dado informado não é válido.");
		leitor.close();
		return;
	}

	dado.rolagem(quantDados);
	
	leitor.close();
	
	}
}
