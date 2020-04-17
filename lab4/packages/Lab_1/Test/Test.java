package packages.Lab_1.Test;
import packages.Lab_1.Calculator.*;

public class Test {
  public void doAllTests() {
    Calculator calc = new Calculator();

    System.out.println("10 - 3 - 2 = " + calc.minusAndMinus(10, 3, 2));
    System.out.println("10 + 3 + 2 = " + calc.plusAndPlus(10, 3, 2));
    System.out.println("10 + 3 * 2 = " + calc.plusAndMultiply(10, 3, 2));
    System.out.println("10 + 3 - 2 = " + calc.plusAndMinus(10, 3, 2));
    System.out.println("10 - 3 * 2 = " + calc.minusAndMultiply(10, 3, 2));
    System.out.println("10 * 3 * 2 = " + calc.multiplyAndMultiply(10, 3, 2));

    System.out.println("14 - 32 - 21 = " + calc.minusAndMinus(14, 32, 21));
    System.out.println("14 + 32 + 21 = " + calc.plusAndPlus(14, 32, 21));
    System.out.println("14 + 32 * 21 = " + calc.plusAndMultiply(14, 32, 21));
    System.out.println("14 + 32 - 21 = " + calc.plusAndMinus(14, 32, 21));
    System.out.println("14 - 32 * 21 = " + calc.minusAndMultiply(14, 32, 21));
    System.out.println("14 * 32 * 21 = " + calc.multiplyAndMultiply(14, 32, 21));

    System.out.println("1 - 4 - 23 = " + calc.minusAndMinus(1, 4, 23));
    System.out.println("1 + 4 + 23 = " + calc.plusAndPlus(1, 4, 23));
    System.out.println("1 + 4 * 23 = " + calc.plusAndMultiply(1, 4, 23));
    System.out.println("1 + 4 - 23 = " + calc.plusAndMinus(1, 4, 23));
    System.out.println("1 - 4 * 23 = " + calc.minusAndMultiply(1, 4, 23));
    System.out.println("1 * 4 * 23 = " + calc.multiplyAndMultiply(1, 4, 23));

    System.out.println("---------------------------------");

    System.out.println("4 << 3 &= 3 = " + calc.leftShiftPLBinaryAndEquall(4, 3, 3));
    System.out.println("1 << 1 &= 2 = " + calc.leftShiftPLBinaryAndEquall(1, 1, 2));
    System.out.println("5 << 2 &= 3 = " + calc.leftShiftPLBinaryAndEquall(5, 2, 3));

    System.out.println("4 << 3 << 3 = " + calc.leftShiftPLleftShift(4, 3, 3));
    System.out.println("1 << 1 << 2 = " + calc.leftShiftPLleftShift(1, 1, 2));
    System.out.println("5 << 2 << 3 = " + calc.leftShiftPLleftShift(5, 2, 3));

    System.out.println("4 &= 3 &= 3 = " + calc.BinaryAndEquallPLBinaryAndEquall(4, 3, 3));
    System.out.println("1 &= 1 &= 2 = " + calc.BinaryAndEquallPLBinaryAndEquall(1, 1, 2));
    System.out.println("5 &= 2 &= 3 = " + calc.BinaryAndEquallPLBinaryAndEquall(5, 2, 3));

    System.out.println("---------------------------------");

    System.out.println("3 == 4 => " + calc.equally(3, 4));
    System.out.println("22 == 22 => " + calc.equally(22, 22));
    System.out.println("100 == 9 => " + calc.equally(100, 9));

    System.out.println("---------------------------------");
    
    System.out.println("true  & true  & true  => " + calc.boolOneAndPLboolOneAnd(true, true, true));
    System.out.println("false & true  & true  => " + calc.boolOneAndPLboolOneAnd(false, true, true));
    System.out.println("true  & false & false => " + calc.boolOneAndPLboolOneAnd(true, false, false));

    System.out.println("\ntrue  && true  && true  => " + calc.boolTwoAndPLboolTwoAnd(true, true, true));
    System.out.println("false && true  && true  => " + calc.boolTwoAndPLboolTwoAnd(false, true, true));
    System.out.println("true  && false && false => " + calc.boolTwoAndPLboolTwoAnd(true, false, false));

    System.out.println("\ntrue  &= true  &= true  => " + calc.boolAndEquallPLboolAndEquall(true, true, true));
    System.out.println("false &= true  &= true  => " + calc.boolAndEquallPLboolAndEquall(false, true, true));
    System.out.println("true  &= false &= false => " + calc.boolAndEquallPLboolAndEquall(true, false, false));

    System.out.println("\ntrue  & true  && true  => " + calc.boolOneAndPLboolTwoAnd(true, true, true));
    System.out.println("false & true  && true  => " + calc.boolOneAndPLboolTwoAnd(false, true, true));
    System.out.println("true  & false && false => " + calc.boolOneAndPLboolTwoAnd(true, false, false));

    System.out.println("\ntrue  & true  &= true  => " + calc.boolOneAndPLboolAndEquall(true, true, true));
    System.out.println("false & true  &= true  => " + calc.boolOneAndPLboolAndEquall(false, true, true));
    System.out.println("true  & false &= false => " + calc.boolOneAndPLboolAndEquall(true, false, false));

    System.out.println("\ntrue  && true  &= true  => " + calc.boolTwoAndPLboolAndEquall(true, true, true));
    System.out.println("false && true  &= true  => " + calc.boolTwoAndPLboolAndEquall(false, true, true));
    System.out.println("true  && false &= false => " + calc.boolTwoAndPLboolAndEquall(true, false, false));
  }
}