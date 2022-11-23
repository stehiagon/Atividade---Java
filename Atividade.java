import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Atividade {
    public static void main(String[] args){
        //1- Faça um programa que peça dois números inteiros. Imprima a soma desses dois números na tela.
        Scanner entrada = new Scanner(System.in);

        System.out.println("EXERCÍCIO 1");
        System.out.println("Digite dois números:");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma desses dois números é: " + soma);

        //2- Escreva um programa que leia um valor em metros e exiba convertido em centímetros.
        System.out.println("EXERCÍCIO 2");
        System.out.println("Digite um número:");
        int metros = entrada.nextInt();
        int centimetros = metros * 100;
        System.out.println("Seu valor em centímetros é: " + centimetros + " cm");

        //3- Escreva um program que pergunte a velocidade do carro de um usuário. Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa, cobrando R$ 5,00 por km acima de 80Km/h.
        System.out.println("EXERCÍCIO 3");
        System.out.println("Digite a velocidade do seu carro:");
        int vel = entrada.nextInt();

        if(vel <= 80){
            System.out.println("Você não foi multado");
        }
        else{
            int multa = (vel - 80) * 5;
            System.out.println("Você foi multado " + multa);
        }

        //4- Escreva um programa que pergunte o salário do funcionário e calcule o valor do aumento. Para salários supeiores a R$ 1.250,00, calcule o aumento de 10%. Para inferiores ou iguais, de 15%.
        System.out.println("EXERCÍCIO 4");
        System.out.println("Digite o seu salário:");
        double salario = entrada.nextDouble();

        if(salario > 1250){
            double resultado1 = (salario * 10/100);
            double salarioFinal1 = salario + resultado1;
            System.out.println("Salário final de: " + salarioFinal1);
        }
        else{
            double resultado2 = (salario * 15/100);
            double salarioFinal2 = salario + resultado2;
            System.out.println("Salário final de: " + salarioFinal2);
        }
      
    }
}