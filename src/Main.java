import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner= new Scanner(System.in);

        int[] vetor = new int[10];


        System.out.println("Digite 10 numeros aleatorios");
        for(int i=0;i<vetor.length;i++){
            vetor[i] = scanner.nextInt();
        }

        // Algoritmo Bubble Sort
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int valor = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = valor;
                }
            }

            for(int numeros : vetor){
                System.out.println(numeros + " ");
            }
        }
    }
}