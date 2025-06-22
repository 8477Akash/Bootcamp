package Module_1.Q6;

public class Bank {
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public Bank(){}

    public Bank(String name, String headOfficeAddress, String chairmanName, int branchCount, double fdInterestRate,
                double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    public String getName() {
        return this.name;
    }

    public String getChairmanName() {
        return this.chairmanName;
    }

    public String getHeadOfficeAddress() {
        return this.headOfficeAddress;
    }

    public double getFdInterestRate() {
        return this.fdInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return this.homeLoanInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return this.personalLoanInterestRate;
    }

    public int getBranchCount() {
        return this.branchCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    @Override
    public String toString() {
        return "Bank Name = " + name + "\n" +
                "headOfficeAddress = " + headOfficeAddress + "\n" +
                "chairmanName = " + chairmanName + "\n" +
                "branchCount = " + branchCount + "\n" +
                "fdInterestRate = " + fdInterestRate + "\n" +
                "personalLoanInterestRate = " + personalLoanInterestRate + "\n" +
                "homeLoanInterestRate = " + homeLoanInterestRate;
    }
}