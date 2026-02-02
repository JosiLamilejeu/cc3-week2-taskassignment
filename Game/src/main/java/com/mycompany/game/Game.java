/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game;

/**
 *
 * @author joshr
 */
public class Game {
    public static void main(String[] args) {

        AttackOrSkill basicAndSkillAttack = new AttackOrSkill(40, 120);
        Ultimate ultimate = new Ultimate(300, 100);

        Character character = new Character("Pauleen", 100, 70, 5, basicAndSkillAttack, ultimate);

        String endRound = "";

        endRound += character.identity();
        endRound += basicAndSkillAttack.identity();
        endRound += ultimate.identity();

        endRound += character.status();
        endRound += character.basicAttack();
        endRound += character.useSkill();
        endRound += character.useUltimate();
        endRound += character.status();

        character.print(endRound);

    }
}
