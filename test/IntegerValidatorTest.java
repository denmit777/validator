package homework7;

import org.junit.Test;

public class IntegerValidatorTest {

    private Integer num;

    private IntegerValidator intVal = new IntegerValidator(num);

    @Test
    public void testValidateInt() throws ValidationFailedException {
        intVal.setNum(1);
        intVal.validate();

        intVal.setNum(5);
        intVal.validate();

        intVal.setNum(10);
        intVal.validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateIntFails_IfNumMoreThan10() throws ValidationFailedException {
        intVal.setNum(11);
        intVal.validate();
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateIntFails_IfNumLessThan1() throws ValidationFailedException {
        intVal.setNum(0);
        intVal.validate();
    }

    @Test(expected = NullPointerException.class)
    public void testValidateIntFails_IfNumIsNull() throws ValidationFailedException {
        intVal.setNum(null);
        intVal.validate();
    }
}