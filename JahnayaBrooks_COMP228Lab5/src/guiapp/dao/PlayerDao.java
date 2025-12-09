package guiapp.dao;

import guiapp.model.Player;

import guiapp.util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PlayerDao {



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

    public static void insertPlayer(int playerId, String firstName, String lastName) {

        String sql = """
              INSERT INTO player
              (player_id, first_name, last_name, address, postal_code, province, phone_number)
              VALUES (?,?,?,?,?,?,?)
              """;
    }
}
