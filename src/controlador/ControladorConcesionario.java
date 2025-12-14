package controlador;

import modelo.ClienteDTO;
import modelo.CocheDTO;
import modelo.Tmenu;
import modelo.VentaDTO;
import vista.VistaConcesionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ControladorConcesionario {


    // Memoria

    private List<CocheDTO> coches;
    private List<ClienteDTO> clientes;
    private List<VentaDTO> ventas;
    private VistaConcesionario vista;

    //Constructor de la Vista

    public ControladorConcesionario(VistaConcesionario vista) {
        this.vista = vista;
        this.coches = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();

    }

    // Funciones...........................................................................................................

    public void cargarDatosInicial() {
        coches.addAll(cochesDePrueba());
        clientes.addAll(clientesPrueba());
        ventas.addAll(listaDeVentaDePruebas());


    }
    public List<CocheDTO> cochesDePrueba() {

        List<CocheDTO> listaCoche = new ArrayList<>();
        listaCoche.add(new CocheDTO("Audi", "A4Avant", "5945FPM", 20000, 2009, 65245));
        listaCoche.add(new CocheDTO("Audi", "A4", "8569DMR", 19000, 2005, 165245));
        listaCoche.add(new CocheDTO("Audi", "A3Sporback", "5665GPM", 17000, 2009, 85245));
        listaCoche.add(new CocheDTO("Audi", "A6Avant", "5999HPM", 25000, 2015, 76245));
        listaCoche.add(new CocheDTO("Audi", "A5", "4585FFM", 22000, 2016, 105245));
        listaCoche.add(new CocheDTO("Audi", "S4Avant", "5945HPM", 30000, 2015, 55245));
        listaCoche.add(new CocheDTO("Audi", "RS4Avant", "7355FPM", 40000, 2020, 45245));
        listaCoche.add(new CocheDTO("Porsche", "GT911", "0045GHM", 50000, 2015, 30045));
        listaCoche.add(new CocheDTO("Porsche", "Caiman", "5945HKM", 40000, 2021, 25896));
        listaCoche.add(new CocheDTO("Porsche", "Panamera", "5986HHK", 50000, 2019, 23045));
        listaCoche.add(new CocheDTO("BMW", "330i", "5995HTM", 26000, 2019, 36955));
        listaCoche.add(new CocheDTO("BMW", "120", "7895FFM", 14000, 2009, 256845));
        listaCoche.add(new CocheDTO("BMW", "M5", "8956HKP", 35000, 2015, 77245));
        listaCoche.add(new CocheDTO("BMW", "M3", "3694GHP", 28000, 2019, 56982));
        listaCoche.add(new CocheDTO("BMW", "X5", "1569HGL", 27000, 2014, 165245));
        listaCoche.add(new CocheDTO("MercedesBend", "SL500", "6239FPL", 31000, 2019, 69452));
        listaCoche.add(new CocheDTO("MercedesBend", "ClassB", "3597HPL", 19000, 2019, 89552));
        listaCoche.add(new CocheDTO("MercedesBend", "ClassA", "1578JKP", 15000, 2019, 105452));
        listaCoche.add(new CocheDTO("MercedesBend", "E300", "4985HJK", 29000, 2021, 36852));
        listaCoche.add(new CocheDTO("MercedesBend", "SL600", "3981HHJ", 60000, 2022, 33452));

        return listaCoche;
    }
public List<ClienteDTO> clientesPrueba() {


        List<ClienteDTO> listaCliente = new ArrayList<>();
        listaCliente.add(new ClienteDTO("Manuel", "36598635N", "666332589"));
        listaCliente.add(new ClienteDTO("Rosa", "65398745P", "651989658"));
        listaCliente.add(new ClienteDTO("Enrique", "65948793Y", "663611484"));
        listaCliente.add(new ClienteDTO("Paco", "65912457T", "659487932"));
        listaCliente.add(new ClienteDTO("Lucia", "65635457T", "635354356"));
        listaCliente.add(new ClienteDTO("Jesus", "36912457J", "633912457"));
        listaCliente.add(new ClienteDTO("Maria", "35912457W", "669359542"));


    return listaCliente;
}

    private List<VentaDTO> listaDeVentaDePruebas() {
        List<VentaDTO> listaVenta = new ArrayList<>();

        listaVenta.add(new VentaDTO(clientes.get(3), coches.get(2), LocalDate.of(2015,10,9), 40000));
        coches.get(2).setDisponible(false);
        listaVenta.add(new VentaDTO(clientes.get(0), coches.get(0), LocalDate.of(2019,10,15), 15000));
        coches.get(0).setDisponible(false);
        listaVenta.add(new VentaDTO(clientes.get(1), coches.get(5), LocalDate.of(2017,10,25), 28000));
        coches.get(5).setDisponible(false);
        listaVenta.add(new VentaDTO(clientes.get(5), coches.get(3), LocalDate.of(2009,10,3), 60000));
        coches.get(3).setDisponible(false);
        listaVenta.add(new VentaDTO(clientes.get(4), coches.get(1), LocalDate.of(2011,10,8), 50000));
        coches.get(1).setDisponible(false);
        listaVenta.add(new VentaDTO(clientes.get(2), coches.get(4), LocalDate.of(2014,10,27), 27000));
        coches.get(4).setDisponible(false);

        return listaVenta;
    }


    public void run() {
    while(true) {
        Tmenu op = vista.Showmenu();
        switch (op){

            case ANADIR_COCHE:{
                coches.add(anhadirCoche());
                break;
            }
            case MOSTRAR_COCHE:{
                vista.mostrarCoche(guardarCochesDisponibles(coches));
                break;
            }
            case BUSCAR_COCHE_MARCA:{
                vista.mostrarCoche(buscarPorMarca(guardarCochesDisponibles(coches)));
                break;
            }
            case BUSCAR_RANGO_PRECIO: {
                vista.mostrarCoche(ramgoPrecio(coches));
                break;
            }
            case BUSCAR_COCHE_ANHO: {
                vista.mensaje("coche anho");
                break;
            }
            case REGIATRAR_UN_NUEVO_CLIENTE: {
                vista.mensaje("Mostra nuevo cliente");
                break;
            }
            case REGISTRAR_UNA_VENTA: {
                vista.mensaje("Registro venta");
                break;
            }
            case LISTAR_UNA_VENTA: {
                vista.mensaje("Venta coches");
                break;
            }

        }
    }
    }

    private List<CocheDTO> ramgoPrecio(List<CocheDTO> coches) {
        List<CocheDTO> listaCoche = new ArrayList<>();
        vista.mensaje("introduceme el precio minimo");
        double precioMinimo = Double.parseDouble(vista.entrarDatos());
        vista.mensaje("introduceme el precio maximo");
        double precioMaximo = Double.parseDouble(vista.entrarDatos());
        for (CocheDTO coche : coches) {
            if(coche.getPrecio() >= precioMinimo && coche.getPrecio() <= precioMaximo){
                listaCoche.add(coche);
            }
        }
        return listaCoche;
    }


    private CocheDTO anhadirCoche() {
        CocheDTO cocheNuevo;
        vista.mensaje("Indica la marca del coche.");
        String marca = vista.entrarDatos();

        String modelo = vista.entrarDatos();

        String matricula = vista.entrarDatos().toUpperCase();
        double precio = Double.parseDouble(vista.entrarDatos());
        int ano = Integer.parseInt(vista.entrarDatos());
        int km = Integer.parseInt(vista.entrarDatos());

        cocheNuevo= new CocheDTO(marca, modelo, matricula, precio, ano, km);
        return cocheNuevo;
    }

    public List<CocheDTO> guardarCochesVendidos(List<CocheDTO> coches) {
        List<CocheDTO> cochesVendidos = new ArrayList<>();
        for(CocheDTO coche : coches) {
            if(!coche.isDisponible()){
                cochesVendidos.add(coche);
            }
        }
        return cochesVendidos;
    }
    public List<CocheDTO> guardarCochesDisponibles(List<CocheDTO> coches) {
        List<CocheDTO> cochesDisponibles = new ArrayList<>();
        for(CocheDTO coche : coches) {
            if(coche.isDisponible()){
                cochesDisponibles.add(coche);
            }
        }
        return cochesDisponibles;
    }

    private List<CocheDTO> buscarPorMarca(List<CocheDTO> coches) {
        List<CocheDTO> cochesPorMarca = new ArrayList<>();
        vista.mensaje("Introduce la marca del coche.");
        String marca = vista.entrarDatos();
        for(CocheDTO coche : coches) {
            if(coche.getMarca().equalsIgnoreCase(marca)){
                cochesPorMarca.add(coche);
            }
        }

        return cochesPorMarca;
    }









}

