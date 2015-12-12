package ru.dvimer;

/**
 * Created by Алексей on 12.12.2015.
 */
public class Monster {
    private String name;
    private int attake;
    private int defference;
    private int intelect;
    private int hp;

    private void attaka()

    public Monster(String name, int attake, int defference, int intelect, int hp){
        this.name = name;
        this.attake = attake;
        this.defference = defference;
        this.intelect = intelect;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAttake(){
        return attake;
    }

    public void setAttake(int attake){
        this.attake = attake;
    }

    public int getDefference() {
        return defference;
    }

    public void setDefference(int defference) {
        this.defference = defference;
    }

    public int getIntelect() {
        return intelect;
    }

    public void setIntelect(int intelect) {
        this.intelect = intelect;
    }
}
