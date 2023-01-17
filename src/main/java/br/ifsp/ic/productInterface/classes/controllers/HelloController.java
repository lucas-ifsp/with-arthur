package br.ifsp.ic.productInterface.classes.controllers;

import com.example.javafxtasks.classes.bean.Product;
import com.example.javafxtasks.classes.dao.ProductDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML private TextField priceTextField;
    @FXML private TextField quantityTextField;
    @FXML private TextField nameTextField;
    @FXML private TextField codeTextField;
    @FXML private TableView<Product> table;
    @FXML private TableColumn<Product, Long> cCode;
    @FXML private TableColumn<Product, String> cName;
    @FXML private TableColumn<Product, Double> cPrice;
    @FXML private TableColumn<Product, Integer> cQuantity;
    private ObservableList<Product> products = FXCollections.observableArrayList();
    @FXML

    public void initialize() {
        products.addAll(ProductDAO.getProducts());
        fill();
    }

    public void fill(){
        cCode.setCellValueFactory(new PropertyValueFactory<>("code"));
        cName.setCellValueFactory(new PropertyValueFactory<>("name"));
        cPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        cQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        table.setItems(products);
    }
    public void save(){
        var product = new Product(Long.parseLong(codeTextField.getText()), nameTextField.getText(), Double.parseDouble(priceTextField.getText()),
                Integer.parseInt(quantityTextField.getText()));
        if(!ProductDAO.alreadyExists(product)) {
            ProductDAO.save(product);
            products.add(product);
            fill();
        }
        else {
            throw new RuntimeException("Product already exists");
        }
    }
    public void delete(){
        ProductDAO.delete(table.getSelectionModel().getSelectedItem());
        products.remove(table.getSelectionModel().getSelectedItem());
    }

    public void update(){
        var oldProduct = table.getSelectionModel().getSelectedItem();
        var newProduct = new Product(Long.parseLong(codeTextField.getText()), nameTextField.getText(),
                Double.parseDouble(priceTextField.getText()),  Integer.parseInt(quantityTextField.getText()));
        ProductDAO.update(oldProduct, newProduct);
        int index = products.indexOf(oldProduct);
        products.set(index, newProduct);
        fill();
    }

    public void clear(){
        codeTextField.setText("");
        nameTextField.setText("");
        priceTextField.setText("");
        quantityTextField.setText("");
    }

}