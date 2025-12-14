package modelo;

public enum Tmenu {


    //Uno de los posibles usos de los enumerados es listar las posibles opciones de un menu


    ANADIR_COCHE("Añadir coche"),
    MOSTRAR_COCHE("Coches disponibles"),
    BUSCAR_COCHE_MARCA("Buscar Coche por Marca"),
    BUSCAR_RANGO_PRECIO("Buscar Coche a por rango de precios"),
    BUSCAR_COCHE_ANHO("Buscar Coche a partir de un año"),
    REGIATRAR_UN_NUEVO_CLIENTE("Registrar nuevo cliente"),
    MOSTRAR_CLIENTE("Mostrar la lista de Clientes"),
    REGISTRAR_UNA_VENTA("Registro la venta de un coche"),
    LISTAR_UNA_VENTA("Listar las ventas realizadas"),
    SALIR("Salir");
    //Todos los atributos de un enumerado han de estar en el constructor.
    private String opText;

    Tmenu(String opText) {
        this.opText = opText;
    }

    public String getOpText() {
        return opText;
    }


}
