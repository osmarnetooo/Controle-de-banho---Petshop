import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        //scanner.useDelimiter("\\n");
        var option = -1;

        do { 
            System.out.println(" ");
            System.out.println("=== Escolha uma da opções. === ");
            System.out.println("1 - Da banho no pet.");
            System.out.println("2 - Abastecer com água.");
            System.out.println("3 - Abastecer com shampoo;");
            System.out.println("4 - Verificar nivel de água.");
            System.out.println("5 - Verificar nivel de shampoo.");
            System.out.println("6 - Verificar se tem pet no banho.");
            System.out.println("7 - Colocar pet na maquina.");
            System.out.println("8 - Retirar pet da máquina.");
            System.out.println("9 - Limpar maquina.");
            System.out.println("0 - Sair.");
            System.out.println(" ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção invaida.");
            }
        } while (true);
    }

    private static void setWater(){
        System.out.println("Tentando colocar água na maquina.");
        petMachine.addWater();
    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na maquina.");
        petMachine.addShampoo();
    }

    public static void setPetInPetMachine(){
        var name = "";
        while(name == null || name.isEmpty()){
            System.out.print("Informe o nome do pet: ");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);

    }
    
    public static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na maqina" : "Não tem pet na maquina.");
    }

    public static void verifyShampoo(){
        var amout = petMachine.getShampoo();
        System.out.println("A maquina está com "+ amout +" Litro(s) de shampoo.");
    }
    
    public static void verifyWater(){
        var amout = petMachine.getWater();
        System.out.println("A maquina está com "+ amout +" Litro(s) de água.");
    }
    
    
}
