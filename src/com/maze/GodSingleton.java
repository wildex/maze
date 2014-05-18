package com.maze;
import java.util.Random;

/**
 * God. Singleton Pattern.
 * God is a beginning of everything. Factory method pattern.
 */
public class GodSingleton {

    public static final char DIR_NORTH = 'N';
    public static final char DIR_SOUTH = 'S';
    public static final char DIR_WEST = 'W';
    public static final char DIR_EAST = 'E';

    /**
     * Генератор случайных чисел
     */
    private Random _randomGenerator;

    private static final GodSingleton _instance = new GodSingleton();

    private GodSingleton() {
        this._randomGenerator = new Random();
    }

    public static GodSingleton getInstance() {
        return _instance;
    }

    /**
     * Возвращает true или false случайным образом
     *
     * @return boolean
     */
    public boolean chooseBoolean() {
        return _randomGenerator.nextBoolean();
    }

    /**
     * Creates maze.
     * @return Maze
     */
    public Maze createMaze() {
        return new Maze();
    }
}
