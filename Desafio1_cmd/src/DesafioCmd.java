
public class DesafioCmd {
	public static void main(String[] args) {
		System.out.print("\'");
		for(int i = 1; i<11; i++) {
			if (i < 10 && i!= 9){
				System.out.print(i+", ");
			}else if(i == 9) {
				System.out.print(i);
			}else {
				System.out.println(" ou "+i+"\'");
			}
			
		}
		//System.out.println("\'1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10\'");
	}
}
