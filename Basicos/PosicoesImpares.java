/**
 * GUARDANDO SOMENTE NAS POSIÇÕES IMPARES
 */

public class PosicoesImpares{
    public static void main(String[] args){
        int[] vetor = new int[10];

        for(int i = 0 ; i < vetor.length ; i++){
            vetor[i++] = i;
            System.out.println("Posição " + i + " : " + vetor[i]);
        }
    }
}