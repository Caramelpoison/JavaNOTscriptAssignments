public class TvShow {
    public      String      name;
    public      int         numEp;
    public      String      genre;

    public TvShow(String name, int numEp, String genre){
        this.name       =       name;
        this.numEp      =       numEp;
        this.genre      =       genre;
    }

    public TvShow(String name, int numEp) {
        this.name = name;
        this.numEp = numEp;
    }
    public TvShow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumEp() {
        return numEp;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + name + " with " + numEp + " of episodes. The genre is " + genre + ".";
    }
}
