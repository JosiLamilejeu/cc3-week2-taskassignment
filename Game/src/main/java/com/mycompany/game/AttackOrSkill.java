/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author Nicole
 */
public class AttackOrSkill {

    int basicAttackDamage;
    int skillDamage;

    AttackOrSkill (int basicAttackDamage, int skillDamage) {
    this.basicAttackDamage = basicAttackDamage;
    this.skillDamage = skillDamage;
    }

    int basicAttack() {
        return basicAttackDamage;
    }

    int skillAttack() {
        return skillDamage;
    }
    String identity() {
        return "\nThe AttackOrSkill class enables the Character class to use either a basic attack or a skill attack which in turn either regenerates or reduces the skill point count.\n";
    }
}
