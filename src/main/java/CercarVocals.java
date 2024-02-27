public class CercarVocals {

    // MODIFICACIÖ PROVA GIT
    public static void main(String[] arg){
        char[] resultat = cercarVocals("HolA com va a la casa de");
        imprimir(resultat);
    }

    /**
     * Funció que retorna un array de caracters amb les vocals d'un string
     * @param entrada és un String
     * @return un char[] amb les vocals de entrada
     */
    public static char[] cercarVocals(String entrada) {
        int num_vocals = numVocals(entrada);

        char[] sortida = new char[num_vocals];

        char c;
        int i , j =0;
        for(i = 0; i < entrada.length(); i ++){
            c = entrada.charAt(i);
            if(esVocal(c)){
                sortida[j]=entrada.charAt(i);
                j = j + 1;
            }
        }
        return sortida;
    }

    /**
     * Funció que ens diu si un caracter és una vocal
     * @param c és un caracter
     * @return cert: és vocal , fals : no és vocal
     */
    public static boolean esVocal(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Funció que retorna el número de vocals d'un String
     * @param entrada , String
     * @return int : número de vocals de l'String
     */
    public static int numVocals(String entrada){
        int comptar = 0;
        for(int i = 0; i < entrada.length() ; i ++) {
            if(esVocal(entrada.charAt(i))) comptar = comptar + 1;
        }
        return comptar;
    }

    /**
     * Acció que imprimeix un array de caràcters
     * @param var : array de caracters
     */
    public static void imprimir(char[] var){
        System.out.print( "[ ");
        for (int i = 0; i < var.length; i++) {
            System.out.print(var[i] + " , ");
        }
        System.out.print( " ]");
    }

}
