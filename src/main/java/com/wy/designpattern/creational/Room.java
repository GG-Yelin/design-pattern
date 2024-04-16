package com.wy.designpattern.creational;

public class Room extends MapSite {

    private int roomNo;

    @Override
    protected void enter() {

    }

    public Room() {
    }

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }
}
