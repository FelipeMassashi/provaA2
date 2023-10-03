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
public class TesteAlterarContato {
    public static void main(String[ ] args) throws Exception
    {
        ContatoDAL dal = new ContatoDAL();
        ContatoDTO contato = new ContatoDTO();
        contato.setConID(9);
        contato.setConNome("Rafael Soares de Almeida");
        contato.setConTel("7888888");
        dal.alterarContato(contato);
        System.out.print("Contato " + contato.getConNome() + " Alterado com sucesso!");    
    }
}
