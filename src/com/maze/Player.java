package com.maze;

public class Player {
    private String _name;
    private int _health;

    public void setName(String name) {
        this._name = name;
    }

    public void setHealth(int health) {
        this._health = health;
    }

    public void enterMaze(Maze maze) {
        maze.addPlayer(this);
    }
}
