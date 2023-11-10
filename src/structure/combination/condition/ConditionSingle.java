package structure.combination.condition;

public class ConditionSingle extends Condition{

    public static final String VALUE_TYPE_STRING = "1";
    public static final String VALUE_TYPE_DATE = "2";
    public static final String VALUE_TYPE_NUMBER = "3";

    public static final String DATE_ACCURACY_YEAR = "year";
    public static final String DATE_ACCURACY_MONTH = "month";
    public static final String DATE_ACCURACY_DAY = "day";
    public static final String DATE_ACCURACY_HOUR = "hour";
    public static final String DATE_ACCURACY_SEC = "sec";
    public static final String DATE_ACCURACY_MIN = "min";

    public static final String COMPARE_TYPE_EQUAL = "=";
    public static final String COMPARE_TYPE_NOT_EQUAL = "!=";
    public static final String COMPARE_TYPE_LESS_THAN = "<";
    public static final String COMPARE_TYPE_GREATER_THAN = ">";
    public static final String COMPARE_TYPE_LESS_THAN_EQUAL = "<=";
    public static final String COMPARE_TYPE_GREATER_THAN_EQUAL = ">=";

    /**
     * 左值变量名
     */
    private String leftVarName;
    /**
     * 左值
     */
    private Object leftValue;
    /**
     * 右值
     */
    private Object rightValue;
    /**
     * 操作数据类型 1 数值 2 时间 3 集合 4 字符串
     */
    private String valueType;
    /**
     * 筛选字段值是否取变量
     */
    private Boolean rightIsVar;
    /**
     * 时间精度
     */
    private String dateAccuracy;
    /**
     * 比较符号
     */
    private String compareType;


    public ConditionSingle(boolean logicalOperator) {
        super(logicalOperator);
    }

    @Override
    public boolean judge(Map<String, Object> middleData) {
        boolean result = false;
        if (leftVarName == null){
            return false;
        }
        this.leftValue = middleData.get(this.leftVarName);
        if (this.leftValue == null){
            return false;
        }
        if (rightIsVar){
            this.rightValue = middleData.get(this.rightValue);
        }
        if (this.rightValue == null){
            return false;
        }
        if ("1".equals(valueType)){
            Double a = Double.parseDouble(leftValue.toString());
            Double b = Double.parseDouble(rightValue.toString());
            if (COMPARE_TYPE_EQUAL.equals(compareType)){
                result = a.compareTo(b) == 0 ;
            }else if(COMPARE_TYPE_NOT_EQUAL.equals(compareType)){
                result = a.compareTo(b) != 0 ;
            }else if(COMPARE_TYPE_LESS_THAN.equals(compareType)){
                result = a.compareTo(b) < 0 ;
            }else if(COMPARE_TYPE_GREATER_THAN.equals(compareType)){
                result = a.compareTo(b) > 0 ;
            }else if(COMPARE_TYPE_LESS_THAN_EQUAL.equals(compareType)){
                result = a.compareTo(b) <= 0 ;
            }else if(COMPARE_TYPE_GREATER_THAN_EQUAL.equals(compareType)){
                result = a.compareTo(b) >= 0 ;
            }
        }
        return result;
    }

    public String getLeftVarName() {
        return leftVarName;
    }

    public void setLeftVarName(String leftVarName) {
        this.leftVarName = leftVarName;
    }

    public Object getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(Object leftValue) {
        this.leftValue = leftValue;
    }

    public Object getRightValue() {
        return rightValue;
    }

    public void setRightValue(Object rightValue) {
        this.rightValue = rightValue;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public Boolean getRightIsVar() {
        return rightIsVar;
    }

    public void setRightIsVar(Boolean rightIsVar) {
        this.rightIsVar = rightIsVar;
    }

    public String getDateAccuracy() {
        return dateAccuracy;
    }

    public void setDateAccuracy(String dateAccuracy) {
        this.dateAccuracy = dateAccuracy;
    }

    public String getCompareType() {
        return compareType;
    }

    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }
}
