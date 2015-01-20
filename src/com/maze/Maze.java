package com.maze;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

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

    public int addRoom() {
        this._roomBuilder.createRoom();
        this._roomBuilder.generateRoomId(this.getRoomsCount());
        this._roomBuilder.generateRoomExits();
        this._rooms.put(this._roomBuilder.getRoom().getId(), this._roomBuilder.getRoom());
        return this._roomBuilder.getRoom().getId();
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
        if(this._rooms.get(this._playerRoomId).hasExit(this._player.getMoveDirection())) {
            this._playerRoomId = this.addRoom();
        }
    }

    public void printMaze() {
        Iterator it = this._rooms.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }
}
