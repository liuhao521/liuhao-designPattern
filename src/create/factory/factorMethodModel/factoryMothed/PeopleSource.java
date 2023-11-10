package create.factory.factorMethodModel.factoryMothed;

import create.factory.People;

/**
 *
 */
public class PeopleSource {

    /**
     * 可以给 工厂 再创建个简单工厂
     * @param type
     * @return
     * @throws Exception
     */
    public static People createPeople(String type) throws Exception {
        PeopleFactory peopleFactory = null;
        if ("white".equals(type)){
            peopleFactory = new WhitePeopleFactory();
        }else if("yellow".equals(type)){
            peopleFactory = new YellowPeopleFactory();
        }else if ("black".equals(type)){
            peopleFactory = new BlackPeopleFactory();
        }else{
            throw new Exception("");
        }
        People people = peopleFactory.createPeople();
        return people;
    }
}
