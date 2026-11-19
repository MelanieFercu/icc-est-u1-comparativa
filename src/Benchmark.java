public class Benchmark {

    public static Results medir(Runnable accion, String nombre, String sample){
        long tA = System.nanoTime();
        accion.run();
        long tF = System.nanoTime();
        
        Results results = new Results(nombre, (tF - tA), sample);   
        return results;

    }

    public static Results medir(Runnable runnable, String string, int i, Object object, String string2, int j,
            Object object2, String string3, int k) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'medir'");
    }
    
}
