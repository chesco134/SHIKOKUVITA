package IO;

public class Usuario {
    private String nombreUsuario;
    private String pass;
    
    public Usuario(String nombreUsuario, String contraseña){
        this.nombreUsuario = nombreUsuario;
        this.pass = contraseña;
    }
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public String getPass(){
        return pass;
    }
}
