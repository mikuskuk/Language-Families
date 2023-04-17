class Language {

 protected String name;
 protected int numSpeakers;
 protected String regionsSpoken;
 protected String wordOrder;

 Language(String langName, int speakers, String regions, String wdOrder) {
   this.name = langName;
   this.numSpeakers = speakers;
   this.regionsSpoken = regions;
   this.wordOrder = wdOrder;
 }

 public void getInfo() {
   System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
   System.out.println("The language follows the word order: " + this.wordOrder + ".");
 }

  public static void main(String[] args) {
    Language latvian = new Language("Latvian", 2000000, "Latvia", "subject-verb-object");
    latvian.getInfo();

    Mayan chontal = new Mayan("Chontal", 36810);
    chontal.getInfo();

    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 920000000);
    mandarin.getInfo();

    SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
    burmese.getInfo();
  }
}
