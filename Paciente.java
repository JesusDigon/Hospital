package Hospital;

public class Paciente implements Comparable <Paciente>
{
    private static int numpaciente =0;
    private int id;
    private String nombre;

    public Paciente(String nombre)
    {
        this.nombre = nombre;
        numpaciente++;
        this.id = numpaciente;
    }
    public int getId(){
    	return id;
    }
    public String getNombre(){
    	return nombre;
    }
    
    public String toString(){
        return id +":"+nombre;
    }    
    
    public String getGravedad(){
    	return null;
    }
    
    public int compareTo (Paciente p){
    	return this.nombre.compareTo(p.nombre);
    }
    

}

