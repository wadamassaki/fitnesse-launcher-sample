package fitnesse.wada;

import fit.ColumnFixture;
import wada.Calculator;

public class CalculatorFixture extends ColumnFixture {

    private Calculator target;
    public float operand1;
    public float operand2;

    public void setOperand2(float operand2) {
        this.operand2 = operand2;
    }

    public void setOperand1(float operand1) {
        this.operand1 = operand1;
    }

    public float calcQuotient() {
        setOperands();
        return this.target.getQuotient();
    }

    public float calcProduct() {
        setOperands();
        return this.target.getProduct();
    }

    public String test() {
        setOperands();
        //return "test " + this.operand1 + " " + this.operand2;
        return "test " + target.getOperand1() + " " + target.getOperand2();
    }

    private void setOperands() {
        this.target = new Calculator();
        target.setOperand1(this.operand1);
        target.setOperand2(this.operand2);
    }

}
