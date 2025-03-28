package Chapter02UmPasseioAObjetópolis.CriandoOPrimeiroObjeto;

public class Dog {
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("AU! AU!");
    }
    void dogInfo(){
        System.out.println("\nDog created:\nName: " + name + "\nBreed: "
                + breed + "\nSize: " + size);
        System.out.print(name + " says: ");

    }
}
