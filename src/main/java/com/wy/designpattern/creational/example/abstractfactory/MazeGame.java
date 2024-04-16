package com.wy.designpattern.creational.example.abstractfactory;

import com.wy.designpattern.creational.example.*;

public class MazeGame {

    /**
     * 传入不同的factory子类，会生成不同系列产品
     * @param factory
     * @return
     */
    public Maze createMaze(MazeFactory factory) {

        Maze maze = factory.makeMace();
        Room room1 = factory.makeRoom(1);
        Room room2 = factory.makeRoom(2);
        Door door = factory.makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.NORTH, factory.makeWall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, factory.makeWall());
        room1.setSide(Direction.WEST, factory.makeWall());

        room1.setSide(Direction.NORTH, factory.makeWall());
        room1.setSide(Direction.EAST, factory.makeWall());
        room1.setSide(Direction.SOUTH, factory.makeWall());
        room1.setSide(Direction.WEST, door);

        return maze;
    }


}
