/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Testes;

import br.unidf.DAL.ContatoDAL;

/**
 *
 *
 */
public class TesteExcluirContato {
    public static void main(String[ ] args) throws Exception
    {
        ContatoDAL dal = new ContatoDAL();
        dal.excluirContato(9);
        System.out.print("Contato Excluído com sucesso!");
    }
}