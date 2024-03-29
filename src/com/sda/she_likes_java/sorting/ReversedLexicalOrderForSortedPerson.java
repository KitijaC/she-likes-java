package com.sda.she_likes_java.sorting;

import java.util.Comparator;

public class ReversedLexicalOrderForSortedPerson implements Comparator<SortedPerson> {
    @Override
    public int compare(SortedPerson o1, SortedPerson o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
//        return - name1.compareTo(name2); // instead of - u can use -1 *
        return name2.compareTo(name1); // the same as example above: return - name1.compareTo(name2);
    }
}
