package com.company;

public class TestPsi {
    private Integer min = 4;
    private Integer max = 12;
    private Roller roller = new Roller();
    private Integer roll = 0;
    private Integer incDec = 2;
    private Integer increaseCount = 0;
    private Integer decreaseCount = 0;
    private Integer startMax;
    private Integer runs;
    private Integer i = 0;
    private Integer runMax;
    private Integer[] results;
    private Integer refill;

    public TestPsi(){
        this.startMax = 6;
        this.runs = 100;
        this.refill = 0;
    }

    public TestPsi(Integer startDice, Integer runsPerTest, Integer refillDice){
        this.startMax = startDice;
        this.runs = runsPerTest;
        this.refill = refillDice;
    }

    public void compute(){
        runMax = startMax;
        for (i = 0; i < runs; i++){
            roll = roller.roller(runMax);
            if(roll == runMax && runMax == min && roll == min && refill == 1){
                decreaseCount++;
                refill--;
                runMax = startMax;
            } else if (roll == runMax && runMax == min && roll == min && refill == 0) {
                decreaseCount++;
                break;
            } else if (roll == runMax && roll != min){
                decreaseCount++;
                runMax = runMax - incDec;
            }
            if (roll == 1 && runMax < startMax){
                increaseCount++;
                runMax = runMax + incDec;
            }
        }
    }

    public Integer[] getResults(){
        results = new Integer[]{startMax, i, increaseCount, decreaseCount, refill};
        return results;
    }
}

