package com.example;

import java.sql.Statement;

import com.example.model.Marca;
import com.example.model.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class AppBD {

    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

private static void listarEstados() {
        Statement statement = null;

        try (var conn = getConnection()) {
            System.out.println("Conexão com o banco realizada com sucesso!");

            statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");

            while (result.next()){
                System.out.printf("ID: %d - NOME: %s - UF: %s \n", result.getInt("id"), result.getString("nome"), result.getString("uf") );
            }

        } catch (SQLException e) {
            if(statement == null) {
                System.out.println("Não foi possível conectar com o banco de dados");
                System.err.println(e.getMessage());
            } else {
                System.out.println("Não foi possível realizar a consulta no banco");
                System.err.println(e.getMessage()); 
            }
            
        }
    }
    private static void buscarEstadoPorUF(String uf) {
        try (var conn = getConnection()) {
            System.out.println("Conexão com o banco realizada com sucesso!");
            
            String sql = "select * from estado where uf= ?"; 
            System.out.println(sql);

            var statement = conn.prepareStatement(sql);
            statement.setString(1, uf);

            var result = statement.executeQuery();

            while (result.next()){
                System.out.printf("ID: %d - NOME: %s - UF: %s \n", result.getInt("id"), result.getString("nome"), result.getString("uf") );
            }

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ou realizar a consulta no banco");
            System.err.println(e.getMessage()); 
        }
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD); 
    }

    private static void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("Não foi possível carregar a lib do banco de dados");
            System.err.println(e.getMessage());
        }
    }

    public static void inserirProduto(Produto p) {
        var sql = "insert into produto (nome, marca_id, valor) values(?, ?, ?)"; 
        
        try {
            var conn = getConnection();
            var statement = conn.prepareStatement(sql);
            statement.setString(1, p.getNome());
            statement.setLong(2, p.getMarca().getMarca_id());
            statement.setDouble(3, p.getPreco());
            statement.executeUpdate();
            System.out.println("produto inserido com sucesso!");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 


    } 
    private static void buscarProduto(Produto p) {
        var sql = "select * from produto where id = ?"; 
        try {
            var conn = getConnection();
            var statement = conn.prepareStatement(sql);
            statement.setLong(1, p.getId());
            System.out.println(p.getId());
  
            var result = statement.executeQuery();
            while (result.next()){
                System.out.printf("ID: %d - NOME: %s - MARCA_ID: %d - VALOR: %f \n", result.getInt("id"), result.getString("nome"), result.getInt("marca_id"), result.getDouble("valor") );
            }
            System.out.println("Busca deu certo!");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        carregarDriverJDBC(); 
        //listarEstados();     
        //buscarEstadoPorUF("PE");

        Marca m = new Marca();
        m.setMarca_id(1);

        Produto p = new Produto();
        p.setMarca(m);
        p.setNome("Meu novo produto");
        p.setPreco(62.50);
        inserirProduto(p);
        
        p.setId(206);

        buscarProduto(p); 
            
   
    }



    
        

}
    

