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
        String verb = "Jeg er heldigvis gammel nok og jeg elsker at være til eksamen";

        return verb;

    }

    public String gammelNok() {
        this.alder = alder;
        if (alder >= 16) {
            return "Ja du rigtig nok prøvet at være til eksamen før";
        } else {
            return "Du er vist ikke så gammel at du har været til eksamen! MEN GLÆD DIG;)";

        }
    }
}
