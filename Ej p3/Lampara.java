public class Lampara {

    //Se le asigna un valor por defecto al atributo
    boolean encendida;

    public void encender(){
        this.encendida = true;

    }

    public void apagar(){
        this.encendida = false;
    }

    public String Estad(){
        if(encendida){
            return "Encendida";

        }else {
            return "Apagada";
        }
    }

    public static void main(String[] args)throws Exception {
        Lampara lamp = new Lampara();
        //Lampara apagada
        System.out.println(lamp.Estad());

        //Lampara encendida
        lamp.encender();
        System.out.println(lamp.Estad());
    }
}