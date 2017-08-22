/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author Gabriel
 */
public class Aluno {
    protected int num_aluno, serie;

    public Aluno(int num_aluno, int serie) {
        this.num_aluno = num_aluno;
        this.serie = serie;
    }

    public int getNum_aluno() {
        return num_aluno;
    }

    public int getSerie() {
        return serie;
    }

    public void setNum_aluno(int num_aluno) {
        this.num_aluno = num_aluno;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    
    
}
