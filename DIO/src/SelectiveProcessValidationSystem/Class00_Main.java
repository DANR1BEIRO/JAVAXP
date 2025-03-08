package SelectiveProcessValidationSystem;

public class Class00_Main {
    public static void main(String[] args) {
        String[] candidates = {"Bruce Wayne", "Thomas A. Anderson", "Hal Jordan", "Clark Kent", "Tank"};

        // Contact candidates
        Class03_ContactService contactService = new Class03_ContactService();
        for (String candidate : candidates) {
            contactService.contactCandidate(candidate);
        }

        // Print selected candidates
        Class02_SelectionProcess selectionProcess = new Class02_SelectionProcess();
        selectionProcess.printSelected();

        // Select candidates based on salary
        selectionProcess.selectCandidates();

        // Analyze a candidate's expected salary
        selectionProcess.analyzeCandidate(1900.0);
        selectionProcess.analyzeCandidate(2000.0);
        selectionProcess.analyzeCandidate(2200.0);
    }
}