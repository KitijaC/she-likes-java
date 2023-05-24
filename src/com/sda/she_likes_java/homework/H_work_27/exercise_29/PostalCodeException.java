package com.sda.she_likes_java.homework.H_work_27.exercise_29;

public class PostalCodeException {
    private String message;

    public PostalCodeException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "PostalCodeException{" +
                "message='" + message + '\'' +
                '}';
    }
}
