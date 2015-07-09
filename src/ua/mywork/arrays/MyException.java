package ua.mywork.arrays;


public class MyException extends Throwable {

    private final String errorMessage;

    public MyException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}