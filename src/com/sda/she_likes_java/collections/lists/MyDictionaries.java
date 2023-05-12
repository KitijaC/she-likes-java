package com.sda.she_likes_java.collections.lists;

import java.util.List;

public class MyDictionaries {
    // create english-polish dictionary
    public static MyGreatDictionary createEnglishPolishDictionary() {
        List<WordsBilingual> list = List.of(
                new WordsBilingual("house", "dom")
        );
        MyGreatDictionary englishPolishDictionary = new MyGreatDictionary();
        englishPolishDictionary.fillWithWordsBilingual(list);
        return englishPolishDictionary;
    }

    // create english-czech dictionary
    public static MyGreatDictionary createEnglishCzechDictionary() {
        List<WordsBilingual> list = List.of(
                new WordsBilingual("house", "dum") // really house in czech is "dům", but never use that characters ů and etc.
        );
        MyGreatDictionary englishCzechDictionary = new MyGreatDictionary();
        englishCzechDictionary.fillWithWordsBilingual(list);
        return englishCzechDictionary;
    }
}
