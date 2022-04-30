package homework7;

import org.junit.Test;

public class ValidationSystemTest {

    private ValidationSystem vs = new ValidationSystem();

    @Test
    public void testValidateInt() throws ValidationFailedException {
        vs.getValidator(1).validate();
        vs.getValidator(5).validate();
        vs.getValidator(10).validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateIntFails_IfNumMoreThan10() throws ValidationFailedException {
        vs.getValidator(11).validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateIntFails_IfNumLessThan1() throws ValidationFailedException {
        vs.getValidator(0).validate();
    }

    @Test
    public void testValidateString() throws ValidationFailedException {
        vs.getValidator("Hello").validate();
        vs.getValidator("Hello world, abc").validate();
        vs.getValidator("Б5h%} trh").validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateStringFails_IfStrStartWithSmallLetter() throws ValidationFailedException {
        vs.getValidator("hello World!").validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateStringFails_IfStrStartWithOtherSymbols() throws ValidationFailedException {
        vs.getValidator("5 elements").validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateStringFails_IfStrIsEmpty() throws ValidationFailedException {
        vs.getValidator("").validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateStringFails_IfStrIsSpace() throws ValidationFailedException {
        vs.getValidator(" ").validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateFails_IfDoubleNumber() throws ValidationFailedException {
        vs.getValidator(5.7).validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateFails_IfLongNumber() throws ValidationFailedException {
        vs.getValidator(4L).validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateFails_IfFloatNumber() throws ValidationFailedException {
        vs.getValidator(4.2f).validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateFails_IfSymbol() throws ValidationFailedException {
        vs.getValidator('c').validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateFails_IfNull() throws ValidationFailedException {
        vs.getValidator(null).validate();
    }
}