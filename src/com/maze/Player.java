package com.maze;

/**
 * Observer pattern: Subject.
 */
public class Player {
    private String _name;
    private int _health;
    private Maze _maze;
    private char _moveDirection;

    public Player(String name) {
        this._name = name;
    }

    public void move(char direction) {
        this._moveDirection = direction;
        this.notifyMaze();
    }

    public char getMoveDirection() {
        return this._moveDirection;
    }

    public void notifyMaze() {
        this._maze.update();
    }

    public void setHealth(int health) {
        this._health = health;
    }

    public void enterMaze(Maze maze) {
        this._maze = maze;
        maze.addPlayer(this);
    }
}
