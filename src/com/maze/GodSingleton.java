package com.maze;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

/**
 * Бог. Паттерн Синглтон.
 * Бог есть мир.  Паттерн Фабрика.
 */
public class GodSingleton {

    public static final char DIR_NORTH = 'N';
    public static final char DIR_SOUTH = 'S';
    public static final char DIR_WEST = 'W';
    public static final char DIR_EAST = 'E';

    private final Map world = new HashMap();

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
     * Добавляет обьект в мир.
     */
    public void create(String name, Object entity) {
        this.world.put(name, entity);
    }

    /**
     * Возвращает ссылку на объект мира
     * для операций.
     *
     * @param name String
     * @return Object
     */
    public Object access(String name) {
        return this.world.get(name);
    }
}
