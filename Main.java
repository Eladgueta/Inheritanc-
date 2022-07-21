public class Main {


    public static void main(String[] args) {

        Person p1 = new Person("haim",21,80000,"geely");
        Person p2 = new Person("daniel",26,10000,"ford mustang");

        System.out.println(p1);
        System.out.println(p2);


        double tax = p1.clacTax();
        System.out.println(tax);

        Qa q1 = new Qa("elad",26,18000,"GT",100,"bar ilan");
        q1.raiseSalary();
        System.out.println(q1);



    }
}
