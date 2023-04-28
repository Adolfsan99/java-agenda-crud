public class Agenda {

    private Contacto[]contactos;

    public Agenda(){
        this.contactos = new Contacto[10];
    }

    public Agenda(int tamaño) {
        this.contactos = new Contacto[tamaño];
    }

    public void add(Contacto c) {

        if (existContacto(c)) {
            System.out.println("El contacto ya existe, ingresa otro");
        } else if(agendaLlena()) {
            System.out.println("Tu agenda esta llena no puedes ingresar mas contactos");
        } else {

            boolean encontrao = false;

            for (int i = 0; i < contactos.length && encontrao==false; i++) {

            if(contactos[i]==null){
                contactos[i]=c;
                encontrao = true;
            }
            }

            if (encontrao) {
                System.out.println("El contacto se ha añadido");
            } else {
                System.out.println("No se pudo añadir el contacto");
            }
        }
    }

    public boolean existContacto(Contacto c){

        for(int i=0; i<contactos.length; i++){
            if (contactos[i]!=null && c.equals(contactos[i])){
            return true;
            }
        }

    return false;
    }

    public void listar() {
        if(espaciosLibres() == contactos.length) {
            System.out.println("no hay datos para mostrar");
        } else {

    for (int i=0; i<contactos.length; i++){
        if(contactos[i]!=null){
            System.out.println(contactos[i]);
            }
        }
    }

}

public void buscar(String nomb){
        boolean encontrao=false;
        for(int i=0; i<contactos.length && !encontrao; i++){
            if(contactos[i]!=null && contactos[i].getNomb().trim().equalsIgnoreCase(nomb.trim())){
                System.out.println("su telefono es: "+contactos[i].getTelf());
                encontrao=true;
            }
        } if (!encontrao) {
        System.out.println("Contacto no encontrado");
    }
}

public boolean agendaLlena(){
        for(int i=0; i<contactos.length;i++){
            if(contactos[i]==null){
                return false;
            }
        }
        return true;
}

    public void eliminar (Contacto c) {

        boolean encontrao = false;

        for (int i=0; i<contactos.length && !encontrao; i++)

            if (contactos[i]!=null && contactos[i].equal(c)) {

                contactos[i]=null;
                encontrao=true;

            }

        if (encontrao) {
            System.out.println("Eliminado contacto correctamente");
        } else {
            System.out.println("Contacto no encontrado para eliminar");
        }

    }




    public int espaciosLibres() {
        int espacios = 0;

        for (int i=0; i<contactos.length;i++){
            if(contactos[i]==null) {
                espacios++;
            }
        }
    return espacios;
    }











}
