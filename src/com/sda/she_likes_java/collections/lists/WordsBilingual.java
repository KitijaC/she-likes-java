package com.sda.she_likes_java.collections.lists;

public class WordsBilingual {
    private final String sourceLanguage; // final - not modifying that variable, there won't be setters. Only getters
    private final String destinyLanguage;

    public WordsBilingual(String sourceLanguage, String destinyLanguage) {
        this.sourceLanguage = sourceLanguage;
        this.destinyLanguage = destinyLanguage;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public String getDestinyLanguage() {
        return destinyLanguage;
    }

    @Override
    public String toString() {
        return "WordsBilingual{" +
                "sourceLanguage='" + sourceLanguage + '\'' +
                ", destinyLanguage='" + destinyLanguage + '\'' +
                '}';
    }
}
