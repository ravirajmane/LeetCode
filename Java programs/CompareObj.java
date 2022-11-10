
public class CompareObj {

    static String JsonObject1;
    static String jsonObject2;

    public static void main(String[] args) {

        JsonObject1 = "{" +
                " \"employee\" : {" +
                " \"fullName\": \"John Miles\",\r\n" +
                " \"age\": \"34\",\r\n" +
                " \"contact\" : {" +
                " \"email\": \"john@xyz.com\",\r\n" +
                " \"phone\": \"9999999999\",\r\n" +
                "}" +
                "}" +
                "}";

        jsonObject2 = "{" +
                " \"employee\" : {" +
                " \"id\": \"1212\",\r\n" +
                " \"fullName\": \"John Miles\",\r\n" +
                " \"age\": \"35\",\r\n" +
                " \"contact\" : {" +
                " \"email\": \"john@xyz.com\",\r\n" +
                " \"phone\": \"9999999999\",\r\n" +
                "}" +
                "}" +
                "}";

        System.out.println(JsonObject1.equals(jsonObject2));
    }

}