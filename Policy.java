public class Policy
{
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;

   private static int numberOfPolicies = 0;

   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      policyHolder = new PolicyHolder();
      numberOfPolicies++;
   }

   public Policy(int policyNumber, String providerName, PolicyHolder policyHolder)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = policyHolder;
      numberOfPolicies++;
   }

   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }

   public void setPolicyHolder(PolicyHolder policyHolder)
   {
      this.policyHolder = policyHolder;
   }

   public int getPolicyNumber()
   {
      return policyNumber;
   }

   public String getProviderName()
   {
      return providerName;
   }

   public PolicyHolder getPolicyHolder()
   {
      return policyHolder;
   }

   public static int getNumberOfPolicies()
   {
      return numberOfPolicies;
   }

   public double getPolicyPrice()
   {
      double price = 600.0;

      if (policyHolder.getAge() > 50)
         price += 75.0;

      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
         price += 100.0;

      if (policyHolder.getBMI() > 35)
         price += (policyHolder.getBMI() - 35) * 20;

      return price;
   }

   public String toString()
   {
      return "Policy Number: " + policyNumber +
             "\nProvider Name: " + providerName +
             "\n\n" + policyHolder +
             "\nPolicy Price: $" + String.format("%.2f", getPolicyPrice());
   }
}
}
