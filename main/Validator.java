package homework7;

public interface Validator<T> {

    boolean validate() throws ValidationFailedException;
}
