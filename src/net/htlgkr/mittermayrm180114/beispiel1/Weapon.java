package net.htlgkr.mittermayrm180114.beispiel1;

public class Weapon
{
    String name;
    CombatType combatType;
    DamageType damageType;
    int damage;
    int speed;
    int strength;
    int value;

    public Weapon(String name, CombatType combatType, DamageType damageType, int damage, int speed, int strength, int value)
    {
        this.name = name;
        this.combatType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", combatType=" + combatType +
                ", damageType=" + damageType +
                ", damage=" + damage +
                ", speed=" + speed +
                ", strength=" + strength +
                ", value=" + value +
                '}';
    }
}