package com.company;

import java.util.Random;

public class Roller {
    public Integer roller(Integer max) {
        Integer result;
        Random random = new Random();
        result = random.nextInt(max) + 1;
        return result;
    }
}
