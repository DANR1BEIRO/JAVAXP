package BradescoJavaCloudNative.OOP.EnumsExamples;

public class IBGESystem {
    public static void main(String[] args) {

        for(BrazilianStates e: BrazilianStates.values()) {
            System.out.println(e.getStateCode() + " - " + e.getName());
        }

        BrazilianStates BS = BrazilianStates.CEARA;

        System.out.println(BS.getName());
        System.out.println(BS.getStateCode());
        System.out.println(BS.getUpperCaseName());

    }
}
