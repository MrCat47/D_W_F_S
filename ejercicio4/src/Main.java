public class Main {
    public static void main(String[] args) {
        int numeroIf = 1;

        if (numeroIf < 0){
            System.out.println("negativo ");
        }else if(numeroIf > 0){
            System.out.println("positivo ");
        }else{
            System.out.println(numeroIf);
        }

        var numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;

        }
        do {
            System.out.println(numeroWhile);
            numeroWhile += 1;
        }while(numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "otoño";

        switch(estacion){
            case "otoño":
                System.out.println("Es " + estacion);
                break;
            case "primavera":
                System.out.println("Es " + estacion);
                break;
            case "verano":
                System.out.println("Es " + estacion);
                break;
            case "invierno":
                System.out.println("El invierno se acerca, corre! :v");
                break;
            default:
                System.out.println("Hoy te toca baño para que se te quite lo pendejo porque el valor introducido ("+ estacion +")no es una estacion ;v");
        }
    }
}