package com.sda.she_likes_java.exceptions;

public class SecretExample {
    public static void main(String[] args) {

        SecretLocker secretStorage = new SecretLocker(
                null
        );

        System.out.println("I know your secret now!!!");
        Secret enemySecret = secretStorage.tellMeYourSecret();
        System.out.println("Enemy biggest secret was: " + enemySecret);

        try {
            System.out.println("Inside try block");
            Secret enemiesSecret = secretStorage.decryptMessageWithHSM();
            System.out.println("Enemies secret: " + enemiesSecret);
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("After problematic source code");

        System.out.println();
        System.out.println("Let's play again with our own exceptions");
        try {
            Secret stupidSecret = secretStorage.decrypt();
        } catch (HSMConnectionException e) {
            System.out.println("Connection issue: " + e.getMessage());
        } catch (DecryptionIssueException e) {
            System.out.println("Cannot decrypt enemies secret: " + e.getMessage());
        }
    }
}
