/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame myWindow = new JFrame();

        // Creando ventana
        myWindow.setSize(500, 500);
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setLocale(null);
        myWindow.setTitle("Login");

        // USER
        JLabel userLabel = new JLabel("Usuario: ");
        JTextField userTextField = new JTextField();

        // PASSWORD
        JLabel passwordLabel = new JLabel("Contraseña: ");
        JPasswordField passwordTextField = new JPasswordField();

        // BUTTON
        JButton loginButton = new JButton("INICIAR SESIÓN");

        // IMAGEN
        ImageIcon icon = new ImageIcon("logounimex.png");
        Image image = icon.getImage();
        Image imgScaled = image.getScaledInstance(120, 120, 4);
        JLabel logounimex = new JLabel(new ImageIcon(imgScaled));
        myWindow.add(logounimex);
        logounimex.setBounds(150, 0, 200, 200);


        // USER

        myWindow.add(userLabel);
        userLabel.setBounds(120, 200, 100, 30);

        myWindow.add(userTextField);
        userTextField.setBounds(200, 200, 180, 30);

        // PASSWORD
        myWindow.add(passwordLabel);
        passwordLabel.setBounds(120, 250, 100, 30);

        myWindow.add(passwordTextField);
        passwordTextField.setBounds(200, 250, 180, 30);



        //Campo de botones - btnAceptar / btnCancelar
        myWindow.add(loginButton);
        loginButton.setBounds(170, 380, 150, 60);

        ActionListener loginListener = (ActionEvent event) -> {

            String loginInput = userTextField.getText();
            String passwordInput = passwordTextField.getText();

            if(loginInput.isEmpty() || passwordInput.isEmpty()){
                JOptionPane.showMessageDialog(null, "No te hagas el pendejo, llena los campos");
                return;
            }

            System.out.println(loginInput);
            System.out.println(passwordInput);

            if(loginInput.matches("miguelito") && passwordInput.matches("freefire")){

                JOptionPane.showMessageDialog(null, "Credenciales Correctas");

            } else {

                try {
                    try {
                        Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=xvFZjo5PgG0&ab_channel=Duran").toURI());
                    } catch (URISyntaxException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas!");
                }

            }
        };

        loginButton.addActionListener(loginListener);

    }

}