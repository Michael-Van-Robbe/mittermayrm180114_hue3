package net.htlgkr.mittermayrm180114.beispiel1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Weapon> weapons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("weapons.csv")))
        {
            br.readLine();

            String line;

            while((line = br.readLine()) != null)
            {
                String[] values = line.split(";");

                Weapon w = new Weapon(values[0], CombatType.valueOf(values[1]), DamageType.valueOf(values[2]),
                        Integer.parseInt(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]),
                        Integer.parseInt(values[6]));
                weapons.add(w);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        for (Weapon w: weapons)
        {
            System.out.println(w.toString());
        }
    }
}