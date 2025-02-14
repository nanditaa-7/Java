package runner;

import Things.CompanyInfo;

public class CompanyInfoRunner {
    public static void main(String[]args){
        System.out.println("Company Name:"+ CompanyInfo.companyName);
        System.out.println("Company Email Id:"+CompanyInfo.companyEmailId);
        System.out.println("No Of Employee:"+CompanyInfo.noOfEmployee);
        System.out.println("Contact Number:"+CompanyInfo.contactNumber);
    }
}
