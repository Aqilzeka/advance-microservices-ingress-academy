package creation.fafctory;

public class CardPayment implements Payment{

  @Override
  public void pay() {
    System.out.println("Payed with card");
  }
}
