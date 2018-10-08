package Clases;

public class Estudiante {
    //declaracion de atributos
    private String nombre;
    private String codigo;
    private String materia;
    private Double parcial1;
    private Double parcial2;
    private Double parcial3;
    private Double promedio;



    //declaracion de propiedades
    public void setNombre(String valor){
        this.nombre = valor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCodigo(String valor){
        this.codigo = valor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setMateria(String valor) {
        this.materia = valor;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setParcial1(Double valor) {
        this.parcial1 = valor;
    }

    public Double getParcial1() {
        return this.parcial1;
    }

    public void setParcial2(Double valor) {
        this.parcial2 = valor;
    }

    public Double getParcial2() {
        return this.parcial2;
    }

    public void setParcial3(Double valor) {
        this.parcial3 = valor;
    }

    public Double getParcial3() {
        return this.parcial3;
    }

    public void setPromedio(Double valor) {
        this.promedio = valor;
    }

    public Double getPromedio() {
        return this.promedio;
    }

}
