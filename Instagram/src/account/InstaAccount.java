package account;

public class InstaAccount {
    public String userID;
    public String password;
    public  long contactNumber;
    public String emailID;

    public void login(String userID,String password) {
        System.out.println("successfully logged into insta account");
        System.out.println("user id is:" + userID);
        System.out.println("password is :" + password);
    }

    public void login(long contactNumber,String password){
        System.out.println("successfully logged into insta account:"+InstaAccount);
        System.out.println ("contactNumber is:"+contactNumber);
        System.out.println("password is:"+password);
    }
}
}
