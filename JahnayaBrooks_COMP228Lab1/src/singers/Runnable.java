package singers;

public class Runnable {
    public static void man(String[]args) {
        Singers artist = new Singers();

        artist.Id(409);
        artist.setName("Ariana Grande");
        artist.setAddress("103 Avenue");
        artist.setDateofBirth("1993 - 03 - 01");
        artist.setAlbumsPublished(10);

        System.out.println(Singer,stats(artist));

        System.out.println("The id is: " + artist.getId());
        System.out.println("The name is: "+ artist.getName());
        System.out.println("The address is: " + artist.getAddress());
        System.out.println("The date of birth is: " + artist.getDateofBirth());
        System.out.println("The number of albums is: "+ artist.AlbumsPublished());
    }
}
