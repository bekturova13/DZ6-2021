package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss1=new Boss();
        Weapon weapon1=new Weapon();
        boss1.setDamage(50);
        boss1.setHealth(900);
        boss1.setSuperAbility("Magical");
        weapon1.setWeaponType("MagicTools");
        weapon1.setWeaponName("Fireballs");
        System.out.println(boss1.getHealth()+" "+ boss1.getDamage()+" "
                +boss1.getSuperAbility()+" "+weapon1.getWeaponType()+" "+weapon1.getWeaponName());

}
}
