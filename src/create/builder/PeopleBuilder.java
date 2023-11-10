package create.builder;

public class PeopleBuilder {

    public static Maker createMaker(){
        return new Maker();
    }

    public static final class Maker {
        protected String name;
        protected Integer age;
        protected boolean kid;
        protected Properties props = new Properties();

        public Maker() {
        }

        public Maker setName(String name){
            this.props.setProperty("name",name);
            return this;
        }

        public Maker setAge(Integer age){
            this.props.setProperty("age",String.valueOf(age));
            return this;
        }

        public Maker setKid(boolean kid){
            this.props.setProperty("kid",String.valueOf(kid));
            return this;
        }

        public People builder(){
            if (this.props.getProperty("name") != null){
                this.name = this.props.getProperty("name");
            }
            if (this.props.getProperty("age") != null){
                this.age = Integer.parseInt(this.props.getProperty("age"));
            }
            if (this.props.getProperty("name") != null){
                this.kid = Boolean.getBoolean(this.props.getProperty("kid"));
            }
            People people = new People(this.name,this.age,this.kid);
            return people;
        }
    }
}


