public class circulo {
    int radio;

    //constructor
    public circulo(int radio){
        this.radio = radio;
    }

    //metodos
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
}