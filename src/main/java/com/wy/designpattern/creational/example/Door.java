package com.wy.designpattern.creational.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Door extends MapSite {

    private Room room1;

    private Room room2;

    private boolean isOpen = true;

    @Override
    public void enter() {

    }

    public Room otherSideFrom(Room room) {
        if (room == room1) {
            return room2;
        }
        if (room == room2) {
            return room1;
        }
        return null;
    }

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }
}
