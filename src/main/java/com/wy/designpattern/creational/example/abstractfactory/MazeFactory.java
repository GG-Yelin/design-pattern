package com.wy.designpattern.creational.example.abstractfactory;

import com.wy.designpattern.creational.example.Door;
import com.wy.designpattern.creational.example.Maze;
import com.wy.designpattern.creational.example.Room;
import com.wy.designpattern.creational.example.Wall;

public class MazeFactory {

    public Maze makeMace() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom(int roomNo) {
        return new Room(roomNo);
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2, true);
    }


}
