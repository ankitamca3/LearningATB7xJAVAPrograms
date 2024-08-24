package aug.ex_10082024.encap;

public class ICICIBank {

    private String name;
    private long bal;

    public ICICIBank(String name, long bal){
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin) {
        if(isAdmin){
           this.name = name;
            System.out.println("Allowed!!");
        }else{
            System.out.println("Not Allowed!!");
        }
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isAdmin) {
         if(isAdmin){
             this.bal = bal;
             System.out.println("Allowed!!");
        }else{
            System.out.println("Not Allowed!!");
        }
    }
}
