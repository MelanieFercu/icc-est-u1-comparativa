import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Generados g = new Generados();
        Benchmark b = new Benchmark();

        List<Integer> lista = g.generate(100000);
        System.out.println("Lista generada: " + lista);

        Results benGenLista = b.medir(() -> g.generate(100000),"Generacion de listado", "100000");
        System.out.println(benGenLista.toString());

        

        //long nanoTime = System.nanoTime();
        //long currentTimeMillis = System.currentTimeMillis();

        //System.out.println("Tiempo en nanosegundos: " + nanoTime);
        //System.out.println("Tiempo en milisegundos: " + currentTimeMillis);

        //Runnable x = () -> {
        //    System.out.println("Ejecutando tarea 1");
        //    System.out.println("Ejecutando tarea 2");

        //};

        //List<Integer> lista = new ArrayList<>();
        //MetodosOrd mO = new MetodosOrd();
        // mO.burbuja(lista);
        //Runnable burbujaOrden = () -> mO.burbuja(lista);



        //System.out.println("Ejecucion de la funcion Runnable");
        //x.run();
        
    }
}
