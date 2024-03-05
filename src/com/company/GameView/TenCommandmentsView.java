package com.company.GameView;

import com.company.Sprite.TenCommandmentSprite.TemCommandment;

import javax.swing.*;
import java.util.ArrayList;

public class TenCommandmentsView extends GameView{

    public ArrayList<TemCommandment> getStone(){
        return stones;
    }

    public ArrayList<TemCommandment> stones = new ArrayList<>();

    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count += count;
    }
    private int count = 0;

    public TenCommandmentsView(){
        img = new ImageIcon("mountain.jpg");
        elements = new ArrayList<>();
        count = 0;
        stones.add(new TemCommandment(1,6));
        stones.add(new TemCommandment(2,6));
        stones.add(new TemCommandment(3,5));
        stones.add(new TemCommandment(3,2));
        stones.add(new TemCommandment(5,6));


        elements.addAll(stones);
    }


}
