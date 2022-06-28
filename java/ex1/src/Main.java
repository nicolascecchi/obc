public class Main{
    public static void main(String[] args) {
        suma(10,20,30);
        Coche miCoche = new Coche(); 
        miCoche.addPuerta();
        miCoche.countPuertas();

    }
    //funcion
    public static int suma(int a, int b, int c){
        return a+b+c;
    }


}
//clase
class Coche{
    int puertas = 0;
    
    public void addPuerta(){
        this.puertas++;
    }
    public void countPuertas(){
        System.out.println(this.puertas);
    }
}