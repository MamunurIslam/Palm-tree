package LanguageFamily;

class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;

    protected String wordOrder;

    Language (String name, int speakers, String regions, String wdOrder) {
        this.name = name;
        this.numSpeakers = speakers;
        this.regionsSpoken = wdOrder;
        this.wordOrder = wdOrder;
    }

    public void getInfo() {
        System.out.println( this.name + "is spoken by " + this.numSpeakers + "people mainly in" + this.regionsSpoken +".");
        System.out.println("The language follows the word order: " + this.wordOrder);
    }


    public static void main(String[] args) {

        Language spanish = new Language("Spanish", 5550000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        spanish.getInfo();

        Mayan kiche = new Mayan("Ki'che'", 2330000);
        kiche.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();


    }
}
