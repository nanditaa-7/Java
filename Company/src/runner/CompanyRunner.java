package runner;

import seviceBased.TcsCompany;

public class CompanyRunner {
    public static void main(String[] args) {
        TcsCompany tcs = new TcsCompany();
        tcs.productInformation("Email", "2004-01-04", "1.02v");
    }
}

