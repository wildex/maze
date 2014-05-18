package com.maze;

/**
 * Генератор комнат. Паттерн Билдер.
 */
public abstract class RoomBuilder {
    protected Room _room;
    public Room getRoom() {
        return this._room;
    }
    public void createRoom() {
        this._room = new Room();
    }
    public abstract void generateRoomId(int lastId);
    public abstract void generateRoomExits();
}
