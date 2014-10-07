package com.maze;


/**
 * Случайный генератор комнат
 */
public class RandomRoomBuilder extends RoomBuilder {

    /**
     * Генерирует уникальный ID для комнаты.
     */
    public void generateRoomId(int lastId) {
        this._room.setId(lastId++);
    }
    
    /**
     * Расставляет возможнные выходы из комнаты
     */
    public void generateRoomExits() {
        GodSingleton god = GodSingleton.getInstance();
        this._room.setExit(GodSingleton.DIR_NORTH, god.chooseBoolean());
        this._room.setExit(GodSingleton.DIR_SOUTH, god.chooseBoolean());
        this._room.setExit(GodSingleton.DIR_WEST, god.chooseBoolean());
        this._room.setExit(GodSingleton.DIR_EAST, god.chooseBoolean());
    }
}
