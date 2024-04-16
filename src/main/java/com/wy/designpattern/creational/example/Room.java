package com.wy.designpattern.creational.example;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class Room extends MapSite {

    private int roomNo;

    private Map<Direction, MapSite> sides = new HashMap<>();

    @Override
    public void enter() {

    }

    public void setSide(Direction direction, MapSite mapSite) {
        sides.put(direction, mapSite);
    }

    public MapSite getSide(Direction direction) {
        return sides.get(direction);
    }

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }
}
