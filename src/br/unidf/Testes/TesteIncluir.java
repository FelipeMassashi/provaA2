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
public class TesteIncluir {
    public static void main(String[] args) throws Exception
    {
        ContatoDTO contato = new ContatoDTO();
        contato.setConNome("Rafael Teste");
        contato.setConTel("77777777");
        ContatoDAL dal = new ContatoDAL();
        dal.incluirContato(contato);
        System.out.print("Contato " + contato.getConNome() + " Cadastrado com sucesso!");
    }    
}