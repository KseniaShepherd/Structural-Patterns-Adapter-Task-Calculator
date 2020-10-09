public class IntsCalculator implements Ints {
    @Override
    public int sum(int arg0, int arg1) {
        Calculator calculator = new Calculator();
        Calculator.Formula formula = calculator.newFormula();
        formula.addOperand((double) arg0);
        formula.addOperand((double) arg1);
        formula.calculate(Calculator.Operation.SUM);
        return (int) formula.result();

    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator calculator = new Calculator();
        Calculator.Formula formula = calculator.newFormula();
        formula.addOperand((double) arg0);
        formula.addOperand((double) arg1);
        formula.calculate(Calculator.Operation.MULT);
        return (int) formula.result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator calculator = new Calculator();
        Calculator.Formula formula = calculator.newFormula();
        formula.addOperand((double) a);
        formula.addOperand((double) b);
        formula.calculate(Calculator.Operation.POW);
        return (int) formula.result();
    }
}
