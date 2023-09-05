public class rectangulo {
    int base;
    int altura;

    //constructor
    public rectangulo(int base,int altura){
        this.base = base;
        this.altura = altura;
    }

    //metodos
    public double calcularArea(){
        return base*altura;
    }
    public double calcularPerimetro(){
        return (2*base)+(2+altura);
    }
}