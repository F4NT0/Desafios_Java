
public class Binary {
    public int[] changeToBinary(int value){
        int[] binary2 = new int[8];
        int j = binary2.length-1; // começa no 7
        for(int i = 0 ; i < binary2.length ; i++){
            int bit = value % 2; // Pega o resto , que é o bit
            binary2[j] = bit; // j está salvando na ultima posição
            j--;
            value = value/2; // divide o valor, criando um valor novo
        }
        return binary2;
    }

    public int[] invertBits(int[] value){
        for(int i = 0 ; i < value.length;i++){
            if(value[i] == 0){
                value[i] = 1;
            }else{
                value[i] = 0;
            }
        }
        return value;
    }

    public int toDecimal(int[] value){
        double decimal = 0;
        for(int i = 0 ; i < value.length;i++){
            if(value[i] == 1){
                double exponent = (double) i;
                double calc = Math.pow(2.0, exponent);
                decimal = decimal + calc;
            }
        }
        return (int)decimal;
    }

    public static void main(String args[]){
        Binary bin = new Binary();

        System.out.println("Transformando Binário em Decimal");
        int[] exit = bin.changeToBinary(77);
        for(int value : exit){
            System.out.print(value + " | ");
        }
        System.out.println("\n");

        System.out.println("Invertendo os Bits");
        int[] exit2 = bin.invertBits(exit);
        for(int value : exit2){
            System.out.print(value + " | ");
        }
        System.out.println("\n");
        int novoValor = bin.toDecimal(exit2);
        System.out.println("Novo Valor: " + novoValor);

    }
}