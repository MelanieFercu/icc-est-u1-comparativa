

public class Generados {
    public static int[] generate(int size){
        //List<Integer> lista = new ArrayList<>();
        //for(int i = 0; i < size; i++){
        //    lista.add((int)(Math.random() * size));
            
        //}
        //return lista;

        int[] list = new int[size];
        for( int i = 0; i < size; i++){
            list[i] = (int) (Math.random() * size);
        }
        return list;
    }
}
