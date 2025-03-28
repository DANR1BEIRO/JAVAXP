package Chapter01AguasJavonicasMergulhe;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"Goku", "Naruto", "Ryuk"};
        String[] wordListTwo = {"abraça", "beija", "cheira"};
        String[] wordListThree = {"rato", "cachorro", "macaco"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();

        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println(phrase);
    }
}
