package homework7;

public class IntegerValidator implements Validator<Integer> {

    private Integer num;

    public IntegerValidator(Integer num) {
        this.num = num;
    }

    public IntegerValidator() {
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean validate() throws ValidationFailedException {

        if (num < 1 || num > 10) {
            throw new ValidationFailedException("It isn't a valid number");
        }
        return true;
    }
}

