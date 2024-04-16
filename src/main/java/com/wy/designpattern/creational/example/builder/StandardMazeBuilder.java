package com.wy.designpattern.creational.example.builder;

import com.wy.designpattern.creational.example.*;

public class StandardMazeBuilder implements MazeBuilder {

    private Maze currentMaze;

    @Override
    public void builderMaze() {
        currentMaze = new Maze();
    }

    @Override
    public void buildRoom(int roomNo) {
        if (currentMaze.getRoom(roomNo) != null) {
            Room room = new Room(roomNo);
            currentMaze.addRoom(room);

            room.setSide(Direction.NORTH, new Wall());
            room.setSide(Direction.SOUTH, new Wall());
            room.setSide(Direction.EAST, new Wall());
            room.setSide(Direction.WEST, new Wall());
        }
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        Room room1 = currentMaze.getRoom(roomFrom);
        Room room2 = currentMaze.getRoom(roomTo);
        Door door = new Door(room1, room2);
        room1.setSide(commonWall(room1, room2), door);
        room2.setSide(commonWall(room2, room1), door);

    }

    @Override
    public Maze getMaze() {
        return this.currentMaze;
    }

    /**
     * room1 和 room2 之间的墙相对于 room1 的方向
     * @param room1
     * @param room2
     * @return
     */
    private Direction commonWall(Room room1, Room room2) {
        return null;
    }

}
