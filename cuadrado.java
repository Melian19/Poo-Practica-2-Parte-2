public class cuadrado {
    int lado;

    //constructor
    public cuadrado(int lado){
        this.lado = lado;
    }

    //metodos
    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return 4*lado;
    }
}