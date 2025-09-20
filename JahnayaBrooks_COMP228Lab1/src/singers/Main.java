//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package singers;


        public class Singers {

            private int id;
            private String name;
            private String address;
            private String dateofBirth;
            private int albumsPublished;

        public Singers() {
            this.id = 0;
            this.name = "default";
            this.address = "default";
            this.dateofBirth = "default";
            this.albumsPublished = 0;
        }

        public Singers(int id, String name, String address, String dateofBirth, int albumsPublished) {
            this.id = 0;
            this.name = name;
            this.address = "default";
            this.dateofBirth = "default";
            this.albumsPublished = 0;
        }
        public void setId(int id) { this.id = id;}
            public void setName(String name) { this.name = name;}
            public void setAddress(String address) { this.address = address; }
            public void setDateofBirth(String dateofBirth) { this.dateofBirth = dateofBirth; }
            public void setAlbumsPublished(int albumsPublished) {this.albumsPublished = albumsPublished;}

            public int getId() { return id; }
            public String getName() {return name;}
            public String getAddress() {return address;}
            public String getDateofBirth() { return dateofBirth; }
            public int getAlbumsPublished() { return albumsPublished;}
        }
       public void setStats;(int Id, String name, String address, String dateofBirth, int albumsPublished){

                }