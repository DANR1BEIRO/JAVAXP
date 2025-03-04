public class EqualsTest {
    public static void main(String[] args) {

        // Strings declared simply are stored in the String Pool
        // Java automatically stores "Goku" in the String pool. Since name3 and
        // name4 have the same content("Goku"), they share the same memory reference
        // (both variables points to the same place).
        String name1 = "Goku";
        String name2 = "Goku";

        System.out.println(name1 == name2); // true because they have the same reference
        System.out.println(name1.equals(name2)); // also true because they have the same content

        // When using `new String()`, a NEW object is created
        // each `new String("Goku")` creates a new object in heap memory, outside the String pool
        // (heap memory is a part of the computer's memory (RAM) where Java
        // stores objects at runtime).
        // So, name3 and name4 are now different objects, even though they have
        // the same content. Their memory references are different
        String name3 = new String("Goku");
        String name4 = new String("Goku");

        // .equals() method
        System.out.println(name3.equals(name4)); // true because they have the same content
        // double equals ==
        System.out.println(name3 == name4); // false because they have different addresses in memory

    }
}

/*
* When we create a simple String, it is automatically stored in the String Pool.
* If another simple variable is declared with the same value, Java reuses the same reference to save memory.
* But when we use new String(), we create a new object in heap memory, outside the String Pool.
* Even if the content is the same, this new object will have a different memory address.
* The method .equals() always returns true if the contents are the same, no matter where the
* objects are stored in memory.

* The == operator checks if two variables point to the same object in memory, so:
    For simple strings in the String Pool, == can return true.

    For strings created with new String(), == always returns false,
    * because each instance is a separate object.*/
