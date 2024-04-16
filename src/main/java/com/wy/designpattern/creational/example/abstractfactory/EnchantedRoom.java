package com.wy.designpattern.creational.example.abstractfactory;

import com.wy.designpattern.creational.example.Room;
import lombok.Data;


public class EnchantedRoom extends Room {

    private Spell spell;

    public EnchantedRoom(int roomNo, Spell spell) {
        super(roomNo);
        this.spell = spell;
    }

}
