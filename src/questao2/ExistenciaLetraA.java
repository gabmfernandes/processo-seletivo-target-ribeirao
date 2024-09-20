package questao2;

import java.util.Scanner;

public class ExistenciaLetraA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = sc.next();


        if(quantidadeA(palavra) > 0){
            System.out.println("A string "+palavra+" possui a letra 'a' e contém "+quantidadeA(palavra)+ " aparições");
        }else{
            System.out.println("Não existe 'a' em "+palavra);
        }
    }

    static int quantidadeA(String texto){
        String textoMinusculo = texto.toLowerCase();
        int countA = 0;

        for (int i = 0; i < textoMinusculo.length(); i++) {
            if(texto.charAt(i) == 'a'){
                countA++;
            }
        }

        return countA;
    }
}
