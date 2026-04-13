import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PolicyDemo
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);

      int smokerCount = 0;
      int nonSmokerCount = 0;

      while (inputFile.hasNext())
      {
         int policyNumber = Integer.parseInt(inputFile.nextLine());
         String providerName = inputFile.nextLine();
         String firstName = inputFile.nextLine();
         String lastName = inputFile.nextLine();
         int age = Integer.parseInt(inputFile.nextLine());
         String smokingStatus = inputFile.nextLine();
         double height = Double.parseDouble(inputFile.nextLine());
         double weight = Double.parseDouble(inputFile.nextLine());

         if (inputFile.hasNextLine())
            inputFile.nextLine();

         PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age,
                                                      smokingStatus, height, weight);

         Policy policy = new Policy(policyNumber, providerName, policyHolder);

         System.out.println(policy);
         System.out.println();

         if (smokingStatus.equalsIgnoreCase("smoker"))
            smokerCount++;
         else
            nonSmokerCount++;
      }

      inputFile.close();

      System.out.println("There were " + Policy.getNumberOfPolicies() + " Policy objects created.");
      System.out.println();
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}
