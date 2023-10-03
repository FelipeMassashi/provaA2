/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Testes;

import br.unidf.DAL.ContatoDAL;
import br.unidf.DTO.ContatoDTO;

/**
 *
 *
 */
public class TesteSelecionarContatoPorID {
    public static void main(String[ ] args) throws Exception
    {
        ContatoDAL dal = new ContatoDAL();
        ContatoDTO contato = dal.selecionarContatoPorID(12);
        System.out.println("Codigo: " + contato.getConID());
        System.out.println("Nome Contato: " + contato.getConNome());
        System.out.println("Telefone: 0" + contato.getConTel());  //"0" só para mostra o zero antes do DDD.     
    }    
}
