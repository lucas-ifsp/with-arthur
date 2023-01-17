package br.ifsp.ic.productInterface.classes.dao;

import com.example.javafxtasks.classes.bean.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {

    public static synchronized boolean save(Product p){
        String sql = "INSERT INTO product (code, name, price, quantity) values (?,?,?,?)";
        try (PreparedStatement stmt = ConnectionFactory.createPreparedStatement(sql)) {
            stmt.setLong(1, p.getCode());
            stmt.setString(2, p.getName());
            stmt.setDouble(3, p.getPrice());
            stmt.setInt(4, p.getQuantity());
            return stmt.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static synchronized void delete(Product product){
        String sql = "Delete from product where code=?";
        try (PreparedStatement stmt = ConnectionFactory.createPreparedStatement(sql)){
            stmt.setLong(1, product.getCode());
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static synchronized void update(Product oldProduct, Product updateProduct){
        String sql = "UPDATE product SET code=?, name=?, price=?, quantity=? WHERE code=?";
        try (PreparedStatement stmt = ConnectionFactory.createPreparedStatement(sql)){
            stmt.setLong(1, updateProduct.getCode());
            stmt.setString(2, updateProduct.getName());
            stmt.setDouble(3, updateProduct.getPrice());
            stmt.setInt(4, updateProduct.getQuantity());
            stmt.setLong(5, oldProduct.getCode());
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static synchronized ArrayList<Product> getProducts(){
        String sql = "Select * from product";
        var products = new ArrayList<Product>();
        try(PreparedStatement stmt = ConnectionFactory.createPreparedStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                products.add(new Product(rs.getLong("code"), rs.getString("name"),
                        rs.getFloat("price"), rs.getInt("quantity")));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return products;
    }

    public static boolean alreadyExists(Product product) {
        String sql = "Select * from product where code=?";
        var products = new ArrayList<Product>();
        try(PreparedStatement stmt = ConnectionFactory.createPreparedStatement(sql)){
            stmt.setLong(1, product.getCode());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                return true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
