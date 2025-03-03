package SelectiveProcessValidationSystem;

public class Case1_SalaryExpectation{

    public static String setSalaryExpectation(double salaryExpectation) {
        double baseSalary = 2000;

        if (salaryExpectation < baseSalary) {
            return "Call the candidate";
        } else if (salaryExpectation == baseSalary) {
            return "Call the candidate with a counteroffer";
        } else {
            return "Waiting for the results of the other candidates";
        }
    }
}


//Call the candidate
//Call the candidate with a counteroffer
//Waiting for the results of the other candidates