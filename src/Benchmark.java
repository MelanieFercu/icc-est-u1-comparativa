public class Benchmark {

    public static Results medir(Runnable accion, String nombre, String sample){
        long tA = System.nanoTime();
        accion.run();
        long tF = System.nanoTime();
        
        Results results = new Results(nombre, (tF - tA), sample);   
        return results;

    }
    
}
