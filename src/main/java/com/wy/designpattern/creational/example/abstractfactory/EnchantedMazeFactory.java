package com.wy.designpattern.creational.example.abstractfactory;

import com.wy.designpattern.creational.example.Room;

public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom(int roomNo) {
        return new EnchantedRoom(roomNo, castSpell());
    }

    protected Spell castSpell() {
        return new Spell();
    }
}
