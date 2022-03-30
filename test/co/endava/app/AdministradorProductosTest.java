package co.endava.app;


import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {
    @Test
    void main() {

        String nombre="Agua";
        Double descuentoTest= 900.0;
        Double precioTest = 1800.0;
        Producto p5 = new Producto(105, "Agua", 1800);

        //Validacion Nombre
        assertEquals(nombre,p5.getNombre());

        //Validacion Descuento
        assertEquals(descuentoTest,p5.getDescuento());
    }


    public double getDescuento(Double precio){
        return precio * 0.50;
    }
        }


        // public void descuento() {

       // double porcentajeControl = 10;
       //Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now().plusDays(2));
       // Double descuento = p3.getDescuento();
       //Double percentProduct = descuento * 100 / p3.getPrecio();

       // assertEquals(porcentajeControl, percentProduct);
        }//