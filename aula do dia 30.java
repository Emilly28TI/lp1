/*import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(Sistem.in);
        
        Double soma=0;
        int contador=1;
	    
}
do{
    System.out.print("Digite a nota do aluno" + contador + ":");
    double nota = leitor.nextDouble();
    
    soma+=nota;
}
*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota;
        double soma =0;//contador
        while(i<10){
            system.out.printIn("Digite sua nota:");
            nota=input.nextDouble();
            soma+=nota;
            i++;//somador do contador
        }
        double total=soma/10;
        System.out.printIn("Soma da turma:"+soma);
        System.out.printIn("Media da turma:"+media);
        
    }
}
