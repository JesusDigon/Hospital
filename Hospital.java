package Hospital;
import java.util.Arrays;


public class Hospital 
{ 
    private Paciente tpacientes[];
    private int contadorpacientes;

    public Hospital(int numpacientes)
    {
        tpacientes = new Paciente[numpacientes];
        contadorpacientes = 0;
    }

    // Ingreso de un paciente al hospital
    public boolean ingreso(Paciente p)
    {
    	boolean ingreso= false;
    	for (int i=0;i<tpacientes.length;i++){
    		if (tpacientes[i] == null){
    			tpacientes[i]= p;
    			ingreso= true;
    			break;
    		}
    	}return ingreso;
        
    }
    // Alta del paciente - se borra de la tabla
    public boolean alta ( int id_paciente){
     
    	for (int i=0;i<tpacientes.length;i++){
    		if(tpacientes[i].getId()==id_paciente){
    			tpacientes[i]= null;
    		}
    	}
      return true;   
    }    
    
    // Devuelve el paciente con el identidador indicado o null si no existe
    public Paciente buscar(int id){
    	 Paciente p =  null;
    	for (int i=0;i<tpacientes.length;i++){
    		if(tpacientes[i].getId() == id){
    			p=tpacientes[i];
    			break;
    		}
    	
    	}return p;
    }
    
    // Imprime por consola la lista ORDENADO por NOMBRE de pacientes ***

    public void listapacientes (){
     
    	Arrays.sort(tpacientes);
    	for (int i=0;i<tpacientes.length;i++){
    		
    	System.out.println(tpacientes[i].toString());
    		
    	}
    	
    }    
       
    // Devuelve el mas grave o el caso de paciente con la misma gravedad el
    // que su identificador sea mas bajo.
    public Paciente pacienteMasUrgente(){
    
    	Paciente muygrave = new PacienteGrave(" ", TipoGravedad.MUY_GRAVE);
    	for (int i=0;i<tpacientes.length;i++){
    		if (tpacientes[i].getGravedad()== null){
    			
    		}else if (tpacientes[i].getGravedad().equals(muygrave.getGravedad())){
    			muygrave=tpacientes[i];
    		}
    		}return muygrave;
    	}
        
        
    }
  



