/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.DAL;

import br.unidf.DTO.ContatoDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 */
public class ContatoDAL extends ConexaoMySQL{
    public void incluirContato(ContatoDTO contato) throws Exception
    {
        //Prepara a conexão com o MySQL
        abrirBD();
            SQL = "INSERT INTO contatos (conNome, conTel) VALUES (?, ?)";
        ps = con.prepareStatement(SQL);
        //Busca os valores da classe ContatoDTO
        ps.setString(1, contato.getConNome());
        ps.setString(2, contato.getConTel());
        ps.executeUpdate();
        fecharBD();
    }
    public ContatoDTO selecionarContatoPorID(Integer conID)throws Exception
    {
        abrirBD();
        SQL = "SELECT * FROM contatos WHERE conID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, conID);
        rs = ps.executeQuery();
        ContatoDTO contato = new ContatoDTO();
        if(rs.next())
        {
            contato.setConID(rs.getInt("conID"));
            contato.setConNome(rs.getString("conNome"));
            contato.setConTel(rs.getString("conTel"));
            fecharBD();            
        }
        return contato;
    }
    //Método que vai selecionar todos os contatos no nosso Banco de Dados
    //e ordenar por nome do contato
    public List selecionarListaContatos() throws Exception
    {
        abrirBD();
        SQL = "SELECT * FROM contatos ORDER BY conNome";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        List listaContatos = new ArrayList();
        while(rs.next())
        {
           ContatoDTO contato = new ContatoDTO();
           contato.setConID(rs.getInt("conID"));
           contato.setConNome(rs.getString("conNome"));
           contato.setConTel(rs.getString("conTel"));
           listaContatos.add(contato);         
        }
        fecharBD();
        return listaContatos;
    }
    //Método que vai fazer as alterações necessárias nos dados dos contatos
    //selecionados por seu código no nosso Banco de Dados
    public void alterarContato(ContatoDTO contato) throws Exception
    {
        abrirBD();         
        SQL = "UPDATE contatos SET conNome = ?, conTel = ? WHERE conID = ?";
        ps = con.prepareStatement(SQL);        
        ps.setString(1, contato.getConNome());  
        ps.setString(2, contato.getConTel());
        ps.setLong(3, contato.getConID());
        ps.execute();
        fecharBD();
    }
    public void excluirContato(Integer conID) throws Exception
    {
        abrirBD();
        SQL = "DELETE FROM contatos WHERE conID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, conID);
        ps.execute();
        fecharBD();
    }    
}