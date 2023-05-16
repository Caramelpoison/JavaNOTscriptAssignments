import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> abbreviationList;
    public String explanation;
    public String abbreviation;

    public Abbreviations() {
        abbreviationList = new HashMap<>();
    }


    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationList.put(abbreviation, explanation);
    }


    public boolean hasAbbreviation(String abbreviation) {
        return abbreviationList.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviationList.get(abbreviation);
    }
}



