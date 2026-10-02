//Atividade 1 (o anfitrião)//

import java.util.Scanner;

class Main{

public static void main (String[] args) {
    Scanner nome = new Scanner (System.in);
    Scanner leitor = new Scanner (System.in);
    System.out.print("Por gentileza, escreva seu nome:");
    String mensagem = leitor.nextLine();
    System.out.print(mensagem  +  ", seja bem vindo(a) ao mundo Java!");
    
}
}

//Atividade 2 (O entrevistador)//

import java.util.Scanner;

class Main{

public static void main (String[] args) {
    Scanner leitor = new Scanner (System.in);
    System.out.print("Por gentileza, escreva seu nome:");
    String nome = leitor.nextLine();
    System.out.print("Agora, escreva o nome da sua cidade:");
    String cidade = leitor.nextLine();
    System.out.print("Por fim, informe a sua idade:");
    String idade = leitor.nextLine();
    System.out.println("Dados cadastrados:");
    System.out.println("Nome:"+nome);
    System.out.println("Cidade:"+cidade);
    System.out.println("Idade:"+idade);
}
}
