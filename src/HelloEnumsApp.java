public class HelloEnumsApp {
    public static void main(String[] args) {
        //ENTENDIENDO LAS ENUMERACIONES
        /*Demarcacion portero = Demarcacion.PORTERO;

        System.out.println(portero);

        System.out.println(portero.ordinal());

        Demarcacion[] demarcacions = Demarcacion.values();
        for (Demarcacion demarcacion : demarcacions) {
            System.out.println(demarcacion);
        }*/

        String hola = "hola"; // La h tiene un valor ASCII mayor que la A, esta cadena es mayor
        String adios = "Adios";


        Ordenacion ordenacion = obtenerOrdenCadena1("hola", "Alba");
        System.out.println(ordenacion);


    }

    private static Ordenacion obtenerOrdenCadena1(String cadena1, String cadena2){
        boolean isGreater;
        if (!cadena1.equalsIgnoreCase(cadena2)){
            isGreater = isGreaterString1ThanString2(cadena1,cadena2);
            return isGreater
                    ? Ordenacion.MAYOR
                    : Ordenacion.MENOR;
        }
        return Ordenacion.IGUAL;
    }


    private static boolean isGreaterString1ThanString2(String cadena1, String cadena2) {
        char[] carsCad1 = cadena1.toCharArray();
        int numCarsCad1 = cadena1.length();

        char[] carsCad2 = cadena2.toCharArray();
        int numCarsCad2 = cadena2.length();

        int posCurrentChar = 0;
        int numMaxChar = Math.min(numCarsCad1, numCarsCad2);

        while (posCurrentChar < numMaxChar) {
            char currentChar1 = carsCad1[posCurrentChar];
            char currentChar2 = carsCad2[posCurrentChar];
            if (currentChar1 > currentChar2) {
                return true;
            }else if (currentChar1 < currentChar2) {
                return false;
            }

            posCurrentChar++;
        }

        if (posCurrentChar == numMaxChar) {
            return numCarsCad1 > numCarsCad2;
        }

        return true;
    }

}
