/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jjms.galletadelafortuna.impl;

import com.jjms.galletadelafortuna.inter.GalletaDeLaFortunaInterface;
import java.util.Random;

/**
 *
 * @author JoseJavier
 */
public class GalletaDeLaFortuna implements GalletaDeLaFortunaInterface{

    private String[] fortunaMensajes = 
                                        {"Detente, respira y sigue avanzando.",
                                         "Tu oportunidad está cerca, ve y tómala.",
                                         "Lo que no te mata, muta y lo intente de nuevo.",
                                         "No digas mmdas, meriyein.",
                                         "Norman se fue de sabático, cariño.",
                                         "Yo no puedo, tengo fútbol.",
                                         "Tú no eres Peter Parker ._.",
                                         "Se te va el tren, araña.",
                                         "Sabes, yo también tengo algo de científico.",
                                         "When Gwen le dice ven a Ben. Ven Ben.",
                                         "Aquí no, Chiquistrikis.",
                                         "¿Contexto?",
                                         "¿Quiéres que te la truene?",
                                         "Basta, Rogelio!!!",
                                         "Sigue un paso a la vez."};
    
    @Override
    public String verFortuna() {
        Random random = new Random();
        
        int value = random.nextInt(fortunaMensajes.length);
        
        return fortunaMensajes[value];
    }   
}
