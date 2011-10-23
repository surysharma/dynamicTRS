package Utils;


public class ExpressionEvaluator<T> implements Evaluator {

    private T formula;
    private int i;

    private static ExpressionEvaluator expressionEvaluator;

    private ExpressionEvaluator(T formula, int i) {
        this.formula = formula;
        this.i = i;

    }

    public static Evaluator rewardStatementEvaluator(String formula, int i) {
        if (expressionEvaluator != null && formula == expressionEvaluator.formula && i == expressionEvaluator.i) {
            return expressionEvaluator;
        }
        expressionEvaluator = new ExpressionEvaluator(formula, i);
        return expressionEvaluator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExpressionEvaluator that = (ExpressionEvaluator) o;

        if (expressionEvaluator != null ? !expressionEvaluator.equals(that.expressionEvaluator) : that.expressionEvaluator != null)
            return false;
        if (formula != null ? !formula.equals(that.formula) : that.formula != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = formula != null ? formula.hashCode() : 0;
        result = 31 * result + (expressionEvaluator != null ? expressionEvaluator.hashCode() : 0);
        return result;
    }
}
