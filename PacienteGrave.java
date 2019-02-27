package Hospital;

public class PacienteGrave extends Paciente 
{
  
    private TipoGravedad gravedad; 
    private int id;
    private int numpaciente=0;

    public PacienteGrave(String nombre, TipoGravedad gravedad)
    {
        super(nombre);
        numpaciente++;
        this.id = numpaciente;
        this.gravedad=gravedad;
    }
    public String toString()
    {
        return this.getNombre() + ": " + id + ", tipo de gravedad:  " +(gravedad);
    }
   public String getGravedad(){
	   return (this.gravedad.toString());
   }
    
}
