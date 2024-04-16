package com.wy.designpattern.creational.example;

public class MazeGame {


    public Maze createMaze() {

        Maze maze = new Maze();
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Door door = new Door(room1, room2, true);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.NORTH, new Wall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, new Wall());
        room1.setSide(Direction.WEST, new Wall());

        room1.setSide(Direction.NORTH, new Wall());
        room1.setSide(Direction.EAST, new Wall());
        room1.setSide(Direction.SOUTH, new Wall());
        room1.setSide(Direction.WEST, door);

        return maze;
    }


}
