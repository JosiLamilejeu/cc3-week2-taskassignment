/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author pranc
 */
public class Ultimate {
    int ultimateDamage;
    int requirementEnergy;

    Ultimate(int ultimateDamage, int requirementEnergy){
       this.ultimateDamage = ultimateDamage;
       this.requirementEnergy = requirementEnergy;
    }

    int useUltimate(){
        return ultimateDamage;
    }
    String identity() {
        return "\nThe Ultimate class enables the Character class to use an ultimate move(in this scenario a more higher damage) which consumes the accumulated energy.\n";
    }
}
