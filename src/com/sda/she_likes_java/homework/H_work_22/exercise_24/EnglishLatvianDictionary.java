package com.sda.she_likes_java.homework.H_work_22.exercise_24;


import java.util.HashMap;
import java.util.Map;

public class EnglishLatvianDictionary {
    private Map<String, String> dictionary;

    public EnglishLatvianDictionary() {
        dictionary = new HashMap<>();
        // Add supported words to the dictionary
        dictionary.put("hello", "sveiki");
        dictionary.put("goodbye", "uz redzēšanos");
        dictionary.put("cat", "kaķis");
        dictionary.put("dog", "sunītis");
        dictionary.put("house", "māja");
        dictionary.put("car", "mašīna");
        dictionary.put("book", "grāmata");
        dictionary.put("computer", "dators");
        dictionary.put("sun", "saule");
        dictionary.put("moon", "mēness");
    }

    public String translate(String word) {
        String translation = dictionary.get(word);
        if (translation == null) {
            return "Sorry, we don't have a translation for that word.";
        }
        return translation;
    }

}
