
public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAShower(){
        if(this.pet != null) {
            System.out.println("Coloque o pet na maquina para iniciar o banho.");
            //return;
        }else{
            System.out.println("A maquina ja tem um pet. Aguarde sa vez!!!");
            return;
        }
        
        this.water -= 10;
        shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet "+ pet.getName() +" esta limpo.");
    }

    public void addWater(){
        if(water == 30){
            System.out.println("A capacidade de agua da maquina esta no maximo.");
            return;
        }

        System.out.println("Abasecendo a maquina de agua para 30L.");
        water += 2;
    }

    public void addShampoo(){
        if(shampoo == 10){
            System.out.println("A capacidade de shampoo da maquina esta no maximo.");
            return;
        }

        System.out.println("Abasecendo a maquina de shampoo para 10L.");
        shampoo += 2;
    }

    public int getWater() {
        System.out.println("Nível da água: ");
        return water;
    }

    public int getShampoo() {
        System.out.println("Nível do shampoo: ");
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A maquina esta suja. Primeiro tem que limpar.");
            return;
        }

        if(hasPet()) {
            System.out.println("Aguarde!!! O pet "+ this.pet.getName() +" esta na maquina.");
            return;
        }

        System.out.println("Insira o pet na maquina.");
        this.pet = pet;
        System.out.println("O pet "+ pet.getName() +" foi colocado na maquina.");
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        
        this.pet = null;
        System.out.println("O pet esta limpo.");
    }
    
    public void wash(){
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A limpeza da maquina foi feita com sucesso.");
    }

}
