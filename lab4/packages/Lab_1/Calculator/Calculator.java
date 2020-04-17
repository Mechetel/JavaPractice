package packages.Lab_1.Calculator;
public class Calculator {
  private int plus(int a, int b) {
    return a + b;
  }
  private int multiply(int a, int b) {
    return a * b;
  }
  private int minus(int a, int b) {
    return a - b;
  }
  private int leftShift(int a, int b) {
    int res = a << b;
    return res;
  }
  private int binaryAndEquall(int a, int b) {
    return a &= b;
  }
  private boolean boolOneAnd(boolean a, boolean b) {
    return a & b;
  }
  private boolean boolTwoAnd(boolean a, boolean b) {
    return a && b;
  }
  private boolean boolAndEquall(boolean a, boolean b) {
    return a &= b;
  }
  public boolean equally(int a, int b) {
    return a == b;
  }

//---------------------------------------------------
  
  public int plusAndMultiply(int a, int b, int c) {
    return plus(a, multiply(b, c));
  }
  public int plusAndMinus(int a, int b, int c) {
    return plus(a, minus(b, c));
  }
  public int minusAndMultiply(int a, int b, int c) {
    return minus(multiply(b, c), a);
  }
  public int plusAndPlus(int a, int b, int c) {
    return plus(plus(a, b), c);
  }
  public int minusAndMinus(int a, int b, int c) {
    return minus(minus(a, b), c);
  }
  public int multiplyAndMultiply(int a, int b, int c) {
    return multiply(multiply(a, b), c);
  }

//---------------------------------------------------

  public int leftShiftPLBinaryAndEquall(int a, int b, int c) {
    return binaryAndEquall(leftShift(a, b), c);
  }
  public int leftShiftPLleftShift(int a, int b, int c) {
    return leftShift(leftShift(a, b), c);
  }
  public int BinaryAndEquallPLBinaryAndEquall(int a, int b, int c) {
    return binaryAndEquall(binaryAndEquall(a, b), c);
  }
  public boolean boolOneAndPLboolOneAnd(boolean a, boolean b, boolean c) {
    return boolOneAnd(boolOneAnd(a, b), c);
  }
  public boolean boolTwoAndPLboolTwoAnd(boolean a, boolean b, boolean c) {
    return boolTwoAnd(boolTwoAnd(a, b), c);
  }
  public boolean boolAndEquallPLboolAndEquall(boolean a, boolean b, boolean c) {
    return boolAndEquall(boolAndEquall(a, b), c);
  }
  public boolean boolOneAndPLboolTwoAnd(boolean a, boolean b, boolean c) {
    return boolTwoAnd(boolOneAnd(a, b), c);
  }
  public boolean boolOneAndPLboolAndEquall(boolean a, boolean b, boolean c) {
    return boolAndEquall(boolOneAnd(a, b), c);
  }
  public boolean boolTwoAndPLboolAndEquall(boolean a, boolean b, boolean c) {
    return boolAndEquall(boolTwoAnd(a, b), c);
  }
}