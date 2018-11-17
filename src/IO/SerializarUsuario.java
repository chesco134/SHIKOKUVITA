package IO;


import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Alumno
 */
public class SerializarUsuario {
    public static String serializaUsuario(Usuario usuario){
		try{
			JSONObject json = new JSONObject();
			json.put("nombre_Usuario", usuario.getNombreUsuario());
			json.put("contraseña_usuario", usuario.getPass());
			return json.toString();
		}catch(JSONException e){
			e.printStackTrace();
			return null;
		}
	}
	
	public static Usuario deserializaUsuario(String jsonString){
		try{
			String nombreUsuario;
			String contraseña;
			JSONObject json = new JSONObject(jsonString);
			nombreUsuario = json.getString("nombre_Usuario");
			contraseña = json.getString("contraseña_usuario");
			Usuario usuario = new Usuario(nombreUsuario, contraseña);
			return usuario;
		}catch(JSONException e){
//			e.printStackTrace();
			return null;
		}
	}
}
