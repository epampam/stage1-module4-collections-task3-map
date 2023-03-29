package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        sentence = sentence.toLowerCase();
        String[] sentenceWithoutCommasAndDots = sentence.replaceAll("[,.]", "").split(" ");
        for (String element : sentenceWithoutCommasAndDots
        ) {
            if (!element.isEmpty()) {
                int count = 1;
                if (map.get(element) != null) {
                    count = map.get(element) + 1;
                    map.put(element, count);
                } else {
                    map.put(element, count);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        WordRepetitionMapCreator wordRepetitionMapCreator = new WordRepetitionMapCreator();
        System.out.println(wordRepetitionMapCreator.createWordRepetitionMap("hello word in lOwEr cAsE, HELLO WORD in UpPeR CaSe."));

    }
}
