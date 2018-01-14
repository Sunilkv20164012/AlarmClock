package com.example.sunil.alarmclock;

import java.util.Random;

/**
 * Created by kapoo on 14-01-2018.
 */

public class FactBook {
    // Fields (Member Variables) - Properties about the object
    String[] mFacts = {
//
            "The human brain takes in 11 million bits of information every second but is aware of only 40.",
            "If you drilled a tunnel straight through the Earth and jumped in, it would take you exactly 42 " +
                    "minutes and 12 seconds to get to the other side.",
            "A medium-sized cumulus cloud weighs about the same as 80 elephants.",
            "A single bolt of lightning contains enough energy to cook 100,000 pieces of toast.",
            "Gorillas and potatoes have two more chromosomes than humans do.",
            "Human saliva contains a painkiller called opiorphin that is six times more powerful than morphine.",
            "In an average lifetime, human skin completely replaces itself 900 times.",
            "The air in an average-sized room weighs about 100 pounds.",
            "Lava can flow as fast as a sprinting greyhound.",
            "A red blood cell can make a complete circuit of your body in 20 seconds.",
            "The strongest creatures on Earth are gonorrhea bacteria. They can pull 100,000 times " +
                    "their own body weight."};


    public String getFact() {
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}