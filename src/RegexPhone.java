import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhone {

    private static final String NUMBER_PHONE = "^[0-9]{2}[-][0-9]{10}";

    public RegexPhone(){}

    public boolean valid(String regex){
        Pattern pattern = Pattern.compile(NUMBER_PHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
