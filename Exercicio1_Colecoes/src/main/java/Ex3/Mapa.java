/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gabriel
 */
public class Mapa {

    public static void main(String[] args) {
        Aluno[] a = new Aluno[3];
        Map<String, Aluno> mapinha = new HashMap<>();
        mapinha.put("Representante de sala", a[1] = new Aluno(1, 22, "Ana"));
        mapinha.put("Representante Discente", a[0] = new Aluno(2, 2, "José da Silva"));
        mapinha.put("Aniversariante do dia", a[2] = new Aluno(3, 24, "Leleo"));

        System.out.println("Representante Discente,"+mapinha.get("Representante Discente").toString());
        System.out.println("Representante de sala,"+mapinha.get("Representante de sala").toString());
        System.out.println("Aniversariante do dia,"+mapinha.get("Aniversariante do dia").toString());

    }
}
