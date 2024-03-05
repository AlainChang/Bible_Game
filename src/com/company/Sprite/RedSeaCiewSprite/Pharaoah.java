package com.company.Sprite.RedSeaCiewSprite;

import com.company.Sprite.Sprite;

import javax.swing.*;

public class Pharaoah extends Sprite {

    public Pharaoah(int x, int y) {
        setPosition(x, y);
        img = new ImageIcon("pharaoh.png");
    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }
}
