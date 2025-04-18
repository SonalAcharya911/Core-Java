package com.xworkz.parents.runner;

import com.xworkz.parents.internal.ToothPaste;

public class ToothPasteRunner {

    public static void main(String[] args) {
        ToothPaste toothPaste1 = new ToothPaste("Colgate", "blue", 200, true);
        ToothPaste toothPaste2 = new ToothPaste("Dabur", "red", 120, false);
        ToothPaste toothPaste3 = new ToothPaste("Colgate", "blue", 200, true);

        boolean match = toothPaste1.equals(toothPaste2);
        boolean notMatch = toothPaste1.equals(toothPaste3);

        System.out.println("match: " + match);
        System.out.println("notMatch: " + notMatch);
    }
}
