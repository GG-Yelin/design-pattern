package com.wy.designpattern.creational.example.builder;

import com.wy.designpattern.creational.example.Maze;

public interface MazeBuilder {

    void builderMaze();

    void buildRoom(int roomNo);

    void buildDoor(int roomFrom, int roomTo);

    Maze getMaze();

}
