package com.maze;

/**
 * Комната лабиринта.
 */
public class Room {
    private int _roomId;
    private boolean _exitNorth;
    private boolean _exitSouth;
    private boolean _exitWest;
    private boolean _exitEast;

    public void setExit(char direction, boolean isAvailable) {
        switch (direction)  {
            case GodSingleton.DIR_NORTH:
                this._exitNorth = isAvailable;
                break;
            case GodSingleton.DIR_SOUTH:
                this._exitSouth = isAvailable;
                break;
            case GodSingleton.DIR_WEST:
                this._exitWest = isAvailable;
                break;
            case GodSingleton.DIR_EAST:
                this._exitEast = isAvailable;
                break;
        }
    }

    public boolean hasExit(char direction) {
        boolean result = false;
        switch (direction)  {
            case GodSingleton.DIR_NORTH:
                result = this._exitNorth;
                break;
            case GodSingleton.DIR_SOUTH:
                result = this._exitSouth;
                break;
            case GodSingleton.DIR_WEST:
                result = this._exitWest;
                break;
            case GodSingleton.DIR_EAST:
                result = this._exitEast;
                break;
        }
        return result;
    }

    public void setId(int id) {
        this._roomId = id;
    }

    public int getId() {
        return this._roomId;
    }
}
