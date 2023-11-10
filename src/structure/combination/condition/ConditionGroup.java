package structure.combination.condition;

import java.util.ArrayList;

public class ConditionGroup extends Condition{

    private List<Condition> sub = new ArrayList<>();

    public ConditionGroup(boolean logicalOperator) {
        super(logicalOperator);
    }

    public void addSub(Condition sub){
        this.sub.add(sub);
    }

    @Override
    public boolean judge(Map<String, Object> middleData) {
        boolean result = true;
        boolean oneResult;
        for (Condition condition: this.sub){
            oneResult = condition.judge(middleData);
            if (!condition.getLogicalOperator() && (result | oneResult)) {
                result = true;
            } else {
                result = result && oneResult;
            }
        }
        return result;
    }
}
