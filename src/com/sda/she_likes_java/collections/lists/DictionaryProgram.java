package com.sda.she_likes_java.collections.lists;

public class DictionaryProgram {
    public static void main(String[] args) {
        MyGreatDictionary englishCzechDictionary = MyDictionaries.createEnglishCzechDictionary();
        englishCzechDictionary.translateFromSourceLanguageToDestiny("dog");
        englishCzechDictionary.translateFromSourceLanguageToDestiny("house");
    }
}
