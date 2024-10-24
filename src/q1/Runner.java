package q1;

public class Runner {
    public static void main(String[] args) {
       Worker w = new Worker("Tiasha",25000);
        System.out.println(w);

       Supervisor s = new Supervisor("Luba",50000,"Chairman");
        System.out.println(s);

       Director d = new Director("Maisha",75000,"CEO");
        System.out.println(d);




    }
}
