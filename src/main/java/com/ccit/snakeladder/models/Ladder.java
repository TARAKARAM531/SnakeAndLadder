package com.ccit.snakeladder.models;

import enums.CarrierType;

public class Ladder extends Carrier{

    public Ladder(int start, int end) {
        super(start, end, CarrierType.LADDER);
    }

    @Override
    public int getStart() {
        return this.start;
    }

    @Override
    public int getEnd() {
        return this.end;
    }
}
