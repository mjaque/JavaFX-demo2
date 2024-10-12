package migueljaque;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class Controlador {

    @FXML
    private VBox vistaCrearCliente;
    @FXML
    private VBox vistaBuscarCliente;

    @FXML
    private void irABuscarCliente() throws IOException {
        //Programa.setRoot("secondary");
        System.out.println("Ir a Buscar Cliente");
        vistaCrearCliente.setVisible(true);
        vistaBuscarCliente.setVisible(false);
    }
    
    @FXML
    private void irACrearCliente() throws IOException {
        //Programa.setRoot("secondary");
        System.out.println("Ir a Crear Cliente");
        vistaCrearCliente.setVisible(false);
        vistaBuscarCliente.setVisible(true);
    }
}
