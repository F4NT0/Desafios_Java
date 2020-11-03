public class AlterarString{
    public static void main(String args[]){
        String teste = "Nivelamento";

        System.out.println("charAt(0) - deve ser N : " + teste.charAt(0));
        System.out.println("compareTo(Nivelamento) - deve dar 0 se for igual: " + teste.compareTo("Nivelamento"));
        System.out.println("concat( De Informação) - deve adicionar nova String na antiga: " + teste.concat(" De Informação"));
        System.out.println("contains(N) - deve retornar true: " + teste.contains("N"));
        System.out.println("equals(Nivelamento) - deve retornar true: " + teste.equals("Nivelamento"));
    }
}