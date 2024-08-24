package aug.ex_10082024.encap;

public class Lab181 {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100);
        amit.setBal(100000l,false);
        System.out.println(amit.getBal());
        System.out.println(amit.getName());
        //set te balance
        //admin



        ICICIBank admin = new ICICIBank("Admin", 1000);
        admin.setBal(500000, true);
        System.out.println(admin.getBal());
        System.out.println(admin.getName());
    }
}
