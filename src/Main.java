import java.util.Scanner;

public class Main {

    static float nota1;
    static float nota2;
    static float nota3;
    static float nota4;

    static float media;

    public static void main(String[] args) {
        leituraDeNotas();
        mediaNotas();
        System.out.println("\nA sua média é: "+mediaNotas());
        verificaStatusDoAluno(mediaNotas());
        System.out.println(verificaStatusDoAluno(mediaNotas()));
    }
    private static String verificaStatusDoAluno(float media) {
        if (media >= 7){
            return "Você está aprovado";
        }else if (media >= 5){
            return "Você está de recuperação";
        }else{
            return "Você está reprovado";
        }
    }

    public static void leituraDeNotas(){
        Scanner num1 = new Scanner (System.in);
        System.out.println("Digite sua nota 1: ");
        nota1 = num1.nextFloat();

        Scanner num2 = new Scanner (System.in);
        System.out.println("Digite sua nota 2: ");
        nota2 = num2.nextFloat();

        Scanner num3 = new Scanner (System.in);
        System.out.println("Digite sua nota 3: ");
        nota3 = num3.nextFloat();

        Scanner num4 = new Scanner (System.in);
        System.out.println("Digite sua nota 4: ");
        nota4 = num4.nextFloat();
    }
    public static float mediaNotas(){
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        return media;
    }
    }