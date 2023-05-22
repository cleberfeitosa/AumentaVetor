/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cleber Feitosa
 */
public class Vetor {

    private double [] alunos = new double[2];
    private int totalDeNotas = 0;

    
public void garantaEspaco() {
        if (this.totalDeNotas == this.alunos.length) {
            double[] novaArray = new double[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                novaArray[i] = this.alunos[i];
            }
            this.alunos = novaArray;
        }
    }

}
