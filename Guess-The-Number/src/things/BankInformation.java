package things;

public class BankInformation {
        public String accountHolderName;
        public long accountNumber;
        public long contactNumber;

        public void getBankInformation(long accountNumber){
            System.out.println("Account Number :"+accountNumber);
        }
        public void getBankInformation(String accountHolderName){
            System.out.println("Account Holder Name :"+accountHolderName);

        }
        public void getBankInformation(long accountNumber,String accountHolderName){
            System.out.println("Account Holder Name :"+accountHolderName);
            System.out.println("Account Number:"+accountNumber);

        }

}
