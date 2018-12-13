public class MinAlder {


    /**
     * @auther Andreas:
     *Denne klasse indeholder en metoder der viser, om en person muligvis har været til eksamen.
     */
    private int alder = 0;
    private String navn = "";


    public MinAlder(int alder, String navn) {
        this.alder = alder;
        this.navn = navn;

    }

    public String toString() {
        String verb = "Mit navn er: " + navn + ". Jeg er: " + alder + " år og jeg elsker at være til eksamen";

        return verb;

    }

    public static void gammelNok(MinAlder person) {
        if (person.alder >= 16) {
            System.out.println("Ja du rigtig nok prøvet at være til eksamen før");
        } else {
            System.out.println("Du er vist ikke så gammel at du har været til eksamen! MEN GLÆD DIG;)");

        }
    }
}
