package com.maze;

public class Main {
    public static void main(String[] args) {
        GodSingleton god = GodSingleton.getInstance();
        Maze maze = god.createMaze();
        maze.setRoomBuilder(new RandomRoomBuilder());
        maze.addRoom();
    }
}
