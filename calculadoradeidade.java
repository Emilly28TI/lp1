import java.util.Scanner;
public class CalculadoraDeIdade {
    public static void main(String[] args) {
      
       Scanner input=new Scanner(System.in);
        int anoatual;
        int anoDeNascimento;
        int idade;
        System.out.print("Digite o ano atual em que você está:");
        anoatual=input.nextInt();
        System.out.print("Digite seu ano de nascimento:");
        anoDeNascimento=input.nextInt();
        idade=anoatual-anoDeNascimento;
        System.out.printIn(idade)
        
    }
}


//calculadoradeidade(pedir ano atual e ano em que nasceu, subtrair e imprimir: "Sua idade aproximada é [resultado da subtração] anos."//


// média de aluno do IF (pedir duas notas, calcular a média aritmética(dividir por 2) e somar pra ter a média final//


//Convrsos de moedas (o programa deve pedir um valor em reais e exibir em dólares. A cotação fixa pra cada 1 dólar é 5,38 reais.//

