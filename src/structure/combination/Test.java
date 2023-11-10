package structure.combination;

import designPattern.structure.combination.condition.Condition;
import designPattern.structure.combination.condition.ConditionGroup;
import designPattern.structure.combination.condition.ConditionSingle;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Test {

    private static final String ORGANIZATION_ROOT_ID = "1001";

    public void buildOrganization() {
        Department rootDepartment = new Department(ORGANIZATION_ROOT_ID);
        buildOrganization(rootDepartment);
    }

    private void buildOrganization(Department department) {

        List<String> subDepartmentIds = new ArrayList<>();
        for (String subDepartmentId : subDepartmentIds) {
            Department subDepartment = new Department(subDepartmentId);
            department.addSub(subDepartment);
            buildOrganization(subDepartment);
        }
        List<String> employeeIds = new ArrayList<>();
        for (String ignored : employeeIds) {
            Employee employee = new Employee("1",2.0);
            department.addSub(employee);
        }
    }

//    public static void main(String[] args) {
//        ConditionGroup group = new ConditionGroup(true);
//        ConditionGroup group1 = new ConditionGroup(true);
//        ConditionGroup group2 = new ConditionGroup(false);
//        ConditionSingle condition1_1 = new ConditionSingle(true);
//        ConditionSingle condition1_2 = new ConditionSingle(true);
//        ConditionSingle condition2_1 = new ConditionSingle(true);
//        ConditionSingle condition2_2 = new ConditionSingle(true);
//
//        condition1_1.setLeftVarName("a");
//        condition1_1.setRightValue(Integer.valueOf(1));
//        condition1_1.setRightIsVar(false);
//        condition1_1.setCompareType("=");
//        condition1_1.setValueType("1");
//
//        condition1_2.setLeftVarName("b");
//        condition1_2.setRightValue(Integer.valueOf(1));
//        condition1_2.setRightIsVar(false);
//        condition1_2.setCompareType("=");
//        condition1_2.setValueType("1");
//
//        condition2_1.setLeftVarName("c");
//        condition2_1.setRightValue(Integer.valueOf(1));
//        condition2_1.setRightIsVar(false);
//        condition2_1.setCompareType("=");
//        condition2_1.setValueType("1");
//
//        condition2_2.setLeftVarName("d");
//        condition2_2.setRightValue(Integer.valueOf(1));
//        condition2_2.setRightIsVar(false);
//        condition2_2.setCompareType("=");
//        condition2_2.setValueType("1");
//
//
//        group1.addSub(condition1_1);
//        group1.addSub(condition1_2);
//        group2.addSub(condition2_1);
//        group2.addSub(condition2_2);
//        group.addSub(group1);
//        group.addSub(group2);
//
//        Map<String,Object> map = new HashMap<>();
//        map.put("a",2);
//        map.put("b",1);
//        map.put("c",1);
//        map.put("d",1);
//
//        boolean judge = group.judge(map);
//        System.out.println(judge);
//
//    }


    public static void main(String[] args) {
        System.out.println();
        try (FileInputStream inputStream = new FileInputStream("")) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


