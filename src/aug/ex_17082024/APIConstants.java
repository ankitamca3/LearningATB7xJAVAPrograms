package aug.ex_17082024;

//Constants should be available in enums.
//Enums are static.
//Enums mostly contains the key value pair of constants.

public enum APIConstants {

    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dashboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");

    private final String name;
    APIConstants(String name){
        this.name = name;
    }

    public String getValue(){
        return name;
    }
}
