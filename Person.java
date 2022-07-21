public class Person {

    String name ;
    int age ;
    double salary ;
    String car ;


    public Person(String name, int age, double salary, String car) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

   void changeCar (String newcar ){
        this.car = newcar ;
   }

   void raiseSalary (){
        this.salary = this.salary +(3000*3.15);


   }

   double clacTax (){
      return this.salary *0.22;
   }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car='" + car + '\'' +
                '}';
    }
}
