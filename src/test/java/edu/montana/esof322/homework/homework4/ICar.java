package edu.montana.esof322.homework.homework4;

public interface ICar {
    void start();
    void putInDrive();
    void forward(int distance);
    void stop();
    void turnRight();
    void turnLeft();
    int getX();
    int getY();
}
