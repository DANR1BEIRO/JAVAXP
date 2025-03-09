package introduction.SelectiveProcessValidationSystem;

import java.util.Random;

public class Class03_ContactService {
    public void contactCandidate(String candidate) {
        int attemptsMade = 1;
        boolean keepTrying = true,
                answered = false;
        do {
            answered = answerCall();
            keepTrying = !answered;
            if (keepTrying)
                attemptsMade++;
            else
                System.out.println("Contact successfully made");
        } while (keepTrying && attemptsMade < 3);

        if (answered)
            System.out.println("We made contact with " + candidate + " on attempt " + attemptsMade);
        else
            System.out.println("We could not contact " + candidate + ". Maximum attempts reached: " + attemptsMade);
    }

    private boolean answerCall() {
        return new Random().nextInt(3) == 1;
    }
}