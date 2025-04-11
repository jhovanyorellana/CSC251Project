import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("PolicyInformation.txt");
        Scanner scanner = new Scanner(file);
        int smokerCount = 0;
        int nonSmokerCount = 0;

        while (scanner.hasNextLine()) {
            int policyNumber = Integer.parseInt(scanner.nextLine());
            String providerName = scanner.nextLine();
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String smokingStatus = scanner.nextLine();
            double height = Double.parseDouble(scanner.nextLine());
            double weight = Double.parseDouble(scanner.nextLine());

            // Create PolicyHolder and Policy
            PolicyHolder holder = new PolicyHolder(
                firstName, lastName, age, smokingStatus, height, weight
            );
            Policy policy = new Policy(policyNumber, providerName, holder);

            // Count smokers/non-smokers
            if (smokingStatus.equals("Y")) smokerCount++;
            else nonSmokerCount++;

            // Implicit toString() call
            System.out.println(policy + "\n");
        }

        // Output statistics
        System.out.printf("There were %d Policy objects created.\n", Policy.getPolicyCount());
        System.out.printf("Smokers: %d\nNon-smokers: %d\n", smokerCount, nonSmokerCount);

        scanner.close();
    }
}
