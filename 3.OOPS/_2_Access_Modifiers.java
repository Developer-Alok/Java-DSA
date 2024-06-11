class BankAccount {
  public String Name;
  private String Password;

  void changePassword(String newPassword) {
    Password = newPassword;
    System.out.println(Password);
  }

}

public class _2_Access_Modifiers {
  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount();
    // myAccount.Password="3" not possible

    myAccount.Name = "Gobinda";
    myAccount.changePassword("12345678");

    System.out.println(myAccount.Name);

  }

}
