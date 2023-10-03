/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.DTO;

import java.time.LocalDate;

/**
 *
 *
 */
public class ContatoDTO
{
    private long conID;
    private String conNome;
    private String conTel;

    public long getConID() {
        return conID;
    }

    public void setConID(long conID) {
        this.conID = conID;
    }

    public String getConNome() {
        return conNome;
    }

    public void setConNome(String conNome) {
        this.conNome = conNome;
    }

    public String getConTel() {
        return conTel;
    }

    public void setConTel(String conTel) {
        this.conTel = conTel;
    }
}
