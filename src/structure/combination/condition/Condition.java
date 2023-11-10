package structure.combination.condition;

public abstract class Condition {

    /**
     * 逻辑运算符 true=and,false=or
     */
    protected Boolean logicalOperator;

    public Condition(boolean logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    /**
     * 判断
     * @param middleData
     * @return
     */
    public abstract boolean judge(Map<String,Object> middleData);


    public Boolean getLogicalOperator() {
        return logicalOperator;
    }
}
