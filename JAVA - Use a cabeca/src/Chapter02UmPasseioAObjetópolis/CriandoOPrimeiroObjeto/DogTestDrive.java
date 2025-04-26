package Chapter02UmPasseioAObjetópolis.CriandoOPrimeiroObjeto;

public class DogTestDrive {
    public static void main(String[] args) {

        Dog rottweiler = new Dog();
        rottweiler.name = "Costela";
        rottweiler.breed = "Rottweiler";
        rottweiler.size = 50;
        rottweiler.dogInfo();
        rottweiler.bark();

        Dog poodle = new Dog();
        poodle.name = "Lolô";
        poodle.breed = "Poodle";
        poodle.size = 15;
        poodle.dogInfo();
        poodle.bark();
    }
}
