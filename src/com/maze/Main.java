package com.maze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        char command = '\0';
        GodSingleton God = GodSingleton.getInstance();
        Maze maze = God.createMaze();
        Player player = God.createPlayer();
        player.enterMaze(maze);
        do {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("What we do: ");
            try{
                command = br.readLine().charAt(0);
                player.move(command);
                maze.printMaze();
            }catch(IOException ex){
                System.err.println("Word halt!");
            }
        }
        while (command != 'Q');
    }
}
