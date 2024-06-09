// Hacemos la conversion de la moneda con su valor respectvio

package convertir;
import com.google.gson.annotations.SerializedName;
import java.util.Scanner;

public class Monedas {

    @SerializedName("conversion_rate")
    private double valorMoneda = 0.0;

    public void convertirMoneda(String tipo){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad a convertir: ");

        double cantidad = entrada.nextDouble();
        double conversion = cantidad * valorMoneda;

        System.out.println("Su equivalencia a " + tipo + conversion);
    }
}
