/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Gabriel
 */
public class RandomNumSetFun {
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> a = new HashSet<>();
        for(int x=1;x<=200;x++){
        a.add(r.nextInt(101));
        }
       System.out.println(a.toString());
    }
    //CONCLUSÃO: Pelo menos 99 números da sequência [0,100] não estão inclusos


}
