package homework7;

public class ValidationSystem<T> {

    private Validator validator;

    public Validator getValidator(Object ob) throws ValidationFailedException {
        if (ob instanceof Integer) {
            return new IntegerValidator((Integer) ob);
        } else if (ob instanceof String) {
            return new StringValidator((String) ob);
        } else {
            throw new ValidationFailedException("It isn't a valid type");
        }
    }
}