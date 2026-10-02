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

//Atividade 3 (Calculadora de Idade)//

import java.util.Scanner;

class Main{

public static void main (String[] args) {
    Scanner leitor = new Scanner (System.in);
    System.out.print("Por gentileza, informe o ano que você nasceu:");
    int anoDeNascimento = leitor.nextInt();
    System.out.print("Agora, escreva o ano atual:");
    int anoAtual = leitor.nextInt();
    System.out.println("Sua idade aproximada é:");
    System.out.println(anoAtual - anoDeNascimento);
}
}

//atividade 4 (Média do Aluno IF)//

import java.util.Scanner;

class Main{

public static void main (String[] args) {
    Scanner leitor = new Scanner (System.in);
    System.out.print("Informe a primeira nota da unidade:");
    double N1 = leitor.nextDouble();
    System.out.print("Agora, informe a segunda nota da unidade:");
    double N2 = leitor.nextDouble();
    double media = (N1 + N2)/2;
    System.out.println("Sua média é:" + media);
}
}

/*

INCOMPLETO
    
atividade 5 (Conversor de Moedas)


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main{

public static void main (String[] args) {
    Scanner leitor = new Scanner (System.in);
    System.out.println("Quanto você possui em R$?");
    long valorEmReais = leitor.nextLong();
    BigDecimal 1dolar = 5.38
    System.out.println("Em dólar você possui:"+);
}
}

INCOMPLETO


/*
