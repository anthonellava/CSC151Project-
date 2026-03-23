import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PolicyDemo {
   public static void main(String[] args) throws IOException {
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);

      ArrayList<Policy> policies = new ArrayList<Policy>();
      int smokerCount = 0;
      int nonSmokerCount = 0;

      while (inputFile.hasNext()) {
         int policyNumber = Integer.parseInt(inputFile.nextLine());
         String providerName = inputFile.nextLine();
         String firstName = inputFile.nextLine();
         String lastName = inputFile.nextLine();
         int age = Integer.parseInt(inputFile.nextLine());
         String smokingStatus = inputFile.nextLine();
         double height = Double.parseDouble(inputFile.nextLine());
         double weight = Double.parseDouble(inputFile.nextLine());

         Policy policy = new Policy(policyNumber, providerName, firstName, lastName,
                                    age, smokingStatus, height, weight);

         policies.add(policy);

         if (smokingStatus.equalsIgnoreCase("smoker")) {
            smokerCount++;
         } else {
            nonSmokerCount++;
         }
      }

      inputFile.close();

      for (Policy policy : policies) {
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println();
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println();
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println();
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println();
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println();
         System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policy.getSmokingStatus());
         System.out.println();
         System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         System.out.println();
         System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         System.out.println();
         System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI());
         System.out.println();
         System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());
         System.out.println();
         System.out.println();
      }

      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println();
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}
