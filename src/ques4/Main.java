/*
    Write a program to show application of Factory Design Pattern.
 */

package ques4;

public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI("SBI", "Shahdara, Delhi-32",
                "XYZ", 4, 4.5f, 5.4f,
                8.9f);
        ICICI icici = new ICICI("ICICI", "Nehru Place", "ABC",
                8, 7.8f, 7.4f, 3.6f);

//        System.out.println(sbi);
//        System.out.println(icici);

        System.out.println("Name : " + sbi.getName());
        System.out.println("Address : " + sbi.getHeadOfficeAddress());
        System.out.println("Chairman name : " + sbi.getChairManName());
        System.out.println("Branch count : " + sbi.getBranchCount());
        System.out.println("FD Rate : " + sbi.getFdInterestRate());
        System.out.println("Home Rate : " + sbi.getHomeLoanInterestRate());
        System.out.println("Personal Loan Rate : " + sbi.getPersonalLoanInterestRate());

        System.out.println("");

        System.out.println("Name : " + icici.getName());
        System.out.println("Address : " + icici.getHeadOfficeAddress());
        System.out.println("Chairman name : " + icici.getChairManName());
        System.out.println("Branch count : " + icici.getBranchCount());
        System.out.println("FD Rate : " + icici.getFdInterestRate());
        System.out.println("Home Rate : " + icici.getHomeLoanInterestRate());
        System.out.println("Personal Loan Rate : " + icici.getPersonalLoanInterestRate());
    }
}