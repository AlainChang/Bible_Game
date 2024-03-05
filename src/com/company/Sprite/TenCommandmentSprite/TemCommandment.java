package com.company.Sprite.TenCommandmentSprite;

import com.company.Sprite.Sprite;

import javax.swing.*;

public class TemCommandment extends Sprite {

    public TemCommandment(int x , int y){
        setPosition(x , y);
        img = new ImageIcon("stone.png");
    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }
}
