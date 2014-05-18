package com.maze;

public class Main {
    public static void main(String[] args) {
        GodSingleton god = GodSingleton.getInstance();
        Maze maze = god.create("maze", new Maze());
        god.access("maze").setRoomBuilder(new RandomRoomBuilder());
        god.access("maze").addRoom();
    }
}
