package BradescoJavaCloudNative.introduction.SelectiveProcessValidationSystem;

public class Class01_Candidate {
    private String name;
    private double expectedSalary;

    public Class01_Candidate(String name, double expectedSalary) {
        this.name = name;
        this.expectedSalary = expectedSalary;
    }

    public String getName() {
        return name;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    @Override
    public String toString() {
        return "Candidate: " + name + ", Expected Salary: " + expectedSalary;
    }
}