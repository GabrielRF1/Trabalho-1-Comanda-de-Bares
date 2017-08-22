/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.LinkedList;

/**
 *
 * @author Gabriel
 */
public class Turma {

    public static void main(String[] args) {
        LinkedList<Aluno> alunos;
        alunos = new LinkedList<>();
        int j = 1;
        for (int i = 1; i <= 200;) {
            for (; i <= 50 * j; i++) {
                Aluno e = new Aluno(i, j);
                alunos.addLast(e);
            }
            j++;
        }
        System.out.println("Número \t\t\t\t\t Série");
        for(Aluno c: alunos){
        System.out.printf("%d \t\t\t\t\t %d \n",c.getNum_aluno(),c.getSerie());
        }
    }
}
