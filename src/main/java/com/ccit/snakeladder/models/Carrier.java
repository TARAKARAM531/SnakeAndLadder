package com.ccit.snakeladder.models;

import enums.CarrierType;

public abstract class Carrier {
     int start;
     int end;
     CarrierType carriertype;

    public Carrier(int start, int end, CarrierType carriertype) {
        this.start = start;
        this.end = end;
        this.carriertype = carriertype;
    }

    public abstract int getStart();
    public abstract int getEnd();

}
