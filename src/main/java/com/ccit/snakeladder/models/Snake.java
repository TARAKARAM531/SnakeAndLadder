package com.ccit.snakeladder.models;

import enums.CarrierType;

public class Snake extends Carrier{
    public Snake(int start, int end) {
        super(start, end, CarrierType.SNAKE);
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
