package aug.ex_11082024.realLIFEex;

public class CHROME extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Opening Chrome browser .....,         // This is code releted to chrome only\n");
        return browser;
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing Chrome browser.....,         // This is code releted to chrome only\n");
        return "";
    }
}
