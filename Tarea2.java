public class Tarea2 {
    public static void main(String[] args) {
        int numeroif = 0;
        if( numeroif>0)
        {
            System.out.println("numeroIf es positivo");
        } else if (numeroif<0) {
            System.out.println("numeroIf es negativo");
        }else if(numeroif==0){
            System.out.println("numeroIf es igual a cero");
        }else {
            System.out.println("??");
        }
        int numeroWhile =0;
        while (numeroWhile<3){
            System.out.println("NumeroWhile: " + numeroWhile);
            numeroWhile++;
        }
        do{
            System.out.println("NumeroDoWhile: " + numeroWhile);
            numeroWhile++;
        }while(numeroWhile<3);
        for(int numeroFor = 0; numeroFor<=3; numeroFor =numeroFor+1)
        {
            System.out.println("NumeroFor: "+ numeroFor);
        }
        var estacion = "VERANO";
        switch (estacion){
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTONIO":
                System.out.println("Es otonio");
                break;
            case "INVIERNO":
                System.out.println("Es INVIERNO");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
        }
    }