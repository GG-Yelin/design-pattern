package com.wy.designpattern.creational.example;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 迷宫中房间的集合
 */
@Data
public class Maze {

    private Map<Integer, Room> roomNo2room = new HashMap<>();

    public void addRoom(Room room) {
        if (room != null) {
            roomNo2room.put(room.getRoomNo(), room);
        }
    }

    public Room getRoom(int roomNo) {
        return roomNo2room.get(roomNo);
    }

}
