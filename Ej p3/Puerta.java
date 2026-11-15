public class Puerta {
    public boolean abierta;

    public boolean abrir(){
        this.abierta = true;
        return this.abierta;
    }

    public boolean cerrar(){
        this.abierta = false;
        return this.abierta;
    }

    public String estado(){
        if(abierta){
            return "Abierta";
        }else{
            return "Cerrada";
        }

    }

    public static void main(String[] args)throws Exception{
        Puerta p = new Puerta();

        //abierta 
        p.abrir();
        System.out.println("La puerta esta " + p.estado());

        //Cerrado
        p.cerrar();
        System.out.println("La puerta esta " + p.estado());
        
    }
}
