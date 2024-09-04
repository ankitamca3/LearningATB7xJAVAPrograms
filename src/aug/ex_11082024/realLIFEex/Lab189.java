package aug.ex_11082024.realLIFEex;

public class Lab189 {
    public static void main(String[] args) {
        CHROME c = new CHROME();
        //c.openBrowser("Chrome");
        String s = c.openBrowser("Chrome");
        System.out.println(s);
        String s1 = c.closeBrowser("Chroddme");
        System.out.println(s1);



        FIREFOX f = new FIREFOX();
        f.openBrowser("ff");
        f.closeBrowser("ff");
        f.takeScreenShot();
    }
}
