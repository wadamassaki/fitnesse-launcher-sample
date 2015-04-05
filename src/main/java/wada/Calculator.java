package wada;

public class Calculator {

    private float operand1;
    private float operand2;

    public Calculator() {
    }

    public float getOperand1() {
        return operand1;
    }

    public void setOperand1(float operand1) {
        this.operand1 = operand1;
    }

    public float getOperand2() {
        return operand2;
    }

    public void setOperand2(float operand2) {
        this.operand2 = operand2;
    }

    public float getQuotient() {
        return operand1 / operand2;
    }

    public float getProduct() {
        return operand1 * operand2;
    }
}
