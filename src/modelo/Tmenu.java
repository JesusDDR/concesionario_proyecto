package modelo;

public enum Tmenu {


    //Uno de los posibles usos de los enumerados es listar las posibles opciones de un menu


    ANADIR_COCHE("Añadir coche"),
    MOSTRAR_COCHE("Mostrar los coches disponibles"),
    BUSCAR_COCHE_MARCA("Buscar coche"),
    BUSCAR_RANGO_PRECIO("Buscar coche"),
    BUSCAR_COCHE_ANHO("Buscar coche"),
    REGIATRAR_UN_NUEVO_CLIENTE("Mostar nuevo cliente"),
    REGISTRAR_UNA_VENTA("Mostrar coche involucrado"),
    LISTAR_UNA_VENTA("Mostrar coche involucrado"),
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
