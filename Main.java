import java.util.Scanner;

class Helado {
    String sabor;
    String tamaño;
    //revisando que haga commit

    public void caracteristicas() {
        System.out.println("Pues aquí está su helado de... " + sabor);
        System.out.println("Y se lleva... " + tamaño);
    }
}

class HeladoZapoteNegro extends Helado {
    boolean Topping;

    @Override
    public void caracteristicas() {
        super.caracteristicas();
        if (!Topping) {
            System.out.println("Que bueno porque ya no tenía chispas...");
        } else {
            System.out.println("Chispas! se me acabaron las chispas...");
        }
    }

    public void ingresaLaOrden() {
        Scanner scan = new Scanner(System.in);
        
     
        System.out.print("Va a querer de a medio litro o de a litro? ");
        tamaño = scan.nextLine();

        
        System.out.println("Va a querer chispas de chocolate?");
        while (true){
        String respuesta = scan.nextLine();

          if (respuesta.equalsIgnoreCase("si")) {
             Topping = true;
           break;
        } else if (respuesta.equalsIgnoreCase("no")) {
            Topping = false;
            break;
         } else{
            System.out.println("que si va a querer chispas?");
        }

    }
        sabor = "¡Hijoles sólo me queda zapote negro!";

        System.out.println("Ojalá y le guste!");
        
        
        scan.close();
    }
}

public class Main {
    public static void main(String[] args) {
        HeladoZapoteNegro heladoFeo = new HeladoZapoteNegro();
        heladoFeo.ingresaLaOrden();
        heladoFeo.caracteristicas();
    }
}
