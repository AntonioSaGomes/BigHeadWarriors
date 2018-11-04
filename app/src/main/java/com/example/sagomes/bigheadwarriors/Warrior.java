package com.example.sagomes.bigheadwarriors;

public class Warrior {

    public String nome;
    public int id;
    public int strength;
    public int health;

    public Warrior(){

    }

    public Warrior(String nome, int id, int strength, int health) {
        this.nome = nome;
        this.id = id;
        this.strength = strength;
        this.health = health;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getStrength() {
        return strength;
    }
}
