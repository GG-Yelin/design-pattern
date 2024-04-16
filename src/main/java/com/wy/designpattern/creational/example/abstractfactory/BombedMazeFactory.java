package com.wy.designpattern.creational.example.abstractfactory;

import com.wy.designpattern.creational.example.Room;
import com.wy.designpattern.creational.example.Wall;

public class BombedMazeFactory extends MazeFactory {

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int roomNo) {
        return new RoomWithABomb(roomNo);
    }
}
