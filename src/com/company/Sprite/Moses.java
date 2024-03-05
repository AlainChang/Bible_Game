package com.company.Sprite;

import com.company.GameView.DisasterView;
import com.company.GameView.RedSeaGameView;
import com.company.GameView.TenCommandmentsView;
import com.company.Main;
import com.company.Sprite.DisasterView.Bug;
import com.company.Sprite.DisasterView.Frog;
import com.company.Sprite.DisasterView.Ice;
import com.company.Sprite.DisasterView.Tombstone;
import com.company.Sprite.RedSeaCiewSprite.Anubis;
import com.company.Sprite.RedSeaCiewSprite.Cat;
import com.company.Sprite.RedSeaCiewSprite.Pharaoah;
import com.company.Sprite.TenCommandmentSprite.TemCommandment;

import javax.swing.*;
import java.util.ArrayList;

public class Moses extends Sprite{

    public Moses(int x , int y){
        setPosition(x , y);
        img  = new ImageIcon("Moses.png");
    }

    @Override
    public String overlap(int x, int y) {
        if(Main.gameView instanceof DisasterView){
            //check box & frogs
            ArrayList<Frog> frogs = ((DisasterView)Main.gameView).getFrog();
            ArrayList<Bug> bugs =((DisasterView) Main.gameView).getBugs();
            for(Frog f : frogs){
                if(f.getRelativePosition() != null && x == f.getRelativePosition().x && y == f.getRelativePosition().y){
                    return "Die";
                }
            }

            for(Bug b : bugs){
                if(b.getRelativePosition() != null && x == b.getRelativePosition().x && y == b.getRelativePosition().y){
                    return "Die";
                }
            }
            //check for ice & tombstones
            ArrayList<Ice> ice = ((DisasterView) Main.gameView).getIceCubes();
            ArrayList<Tombstone> tombstones = ((DisasterView) Main.gameView).getStones();
            for(Tombstone t : tombstones){
                if(t.getRelativePosition() != null && x == t.getRelativePosition().x && y == t.getRelativePosition().y){
                    return "Cannot move";
                }
            }

            for(Ice i : ice){
                if(i.getRelativePosition() != null && x == i.getRelativePosition().x && y == i.getRelativePosition().y){
                    return "Cannot move";
                }
            }
            //check for door
            Door door = Main.gameView.getDoor();
            if(x == door.getRelativePosition().x && y == door.getRelativePosition().y){
                return "Next level";
            }
        }else if(Main.gameView instanceof RedSeaGameView){
            //check for cats
            ArrayList<Cat> cats = ((RedSeaGameView) Main.gameView).getCats();
            for(Cat c : cats){
                if(c.getRelativePosition() != null && x == c.getRelativePosition().x && y == c.getRelativePosition().y){
                    return "Cannot move";
                }
            }
            //check pharaoh and anubis
            ArrayList<Anubis> anubis = ((RedSeaGameView) Main.gameView).getAnubis();
            ArrayList<Pharaoah> pharoahs = ((RedSeaGameView) Main.gameView).getPharoah();
            for(Anubis a : anubis) {
                if (a.getRelativePosition() != null && x == a.getRelativePosition().x && y == a.getRelativePosition().y) {
                    return "Die";
                }
            }
            for(Pharaoah p : pharoahs) {
                if (p.getRelativePosition() != null && x == p.getRelativePosition().x && y == p.getRelativePosition().y) {
                    return "Cannot move";
                }
            }
            //check for door
            Door door = Main.gameView.getDoor();
            if(x == door.getRelativePosition().x && y == door.getRelativePosition().y){
                return "Next level";
            }
        }else if(Main.gameView instanceof TenCommandmentsView){
            ArrayList<TemCommandment> stones = ((TenCommandmentsView) Main.gameView).getStone();
            for(TemCommandment stone : stones){
                if(stone.getRelativePosition() != null && stone.getRelativePosition().x == x && stone.getRelativePosition().y == y){
                    stone.setNullPosition();
                    ((TenCommandmentsView) Main.gameView).setCount(1);
                    if(((TenCommandmentsView) Main.gameView).getCount()==5){
                        return "Game over";
                    }else{
                        return "none";
                    }
                }
            }
        }
        return "none";
    }
}
