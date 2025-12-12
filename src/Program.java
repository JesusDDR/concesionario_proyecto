import controlador.ControladorConcesionario;
import vista.VistaConcesionario;

public class Program {





        public static void main(String[] args) {
            VistaConcesionario vista = new VistaConcesionario();
            ControladorConcesionario controlador = new ControladorConcesionario(vista);

            controlador.cargarDatosInicial();
            controlador.run();

    }
}
