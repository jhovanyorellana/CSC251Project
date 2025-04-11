public class Policy {
    private static int policyCount = 0; // Static counter
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder; // Class collaboration

    // Constructor
    public Policy(int policyNumber, String providerName, PolicyHolder holder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(holder); // Defensive copy
        policyCount++;
    }

    // Getters (with defensive copying for PolicyHolder)
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public PolicyHolder getPolicyHolder() { 
        return new PolicyHolder(policyHolder); 
    }

    // Calculate policy price
    public double calculatePrice() {
        double baseFee = 600;
        double additionalFee = 0;

        if (policyHolder.getAge() > 50) additionalFee += 75;
        if (policyHolder.getSmokingStatus().equals("Y")) additionalFee += 100;
        if (policyHolder.calculateBMI() > 35) additionalFee += (policyHolder.calculateBMI() - 35) * 20;

        return baseFee + additionalFee;
    }

    // Static method to get policy count
    public static int getPolicyCount() { return policyCount; }

    // toString
    @Override
    public String toString() {
        return String.format(
            "Policy Number: %d\nProvider Name: %s\n%s\nPolicy Price: $%.2f",
            policyNumber, providerName, policyHolder.toString(), calculatePrice()
        );
    }
}
