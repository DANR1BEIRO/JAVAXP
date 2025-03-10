package BradescoJavaCloudNative.OOP.school;

public class School {
    public static void main(String[] args) {

        Student Naruto = new Student("Naruto Uzumaki", 13);
        Naruto.setVillage("Hidden Leaf");

        System.out.println("The student called " + Naruto.getName() + " is " + Naruto.getAge()
        + " years old");
    }
}
