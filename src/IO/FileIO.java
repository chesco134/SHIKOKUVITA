package IO;


import Categorias.Categorias;
import Categorias.PeriodoDeTiempo;
import Desechos.DesechosDia;
import Usuarios.ListaUsuarios;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 *
 * @author tetra
 */
public class FileIO {
	public void copiarArchivo(File original, File copia) throws IOException {
		Files.copy(original.toPath(), copia.toPath());
	}
	
	public void serializarUsr(ArrayList<ListaUsuarios> listaUsuario, File archivo){
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(archivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(listaUsuario);
			oos.close();
			fos.close();	
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void serializarCat(ArrayList<Categorias> obj, File archivo){
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(archivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();	
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void serializarDesDia(ArrayList<DesechosDia> obj, File archivo){
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(archivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();	
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void serializarPerTiempo(ArrayList<PeriodoDeTiempo> obj, File archivo){
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(archivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();	
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public ArrayList<ListaUsuarios> deserializarUsr(File archivo){
		ArrayList<ListaUsuarios> al;
		try {
			FileInputStream fis = new FileInputStream(archivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			al = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return null;
		}
		return al;
	}

	
	public ArrayList<Categorias> deserializarCat(File archivo){
		ArrayList<Categorias> al;
		try {
			FileInputStream fis = new FileInputStream(archivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			al = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return null;
		}
		return al;
	}

	public ArrayList<DesechosDia> deserializarDesDia(File archivo){
		ArrayList<DesechosDia> al;
		try {
			FileInputStream fis = new FileInputStream(archivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			al = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return null;
		}
		return al;
	}

	public ArrayList<PeriodoDeTiempo> deserializarPerTiempo(File archivo){
		ArrayList<PeriodoDeTiempo> al;
		try {
			FileInputStream fis = new FileInputStream(archivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			al = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return null;
		}
		return al;
	}
}
