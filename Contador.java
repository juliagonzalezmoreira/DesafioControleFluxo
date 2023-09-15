import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        try{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm =  scanner.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = scanner.nextInt();

        contar(parametroUm, parametroDois);
        scanner.close();

        } catch (ParametrosInvalidosException exceção) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }

		int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
			System.out.println("Imprimindo número: " + i);
		}
	}
}
