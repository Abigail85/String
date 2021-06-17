public class TestRendimiento {
    public static void main(String[]args){

        String nombre = "Pepito";
        String primerApellido = "Perez";
        String segundoApellido = "Sepulveda";

        StringBuilder sb = new StringBuilder(nombre);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++){
             sb.append(nombre).append(primerApellido).append(segundoApellido).append("\n");//500=>o ms en 1000=>1ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);

        //,toString para que genere el string completo
        // tiempo de respuesta 500=>0 ms en 1000=>1ms
        System.out.println("prueba con un StringBuilder = " + sb);
    }
}