public class Binary {
    public int[] changeToBinary(int value){
        int[] binary1 = new int[8];
        for(int i = 0 ; i < binary1.length ; i++){
            int bit = value % 2;
            binary1[i] = bit;
            value = value/2;
        }
        return binary1;
    }

    public static void main(String args[]){
        Binary bin = new Binary();
        int[] exit = bin.changeToBinary(2);
        for(int value : exit){
            System.out.print(value + " | ");
        }
        System.out.println("\n");
    }
}