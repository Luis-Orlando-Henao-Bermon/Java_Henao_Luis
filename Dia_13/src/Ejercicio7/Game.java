package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Game {
    //Violación de OCP (Open/Closed Principle) ya que si se quisiera agregar un enemigo con otra arma habria que
    //modificar el codigo principal
    List<Enemy> enemies=new ArrayList<Enemy>();

    public void init() {
        enemies.add(new GunEnemy());
        enemies.add(new KnifeEnemy());
    }

    void run() {
        boolean endGame=false;
        while (!endGame) {
            for (Enemy enemy: enemies){
                enemy.atack();
            }
        }
    }
}
