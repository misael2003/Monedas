package inicio;

import java.util.Scanner;
import redes.Request;
import convertir.Monedas;
import com.google.gson.Gson;

public class Inicio {

    private static int desicion = 0;
    private static Scanner entrada = new Scanner(System.in);
    private static boolean control = true;

    public static void main(String[] args) {
        Request API = new Request();
        Gson gson = new Gson();
        String consulta = "";
        String tipo = "";

        while (control){
            menu();
            switch (desicion){
                case 1:
                    consulta = "https://v6.exchangerate-api.com/v6/de3a65e9388eee08b2c3d640/pair/MXN/USD";
                    tipo = "dolares americanos es de: ";
                    try{
                        String respuesta = API.peticion(consulta);
                        Monedas monedas = gson.fromJson(respuesta,Monedas.class);
                        monedas.convertirMoneda(tipo);

                    }catch (Exception e){
                        System.out.println("Ocurrio un error");
                    }
                    break;

                case 2:
                    consulta = "https://v6.exchangerate-api.com/v6/de3a65e9388eee08b2c3d640/pair/USD/MXN";
                    tipo = "pesos mexicanos es de: ";
                    try{
                        String respuesta = API.peticion(consulta);
                        Monedas monedas = gson.fromJson(respuesta,Monedas.class);
                        monedas.convertirMoneda(tipo);

                    }catch (Exception e){
                        System.out.println("Ocurrio un error");
                    }
                    break;

                case 3:
                    consulta = "https://v6.exchangerate-api.com/v6/de3a65e9388eee08b2c3d640/pair/MXN/EUR";
                    tipo = "euros es de: ";
                    try{
                        String respuesta = API.peticion(consulta);
                        Monedas monedas = gson.fromJson(respuesta,Monedas.class);
                        monedas.convertirMoneda(tipo);

                    }catch (Exception e){
                        System.out.println("Ocurrio un error");
                    }
                    break;

                case 4:
                    consulta = "https://v6.exchangerate-api.com/v6/de3a65e9388eee08b2c3d640/pair/EUR/MXN";
                    tipo = "pesos mexicanos es de: ";
                    try{
                        String respuesta = API.peticion(consulta);
                        Monedas monedas = gson.fromJson(respuesta,Monedas.class);
                        monedas.convertirMoneda(tipo);

                    }catch (Exception e){
                        System.out.println("Ocurrio un error");
                    }
                    break;

                case 5:
                    consulta = "https://v6.exchangerate-api.com/v6/de3a65e9388eee08b2c3d640/pair/MXN/KRW";
                    tipo = "wones es de: ";
                    try{
                        String respuesta = API.peticion(consulta);
                        Monedas monedas = gson.fromJson(respuesta,Monedas.class);
                        monedas.convertirMoneda(tipo);

                    }catch (Exception e){
                        System.out.println("Ocurrio un error");
                    }
                    break;

                case 6:
                    consulta = "https://v6.exchangerate-api.com/v6/de3a65e9388eee08b2c3d640/pair/KRW/MXN";
                    tipo = "pesos mexicanos es de: ";
                    try{
                        String respuesta = API.peticion(consulta);
                        Monedas monedas = gson.fromJson(respuesta,Monedas.class);
                        monedas.convertirMoneda(tipo);

                    }catch (Exception e){
                        System.out.println("Ocurrio un error");
                    }
                    break;

                case 7:
                    control = false;
                    break;
            }
        }
    }

    public static void menu(){
        String menu = """
                -------------------------------------
                1. Peso mexicano -->> Dolar americano
                2. Dolar americano -->> Peso mexicano
                3. Peso mexicano -->> Euro  
                4. Euro -->> Peso mexicano
                5. Peso mexicano -->> Won surcoreano 
                6. Won surcoreano -->> Peso mexicano
                7. Salir: 
                """;
        System.out.println(menu);
        try {
            desicion = entrada.nextInt();
            if (desicion > 7 || desicion <= 0){
                System.out.println("Rango fuera de lo establicido!!");
                menu();
            }
        }catch (Exception e){
            System.out.println("Error al teclear, escriba solo números!!!");
            control = false;
        }
    }
}