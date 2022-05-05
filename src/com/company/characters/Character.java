package com.company.characters;

public class Character {
    WeaponBehavior weaponBehavior;

    void fight() {
        this.weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
