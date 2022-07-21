public class Qa extends Person {

    int grade ;
    String school ;

    public Qa(String name, int age, double salary, String car, int grade, String school) {
        super(name, age, salary, car);
        this.grade = grade;
        this.school = school;
    }



    void startTest (){
        System.out.println("starting a new Test");
    }

    void reportBug (){
        System.out.println("hhahahhahahaha i found a bug !!!!!");
    }

    @Override
    public String toString() {
        return "Qa{" +
                "grade=" + grade +
                ", school='" + school + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car='" + car + '\'' +
                '}';
    }
}
