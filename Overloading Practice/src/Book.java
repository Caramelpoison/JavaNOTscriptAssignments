public class Book {
    public      String      name;
    public      int         numP;
    public      int         pubY;

    public Book(String name, int numP, int pubY){
            this.name       =       name;
            this.numP      =       numP;
            this.pubY      =       pubY;
        }
    public Book(String name, int numP) {
        this.name = name;
        this.numP = numP;
    }
    public Book(String name){
        this.name       =       name;
    }


        public String getName() {
            return name;
        }

        public int getNumP() {
            return numP;
        }

        public int getPubY() {
            return pubY;
        }



        @Override
        public String toString() {
            return name + ", " + numP + " pages, " + pubY + ".";
        }

}


