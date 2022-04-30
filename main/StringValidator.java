package homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator implements Validator<String> {

    private String sentence;
    private static final String STRING_STARTING_WITH_CAPITAL_LETTER = "^[A-ZА-Я].";

    StringValidator(String sentence) {
        this.sentence = sentence;
    }

    StringValidator() {
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public boolean validate() throws ValidationFailedException {
        Pattern pattern = Pattern.compile(STRING_STARTING_WITH_CAPITAL_LETTER);
        Matcher matcher = pattern.matcher(sentence);
        if (matcher.find()) {
            return true;
        } else {
            throw new ValidationFailedException("It isn't a valid string");
        }
    }
}
