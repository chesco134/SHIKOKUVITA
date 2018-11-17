package IO;

/**
 *
 * @author Alumno
 */
public class LectorArchivo {

    private String nombreDeArchivo;
    private java.io.BufferedReader br;

    public LectorArchivo(String nombreDeArchivo) {
        this.nombreDeArchivo = nombreDeArchivo;
        try {
            br = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File(this.nombreDeArchivo)), "UTF-8"));
        } catch (java.io.IOException e) {
            br = null;
            System.out.println("Error al leer el archivo, razón: " + e.getMessage());
        }
    }

    public boolean isActive() {
        return br != null;
    }

    public String leerLinea() {
        try {
            return br.readLine();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public void cerrar() {
        try {
            br.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
