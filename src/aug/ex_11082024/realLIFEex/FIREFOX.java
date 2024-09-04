package aug.ex_11082024.realLIFEex;

public class FIREFOX extends BaseClass {
    @Override
    String openBrowser(String browser) {
        System.out.println("Opening FIREFOX .....,         // This is code releted to FIREFOX only\n");
        return browser;
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the FIREFOX .....,         // This is code releted to FIREFOX only\n");
        return "";
    }
}
