package guiapp;

import guiapp.dao.PlayerDao;
import guiapp.dao.PlayerGameDao;
import guiapp.model.Player;
import guiapp.util.Database;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main extends Application {
    @Override


    public void start(Stage stage) {


        TextField txtGameID = new TextField();
        txtGameID.setPromptText("Game ID");

        TextField txtGameTitle = new TextField();
        txtGameTitle.setPromptText("Game Title");

VBox gameBox = new VBox(10,
        new Label("Game"),
        txtGameID,
        txtGameTitle
);



        TextField txtPlayerGameId = new TextField();
        txtPlayerGameId.setPromptText("Player Game ID");

        TextField  txtGameIdenfication = new TextField();
        txtGameIdenfication.setPromptText("Game ID");

        TextField txtPlayerid = new TextField();
        txtPlayerid.setPromptText("Player id");

        TextField txtPlayingDate = new TextField();
        txtPlayingDate.setPromptText("Playing Date");

        TextField txtScore = new TextField();
        txtScore.setPromptText("Score");

        Button btnSave = new Button("Save");
        Label lblStatus = new Label();

        HBox buttonBox = new HBox(btnSave);
        buttonBox.setAlignment(Pos.CENTER);


        VBox linkBox = new VBox(10,
                new Label("Player and Game"),
                txtPlayerGameId,
                txtGameIdenfication,
                txtPlayerid,
                txtPlayingDate,
                txtScore,
                buttonBox,
                lblStatus

        );


        TextField txtPlayerID = new TextField();
        txtPlayerID.setPromptText("Player ID");

        TextField txtFirstName = new TextField();
        txtFirstName.setPromptText("First Name");

        TextField txtLastName = new TextField();
        txtLastName.setPromptText("Last Name");


        TextField txtaddress= new TextField();
        txtaddress.setPromptText("Address");


        TextField txtPostalCode = new TextField();
        txtPostalCode.setPromptText("Postal Code");


        TextField txtProvince = new TextField();
        txtProvince.setPromptText("Province");


        TextField txtPhoneNumber = new TextField();
        txtPhoneNumber.setPromptText("Phone Number");

VBox playerBox = new VBox(10,
        new Label("Player"),
        txtPlayerID,
        txtFirstName,
        txtLastName,
        txtaddress,
        txtPostalCode,
        txtProvince,
        txtPhoneNumber

);













        HBox root = new HBox(30,
                boxed(gameBox),
                boxed(linkBox),
                boxed(playerBox)
        );
        root.setPadding(new Insets(15));




        stage.setScene(new Scene(root, 900, 300));
        stage.setTitle("Application");
        stage.show();
    }
    public static void insertPlayer(Player player) throws Exception {

        String sql = """
              INSERT INTO player
              (player_id, first_name, last_name, address, postal_code, province, phone_number)
              VALUES (?,?,?,?,?,?,?)
              """;

        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, player.getPlayerId());
            ps.setString(2, player.getFirstName());
            ps.setString(3, player.getLastName());
            ps.setString(4, player.getAddress());
            ps.setString(5, player.getPostalCode());
            ps.setString(6, player.getProvince());
            ps.setString(7, player.getPhoneNumber());

            ps.executeUpdate();

        }


        }

        public static void main(String[] args) {
            launch(args);
        }
    private VBox boxed(VBox box) {
        box.setPadding(new Insets(10));
        box.setStyle("""
                    -fx-border-color: #999;
                    -fx-border-width: 1;
                    -fx-border-radius: 6;
                    -fx-background-color: #e0f7fa;
                    """);


        return box;


    }}

