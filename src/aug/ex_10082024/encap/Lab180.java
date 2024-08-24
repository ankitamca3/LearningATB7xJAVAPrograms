package aug.ex_10082024.encap;

public class Lab180 {
    public static void main(String[] args) {
        VWOLogin1 vwoLogin = new VWOLogin1("admin", "password123");
        System.out.println(vwoLogin.getUsername());
        vwoLogin.setUsername("Pramod");
        System.out.println(vwoLogin.getUsername());

        System.out.println(vwoLogin.getPassword());
        vwoLogin.setPassword("12345", false);
        System.out.println(vwoLogin.getPassword());
    }
}

class VWOLogin1 {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth){
        this.password = password;
        }
        else{
            System.out.println("Not Allowed!!");
        }
    }

    public VWOLogin1(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
