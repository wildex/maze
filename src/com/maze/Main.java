package com.maze;

public class Main {
    public static void main(String[] args) {
        GodSingleton god = GodSingleton.getInstance();
        Maze maze = god.createMaze();
        Player player = god.createPlayer();
        maze.setRoomBuilder(new RandomRoomBuilder());
        maze.addRoom();
        player.enterMaze(maze);
    }
}
