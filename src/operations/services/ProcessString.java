package operations.services;

public class ProcessString {
    public static String processString(String string){
        int positionStart = string.indexOf("[");
        int positionEnd = string.lastIndexOf("]");
        return  string.substring(positionStart+1,positionEnd);
    }

}



