package web;

public class DTO {

    public DTO() {
    }

    public DTO(String nombre, int id) {
        this.nombre = nombre;
        this.id =id;
    }

    public int getId() {
        return id;
    }

    public DTO(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String nombre;
    private int id;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "  Nombre: " + this.nombre +" Id: " + this.id ;
                
               
    }

}
