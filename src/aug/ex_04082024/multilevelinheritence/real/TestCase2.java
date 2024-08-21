package aug.ex_04082024.multilevelinheritence.real;

public class TestCase2 extends BaseTest{
    void testCase2(){
        startBrowser();
        getDataFromSQL();
        System.out.println(gold);
        closeBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testCase2();
    }
}
