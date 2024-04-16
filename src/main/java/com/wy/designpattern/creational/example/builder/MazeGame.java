package com.wy.designpattern.creational.example.builder;

import com.wy.designpattern.creational.example.Direction;
import com.wy.designpattern.creational.example.Door;
import com.wy.designpattern.creational.example.Maze;
import com.wy.designpattern.creational.example.Room;
import com.wy.designpattern.creational.example.abstractfactory.MazeFactory;

public class MazeGame {

    /**
     * 传入不同的factory子类，会生成不同系列产品
     * @param builder
     * @return
     */
    public Maze createMaze(MazeBuilder builder) {
        builder.builderMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);
        return builder.getMaze();
    }


}
