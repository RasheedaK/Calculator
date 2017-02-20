public class Division implements ArithmeticCalculatorOperation {
    public float executeOperation(float operand1, float operand2) throws NumberFormatException {
        if (operand1 != 0.0f && operand2 != 0.0f)
            return operand1 / operand2;
        throw new NumberFormatException();
    }

}
