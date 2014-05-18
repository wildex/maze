package com.maze;
import java.util.Map;
import java.util.HashMap;

/**
 * Лабиринт
 */
public class Maze {

    private RoomBuilder _roomBuilder;
    private Map<Integer, Room> _rooms = new HashMap<Integer, Room>();

    public void setRoomBuilder(RoomBuilder rb) {
        this._roomBuilder = rb;
    }

    public void addRoom() {
        this._roomBuilder.createRoom();
        this._roomBuilder.generateRoomId(this.getRoomsCount());
        this._roomBuilder.generateRoomExits();
        this._rooms.put(this._roomBuilder.getRoom().getId(), this._roomBuilder.getRoom());
    }

    public int getRoomsCount() {
        return _rooms.size();
    }
}
