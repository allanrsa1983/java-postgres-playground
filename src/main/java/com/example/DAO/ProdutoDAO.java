package com.example.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.DAO.exceptions.ProdutoInexistenteException;
import com.example.model.Marca;
import com.example.model.Produto;


public class ProdutoDAO {

    private Connection connection; 

    public ProdutoDAO(Connection conn) {
        this.connection = conn; 
    } 

    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>(); 
        var sql = "select * from produto"; 
        
        try (var conn = ConnectionManager.getConnection()) {
            var statement = conn.createStatement();
            var result = statement.executeQuery(sql);

            int i = 0;
            while(result.next()) {
                int id = result.getInt(1);
                String nome = result.getString(2);
                int marca_id = result.getInt(3);
                Marca m = new Marca(marca_id, "A DEFINIR"); 
                double valor = result.getDouble(4);

                Produto p = new Produto(id, nome, m, valor); 
                lista.add(i, p);
                i++;
            }
        } catch (SQLException e) { 
            System.err.println (e.getMessage());
        }   
        return lista; 


    } 

    public Produto buscar(int produto_id) throws ProdutoInexistenteException {
        Produto retorno = null;

        var sql = "select * from produto where id=?"; 

        try (var conn = ConnectionManager.getConnection()) {
            var statement = conn.prepareStatement(sql);
            statement.setInt(1, produto_id);
            var result = statement.executeQuery(); 

            while (result.next()) {
                int id = result.getInt(1);
                String nome = result.getString(2);
                int marca_id = result.getInt(3);
                Marca m = new Marca(marca_id, "A DEFINIR"); 
                double valor = result.getDouble(4);

                retorno = new Produto(id, nome, m, valor);

            } 
            if (retorno == null) {
                throw new ProdutoInexistenteException(); 
                
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

        return retorno; 
    } 

    public void alterar(int produto_id, Produto novoProduto) {
        var sql = "update produto set nome = ?, marca_id = ?, valor =? where id=?"; 

        try (var conn = ConnectionManager.getConnection()) {
            var statement = conn.prepareStatement(sql);
            statement.setString(1, novoProduto.getNome());
            statement.setInt(2, novoProduto.getMarca().getMarca_id()); 
            statement.setDouble(3, novoProduto.getPreco());
            statement.setInt(4, produto_id);

            var result = statement.executeQuery();
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    } 

    public static void main(String[] args) throws SQLException {

        try {
            var conn = ConnectionManager.getConnection();
            ProdutoDAO pdao = new ProdutoDAO(conn);
            List<Produto> lista = pdao.listar();
            for (Produto produto : lista) {
                System.out.println(produto.toString());
            }

        } catch (SQLException e) {

        }

        try {
            var conn = ConnectionManager.getConnection();
            ProdutoDAO pdao = new ProdutoDAO(conn);

            int produto_id = 299;
            Produto p = null;
            try {
                p = pdao.buscar(produto_id);
            } catch (ProdutoInexistenteException pie) {
                System.out.println("chegou aqui");
                System.out.println(pie.getMessage());
            }
            System.out.println(p.toString());

        } catch (Exception e) {
            // TODO: handle exception
        }

        try {
            ProdutoDAO pdao = new ProdutoDAO(ConnectionManager.getConnection());
            int produto_id = 208; 
            Marca m = new Marca(13, "NOVA MARCA DO MOMENTO"); 
            Produto novo = new Produto(208, "NOVO PRODUTO ARRETADO", m, 100.00); 
            pdao.alterar(produto_id, novo);

        } catch (Exception e) {
            // TODO: handle exception
        }


        
    
    }
    
}
