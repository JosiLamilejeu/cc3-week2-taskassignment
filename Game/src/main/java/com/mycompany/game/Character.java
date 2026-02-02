/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author joshr
 */
public class Character {
    String name;
    int health;
    int energy;
    int maxEnergy;
    int skillPoints;
    int maxSkillPoints;
    AttackOrSkill attackAndSkill;
    Ultimate ultimate;

    Character(String name, int health, int maxEnergy, int maxSkillPoints, AttackOrSkill attackAndSkill, Ultimate ultimate) {
        this.name = name;
        this.health = health;
        this.maxEnergy = maxEnergy;
        this.energy = 0;
        this.maxSkillPoints = maxSkillPoints;
        this.skillPoints = 3;
        this.attackAndSkill = attackAndSkill;
        this.ultimate = ultimate;
    }

    String basicAttack() {
        if (skillPoints < maxSkillPoints) {
            skillPoints++;
            energy += 10;
            if (energy > maxEnergy) {
                energy = maxEnergy;
            }
        }
        return "\n"+ name + " attacks and deals " + attackAndSkill.basicAttack() + " damage.\n" + "Gained 1 Skill Point (Current: " + skillPoints + "/" + maxSkillPoints + ").\n";
    }

    String useSkill() {
        if (skillPoints > 0) {
            skillPoints--;
            energy += 20;
            if (energy > maxEnergy) {
                energy = maxEnergy;
            }

            return name + " uses skill and deals " + attackAndSkill.skillAttack() + " damage.\n" + "Spent 1 Skill Point (Current: " + skillPoints + "/" + maxSkillPoints + ").\n" + "Energy regenerated (Current: " + energy + "/" + maxEnergy + ").\n";
        }
        return name + " does not have enough Skill Points.\n";
    }

    String useUltimate() {
        if (energy >= ultimate.requirementEnergy) {
            energy = 0;
            return name + " uses ultimate and deals " + ultimate.useUltimate() + " damage.\n";
        }
        return name + " needs " + ultimate.requirementEnergy + " Energy to use ultimate.\n";
    }

    String status() {
        return "\n=== Character Status ===\n" + "Name: " + name + "\n" + "Health: " + health + "\n" + "Energy: " + energy + "/" + maxEnergy + "\n" + "Skill Points: " + skillPoints + "/" + maxSkillPoints + "\n";
    }

    String identity() {
        return "\nCharacter name: " + name + "\n\nThe Character class represents the a game character where in which you could manage it's status and actions.\n";
    }

    void print(String endRound) {
            System.out.println(endRound);
    }
}
