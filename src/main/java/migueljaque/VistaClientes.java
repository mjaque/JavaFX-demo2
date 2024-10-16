package migueljaque;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class VistaClientes {

    @FXML
    private VBox vistaCrearCliente;
    @FXML
    private VBox vistaBuscarCliente;

    @FXML
    private void volver() throws IOException {
        //Llamar al ControladorPrincipal para volver a la VistaInicio
    }
    
    @FXML
    private void crearCliente() throws IOException {
        //Se llama al pulsar Aceptar en modo Creación.
        //Montamos el cliente y llamamos a ControladorCliente.crear(Cliente)
    }
}
