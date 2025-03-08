package SelectiveProcessValidationSystem;

import java.util.concurrent.ThreadLocalRandom;

public class Class02_SelectionProcess {
    private static final double BASE_SALARY = 2000.0;

    public void printSelected() {
        String[] candidates = {"Bruce Wayne", "Thomas A. Anderson", "Hal Jordan", "Clark Kent", "Tank"};
        System.out.println("Printing the list of candidates with their index:");

        for (int index = 0; index < candidates.length; index++) {
            System.out.println("Candidate number " + (index + 1) + " is " + candidates[index]);
        }
    }

    public void selectCandidates() {
        String[] candidates = {"Bruce Wayne", "Thomas A. Anderson", "Hal Jordan", "Clark Kent", "Tank",
                "Bruce Banner", "Alan Moore", "Neil deGrasse Tyson", "Carl Sagan"};

        int selectedCandidates = 0,
                currentCandidate = 0;
        while (selectedCandidates < 5 && currentCandidate < candidates.length) {
            String candidate = candidates[currentCandidate];
            double expectedSalary = expectedSalary();

            System.out.println("The candidate " + candidate + " requested this salary amount: " + expectedSalary);
            if (BASE_SALARY >= expectedSalary) {
                System.out.println("The candidate " + candidate + " was selected for the position");
                selectedCandidates++;
            }
            currentCandidate++;
        }
    }

    public void analyzeCandidate(double expectedSalary) {
        if (BASE_SALARY > expectedSalary) {
            System.out.println("Call the candidate");
        } else if (BASE_SALARY == expectedSalary) {
            System.out.println("Call the candidate with a counteroffer");
        } else {
            System.out.println("Waiting for the results of the other candidates");
        }
    }

    private double expectedSalary() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }
}