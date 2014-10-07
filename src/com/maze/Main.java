package com.maze;

public class Main {
    public static void main(String[] args) {
        GodSingleton God = GodSingleton.getInstance();
        Maze maze = God.createMaze();
        Player player = God.createPlayer();
        player.enterMaze(maze);
        player.move('N');
    }
}
