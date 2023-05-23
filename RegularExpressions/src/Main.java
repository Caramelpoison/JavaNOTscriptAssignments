import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {
    public static void main(String[] args) {

        // Create a Pattern object
        Pattern email = Pattern.compile("\\w{2,}\\@\\w{2,}\\.\\b(com)");
        // Now create a Matcher object
        Matcher matcher = email.matcher("Coco@melon.com");
        boolean matches = matcher.matches();
        System.out.println("Match for email is: " + matches);

        System.out.println("");
        Pattern number = Pattern.compile("\\(\\d{1,3}\\)\\s\\d{1,3}\\-\\d{1,4}");
        matcher = number.matcher("(123) 456-7890");
        // matcher = number.matcher("1234567890"); //works as well
        // matcher = number.matcher("123-456-7890"); //works as well
        matches = matcher.matches();
        System.out.println("Match for number is: " + matches);

        System.out.println("");
        Pattern bday = Pattern.compile("\\d{2}\\-\\d{2}\\-\\d{4}");
        matcher = bday.matcher("05-09-1994");
        matches = matcher.matches();
        System.out.println("Match for birthday is: " + matches);

        System.out.println("");
        Pattern url = Pattern.compile("(\\b(https?)\\:\\/{2})?([w]{3}\\.)?\\w{1,}\\.\\b(com)?\\b(org?)?(\\/.{1,})?");
        matcher = url.matcher("https://www.youtube.com/watch?v=M3Keg5XKJO8");
        matches = matcher.matches();
        System.out.println("Match for URL is: " + matches);

        System.out.println("");
        Pattern credit = Pattern.compile("(\\d{4})[ -]?(\\d{4})[ -]?(\\d{4})[ -]?(\\d{4})");
        matcher = credit.matcher("1234 1234 1234 1234");
        matches = matcher.matches();
        System.out.println("Match for Credit Card Number is: " + matches);

        System.out.println("");
        Pattern zip = Pattern.compile("\\d{5}(\\-\\d{4})?");
        matcher = zip.matcher("12345-1234");
        //matcher = credit.matcher("12345");
        matches = matcher.matches();
        System.out.println("Match for Zip-Code is: " + matches);

        System.out.println("");
        Pattern javaIdentifier = Pattern.compile("[a-zA-Z_$][a-zA-Z0-9_$]*");
        matcher = javaIdentifier.matcher("validIdentifier123_$");
        matches = matcher.matches();
        System.out.println("Match for Identifier is: " + matches);

        System.out.println("");
        Pattern hexCode = Pattern.compile("#[0-9a-fA-F]{6}");
        matcher = hexCode.matcher("#aabbcc");
        //matcher = hexCode.matcher("#a#aabbcc"); //false
        matches = matcher.matches();
        System.out.println("Match for hex-code is: " + matches);

        System.out.println("");
        Pattern time = Pattern.compile("([01]\\d|2[0-3]):[0-5]\\d");
        //matcher = time.matcher("17:45");
        matcher = time.matcher("27:45"); //false
        matches = matcher.matches();
        System.out.println("Match for time format is: " + matches);
    }








}
