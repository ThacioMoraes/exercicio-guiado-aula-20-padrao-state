package com.company;

import com.company.models.Sede;
import com.company.models.Tamagochi;
import com.company.models.Triste;

public class Main {

    public static void main(String[] args) {
        Tamagochi jhonathanNeto = new Tamagochi();

        jhonathanNeto.comer();

        jhonathanNeto.setEstado(new Sede(jhonathanNeto));

        jhonathanNeto.comer();

        jhonathanNeto.beber();

        jhonathanNeto.setEstado(new Triste(jhonathanNeto));

        jhonathanNeto.comer();
        jhonathanNeto.beber();
        jhonathanNeto.carinho();


    }
}
