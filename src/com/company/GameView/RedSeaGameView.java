package com.company.GameView;

import com.company.Sprite.Door;
import com.company.Sprite.RedSeaCiewSprite.Anubis;
import com.company.Sprite.RedSeaCiewSprite.Cat;
import com.company.Sprite.RedSeaCiewSprite.Pharaoah;

import javax.swing.*;
import java.util.ArrayList;

public class RedSeaGameView extends GameView{
    public ArrayList<Cat> getCats() {
        return cats;
    }

    private ArrayList<Cat> cats = new ArrayList<Cat>();

    public ArrayList<Anubis> getAnubis() {
        return anubis;
    }

    private ArrayList<Anubis> anubis = new ArrayList<Anubis>();

    public ArrayList<Pharaoah> getPharoah() {
        return pharoah;
    }

    private ArrayList<Pharaoah> pharoah = new ArrayList<Pharaoah>();

    public RedSeaGameView(){
        img = new ImageIcon("sea.jpg");
        elements = new ArrayList<>();
        door = new Door(10,10);

        cats.add(new Cat(6,3));
        cats.add(new Cat(6,4));
        cats.add(new Cat(6,5));
        cats.add(new Cat(8,3));
        cats.add(new Cat(1,3));
        cats.add(new Cat(6,9));
        cats.add(new Cat(2,7));
        cats.add(new Cat(2,8));

        pharoah.add(new Pharaoah(5,4));
        pharoah.add(new Pharaoah(6,1));
        pharoah.add(new Pharaoah(5,1));
        pharoah.add(new Pharaoah(4,1));
        pharoah.add(new Pharaoah(3,1));
        pharoah.add(new Pharaoah(1,4));

        anubis.add(new Anubis(2,6));
        anubis.add(new Anubis(7,6));
        anubis.add(new Anubis(7,7));
        anubis.add(new Anubis(7,8));
        anubis.add(new Anubis(10,1));

        elements.addAll(anubis);
        elements.addAll(pharoah);
        elements.addAll(cats);
        elements.add(door);
    }
}
