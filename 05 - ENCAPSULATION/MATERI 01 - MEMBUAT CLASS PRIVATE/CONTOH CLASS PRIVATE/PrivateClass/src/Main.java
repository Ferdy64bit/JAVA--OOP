// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        private int id;
        private String name;
        private boolean expensive;
        public Main (int id, String name, boolean expensive) {

            super();
            this.id = id;
            this.name=name;
            this.expensive=expensive;
        }
        public Main() {
            super();
        }
        public boolean isExpensive () {
            return this.expensive;
        }


        public void setExpensive (boolean expensive) {
            this.expensive = expensive;
        }

        public String getName() {
            return this.name;
        }

    public void setName (String name) {
            this.name = name;
    }


    public int getId() {
        return this.id;
    }
    //Setter
    public void setId(int id){
        this.id = id;
    }



}