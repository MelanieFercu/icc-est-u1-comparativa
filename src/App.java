import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Generados g = new Generados();
        Benchmark b = new Benchmark();
        Metodos m = new Metodos();

        //List<Integer> lista = g.generate(100000);
        //System.out.println("Lista generada: " + lista);

        //Results benGenLista = b.medir(() -> g.generate(100000),"Generacion de listado", "100000");
        //System.out.println(benGenLista.toString());

        //ARREGLOS BASE
        //10000
        int[] list1= g.generate(10000);

        //50000
        int[] list2= g.generate(50000);

        //100000
        int[] list3= g.generate(100000);

        //
        int[] lista1c1 = list1.clone();
        int[] lista1c2 = list1.clone();
        int[] lista1c3 = list1.clone();
        int[] lista1c4 = list1.clone();

        int[] lista2c1 = list2.clone();
        int[] lista2c2 = list2.clone();
        int[] lista2c3 = list2.clone();
        int[] lista2c4 = list2.clone();

        int[] lista3c1 = list3.clone();
        int[] lista3c2 = list3.clone();
        int[] lista3c3 = list3.clone();
        int[] lista3c4 = list3.clone();

        List<Results> resultados = new ArrayList<>();

        //M1
        Results resultadoM1S1 = Benchmark.medir(
            () -> m.ordenarInsercion(lista1c1), "Insercion", "10.000");
        resultados.add(resultadoM1S1);

        Results resultadoM1S2 = Benchmark.medir(
            () -> m.ordenarInsercion(lista2c1), "Insercion", "50.000");
        resultados.add(resultadoM1S2);

        Results resultadoM1S3 = Benchmark.medir(
            () -> m.ordenarInsercion(lista3c1), "Insercion", "100.000");
        resultados.add(resultadoM1S3);

        //M2
        Results resultadoM2S1 = Benchmark.medir(
            () -> m.ordenarQuickSort(lista1c2), "Quicksort", "10.000");
        resultados.add(resultadoM2S1);

        Results resultadoM2S2 = Benchmark.medir(
            () -> m.ordenarQuickSort(lista2c2), "Quicksort", "50.000");
        resultados.add(resultadoM2S2);

        Results resultadoM2S3 = Benchmark.medir(
            () -> m.ordenarQuickSort(lista3c2), "Quicksort", "100.000");
        resultados.add(resultadoM2S3);

        //M3
        Results resultadoM3S1 = Benchmark.medir(
            () -> m.ordenarArraysSort(lista1c3), "Quicksort", "10.000");
        resultados.add(resultadoM3S1);

        Results resultadoM3S2 = Benchmark.medir(
            () -> m.ordenarArraysSort(lista2c3), "Quicksort", "50.000");
        resultados.add(resultadoM3S2);
        
        Results resultadoM3S3 = Benchmark.medir(
            () -> m.ordenarArraysSort(lista3c3), "Quicksort", "100.000");
        resultados.add(resultadoM3S3);

        // M4: Arrays.sort con Comparator
        Results resultaM4S1 = Benchmark.medir(
            () -> m.ordenarComparatorLambda(lista1c4), "Comparator", "10.000");
        resultados.add(resultaM4S1);

        Results resultaM4S2 = Benchmark.medir(
            () -> m.ordenarComparatorLambda(lista2c4), "Comparator", "500000");
        resultados.add(resultaM4S2);

        Results resultaM4S3 = Benchmark.medir(
            () -> m.ordenarComparatorLambda(lista3c4), "Comparator", "100.000");
        resultados.add(resultaM4S3);

        for (Results results : resultados) {
            System.out.println(results);
        }

    }
        
}
        //PARA EL METODO
        


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
        
    

