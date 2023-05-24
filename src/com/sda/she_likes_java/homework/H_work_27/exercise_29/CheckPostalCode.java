package com.sda.she_likes_java.homework.H_work_27.exercise_29;

import java.util.Objects;

public class CheckPostalCode {
    private final String postalCode;

    public CheckPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckPostalCode that = (CheckPostalCode) o;
        return Objects.equals(postalCode, that.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postalCode);
    }

    @Override
    public String toString() {
        return "CheckPostalCode{" +
                "postalCode='" + postalCode + '\'' +
                '}';
    }

    void checkPostalCode() {
        PostalCodeException exception = new PostalCodeException("Error message");
        if (postalCode instanceof String) {
            System.out.println();
        } else {
            System.out.println(exception);
        }
    }

}
