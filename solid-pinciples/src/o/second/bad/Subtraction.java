package o.second.bad;

public class Subtraction implements Operation {

  private double firstNumber;
  private double secondNumber;
  private double result;

  public Subtraction(double firstNumber, double secondNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.result = 0.0;
  }

  public double getFirstNumber() {
    return firstNumber;
  }

  public double getSecondNumber() {
    return secondNumber;
  }

  public double getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result = result;
  }
}
