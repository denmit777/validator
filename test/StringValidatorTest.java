package homework7;

import org.junit.Test;

public class StringValidatorTest {

    private String sentence;
    private StringValidator strVal = new StringValidator(sentence);

    @Test
    public void testValidateString() throws ValidationFailedException {
        strVal.setSentence("Hello");
        strVal.validate();

        strVal.setSentence("Hello world, Abc");
        strVal.validate();

        strVal.setSentence("Б5h%} trh");
        strVal.validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateStringFails_IfStrStartWithSmallLetter() throws ValidationFailedException {
        strVal.setSentence("hello World!");
        strVal.validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateStringFails_IfStrStartWithOtherSymbols() throws ValidationFailedException {
        strVal.setSentence("hello World!");
        strVal.validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateStringFails_IfStrIsEmpty() throws ValidationFailedException {
        strVal.setSentence("");
        strVal.validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateStringFails_IfStrIsSpace() throws ValidationFailedException {
        strVal.setSentence(" ");
        strVal.validate();
    }

    @Test(expected = NullPointerException.class)
    public void testValidateStringFails_IfStrIsNull() throws ValidationFailedException {
        strVal.setSentence(null);
        strVal.validate();
    }
}