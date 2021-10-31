package main;

import java.awt.event.*;

import main.GameObjects.*;

public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        // System.out.println(key);
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tmpObject = handler.object.get(i);
            if(tmpObject.getID() == ID.Player) {
                // Key events for the player
                if(key == KeyEvent.VK_W) tmpObject.setSpeedY(-5);
                if(key == KeyEvent.VK_A) tmpObject.setSpeedX(-5);
                if(key == KeyEvent.VK_S) tmpObject.setSpeedY(5);
                if(key == KeyEvent.VK_D) tmpObject.setSpeedX(5);
            }
        }
        if(key == KeyEvent.VK_ESCAPE) System.exit(0);
    }
    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        // System.out.println(key);
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tmpObject = handler.object.get(i);
            if(tmpObject.getID() == ID.Player) {
                // Key events for the player
                if(key == KeyEvent.VK_W) tmpObject.setSpeedY(0);
                if(key == KeyEvent.VK_A) tmpObject.setSpeedX(0);
                if(key == KeyEvent.VK_S) tmpObject.setSpeedY(0);
                if(key == KeyEvent.VK_D) tmpObject.setSpeedX(0);
                
            }
        }
    }

}