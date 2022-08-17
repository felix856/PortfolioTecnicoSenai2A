package com.mycompany.prodonto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AcessoBD {
     private static Connection connection;
   
    public static Connection getConnection(){
        if(connection == null){
            try{
                //Class.forName("com.mysql.jdbc.Driver"); //para mysql
                Class.forName("org.postgresql.Driver");//para postgresql
                String host = "localhost";
                String port = "5432";
                String database = "postgres";
                String user = "postgres";
                String pass = "postgres";//digitar a senha do seu banco
                //String url = "jdbc:mysql://"+host+":"+port+"/"+database; //para mysql
                String url = "jdbc:postgresql://"+host+":"+port+"/"+database;//para postgresql
                connection = DriverManager.getConnection(url, user, pass);                
               
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public static void close(){
        if (connection == null){
            throw new RuntimeException("Nenhuma conexão aberta!");
        }
        else{
            try{
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
 
    public static void salvar_Dentista (Dentista dentista){
        try{
            Connection con = AcessoBD.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO dentista (id, nome, cpf, quantidade_pacientes) values(?, ?, ?, ?)");
            ps.setInt(1, dentista.getId());
            ps.setString(2, dentista.getNome());
            ps.setString(3,dentista.getCpf());
            ps.setInt(4, dentista.getQuantidade_pacientes());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void salvar_Clientes (Cliente cliente){
        try{
            Connection con = AcessoBD.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO usuario (idDiretor, nome, cpf, id_filme) values(?, ?, ?, ?)");
            ps.setInt(1, cliente.getId_Cliente());
            ps.setString(2, cliente.getNome_cli());
            ps.setString(3, cliente.getHora_marcada());
            ps.setString(4,cliente.getCpf_cli());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void salvar_Materiais (Material material){
        try{
            Connection con = AcessoBD.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO materiais (id_material, nome, preco) values(?, ?, ?)");
            ps.setInt(1, material.getId_material());
            ps.setString(2, material.getNome());
            ps.setString(3, material.getPreco());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void deleta(int id){
        try{
            Connection con = AcessoBD.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM dentista WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();


            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static String visualiza_Dentista(int id, String... atributo){
        String Dentista = "";
        try{
            Connection con = AcessoBD.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM atores where idAtores ="+id);
            ResultSet rs = ps.executeQuery();
            String vlDentista = "<html>";
            while(rs.next()){
                for(String i : atributo){
                    vlDentista = vlDentista + " | " +rs.getString(i);
                }
                vlDentista = "</html>";
                vlDentista = vlDentista + "-";
            }
            

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return Dentista;
    }
public static String visualiza_Cliente(int id_Cli, String... atributo){
        String Cliente = "";
        try{
            Connection con = AcessoBD.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM cliente where id_Cliente ="+id_Cli);
            ResultSet rs = ps.executeQuery();
            String vlCliente = "<html>";
            while(rs.next()){
                for(String i : atributo){
                    vlCliente = vlCliente + " | " +rs.getString(i);
                }
                vlCliente = "</html>";
                Cliente = vlCliente + "-";
            }
            

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return Cliente;
    }
public static String visualiza_Material(int id_Material, String... atributo){
        String Material = "";
        try{
            Connection con = AcessoBD.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM materiais where id_materiaç ="+id_Material);
            ResultSet rs = ps.executeQuery();
            String vlMaterial = "<html>";
            while(rs.next()){
                for(String i : atributo){
                    vlMaterial = vlMaterial + " | " +rs.getString(i);
                }
                vlMaterial = "</html>";
                Material = vlMaterial + "-";
            }
            

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return Material;
    }


    public static void atualizaBanco(Dentista dentista){
        deleta(dentista.getId());
        salvar_Dentista(dentista);
    }
}
