public class Policy
{
   // Fields
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;   // in inches
   private double weight;   // in pounds

   // No-arg constructor
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }

   // Constructor with arguments
   public Policy(int policyNumber, String providerName,
                 String firstName, String lastName,
                 int age, String smokingStatus,
                 double height, double weight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }

   // Setters
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }

   public void setHeight(double height)
   {
      this.height = height;
   }

   public void setWeight(double weight)
   {
      this.weight = weight;
   }

   // Getters
   public int getPolicyNumber()
   {
      return policyNumber;
   }

   public String getProviderName()
   {
      return providerName;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public int getAge()
   {
      return age;
   }

   public String getSmokingStatus()
   {
      return smokingStatus;
   }

   public double getHeight()
   {
      return height;
   }

   public double getWeight()
   {
      return weight;
   }

   // Method to calculate BMI
   public double calculateBMI()
   {
      return (weight * 703) / (height * height);
   }

   // Method to calculate policy price
   public double calculatePolicyPrice()
   {
      double price = 600;

      if (age > 50)
         price += 75;

      if (smokingStatus.equalsIgnoreCase("smoker"))
         price += 100;

      double bmi = calculateBMI();

      if (bmi > 35)
         price += (bmi - 35) * 20;

      return price;
   }
}
