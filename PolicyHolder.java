public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height; // in inches
    private double weight; // in pounds

    // Constructor
    public PolicyHolder(String firstName, String lastName, int age, 
                       String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Copy constructor (for defensive copying)
    public PolicyHolder(PolicyHolder holder) {
        this.firstName = holder.firstName;
        this.lastName = holder.lastName;
        this.age = holder.age;
        this.smokingStatus = holder.smokingStatus;
        this.height = holder.height;
        this.weight = holder.weight;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    // BMI calculation
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    // toString
    @Override
    public String toString() {
        return String.format(
            "Policyholder's First Name: %s\nPolicyholder's Last Name: %s\n" +
            "Policyholder's Age: %d\nPolicyholder's Smoking Status (Y/N): %s\n" +
            "Policyholder's Height: %.1f inches\nPolicyholder's Weight: %.1f pounds\n" +
            "Policyholder's BMI: %.2f",
            firstName, lastName, age, 
            smokingStatus.equals("Y") ? "smoker" : "non-smoker", 
            height, weight, calculateBMI()
        );
    }
}
