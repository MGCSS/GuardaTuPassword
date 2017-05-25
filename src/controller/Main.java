package controller;

import view.MainWindow;

/**
 *
 * @author Javier Augusto Zambrano Macías
 * @author Samuel López Domínguez
 */
public class Main 
{
    public static void main(String[] args) 
    {
        // Pantalla principal (Inicio de sesión)
        // Main screen (Login)
        MainWindow mainWindow;
        
        mainWindow = new MainWindow();
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }    
}
