package com.maze;
import java.util.Map;
import java.util.HashMap;

/**
 * Лабиринт
 * Observer pattern: Observer
 */
public class Maze {

    private RoomBuilder _roomBuilder;
    private Map<Integer, Room> _rooms = new HashMap<Integer, Room>();
    private int _playerRoomId;
    private Player _player;

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

    public void addPlayer(Player player) {
        this._player = player;
        this._playerRoomId = this._rooms.get(0).getId();
    }

    public void update() {
        char direction = this._player.getMoveDirection();
        if(this._rooms.get(this._playerRoomId).hasExit(direction)) {
            System.out.println("Exit Available!");
        }
        else {
            System.out.println("No exit, sorry :(");
        }
    }
}
