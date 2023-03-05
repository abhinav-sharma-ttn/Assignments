package questions.ques1;

// Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate.

abstract class Bank {
    private String name, headOfficeAddress, chairManName;
    private int branchCount;
    private float fdInterestRate, personalLoanInterestRate, homeLoanInterestRate;

    // constructor
    public Bank() {

    }
    public Bank(String name, String headOfficeAddress, String chairManName, int branchCount,
                float fdInterestRate, float personalLoanInterestRate, float homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairManName = chairManName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public String getChairManName() {
        return chairManName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public float getFdInterestRate() {
        return fdInterestRate;
    }

    public float getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public float getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public void setChairManName(String chairManName) {
        this.chairManName = chairManName;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public void setFdInterestRate(float fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public void setPersonalLoanInterestRate(float personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(float homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        String str = name + ", " + headOfficeAddress + ", " + chairManName + ", " + branchCount + ", " + fdInterestRate + ", " + personalLoanInterestRate + ", " +
                homeLoanInterestRate;
        return str;
    }
}
