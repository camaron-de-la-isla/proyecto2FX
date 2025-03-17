package com.example.proyecto2fx.controller;
import com.example.proyecto2fx.model.Cuidador;
import com.example.proyecto2fx.model.Doctor;
import com.example.proyecto2fx.model.Paciente;
import com.example.proyecto2fx.model.Usuario;
import com.example.proyecto2fx.repository.RepositorioDB;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    RepositorioDB repositorioDB = new RepositorioDB();

    @FXML
    private TextField emailTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private CheckBox rememberMeCheckBox;

    @FXML
    private Button loginButton;

    @FXML
    private Hyperlink forgotPasswordLink;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void handleLoginButtonAction() {
        Usuario usuario = repositorioDB.loadUsuario(Integer.parseInt(emailTextField.getText()));

        if (usuario.auth(emailTextField.getText(), passwordField.getText())) {
            if(usuario instanceof Paciente){

            }
            else if(usuario instanceof Doctor){

            }
            else if(usuario instanceof Cuidador){

            }
        } else {
            // Error de inicio de sesión
        }
    }

    @FXML
    private void handleForgotPasswordLinkAction() {

    }

    @FXML
    private void handleRememberMeCheckBoxAction() {

    }
}