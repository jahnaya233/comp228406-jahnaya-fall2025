package guiapp.dao;

import guiapp.model.Game;
import guiapp.util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class GameDao {

    public void insertGame(Game game) throws Exception {

        String sql = """
                INSERT INTO game (game_id, game_title)
                VALUES (?,?)
                """;

        try(Connection conn = Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1,game.getGameId());
            ps.setString(2, game.getGameTitle());
            ps.executeUpdate();
        }
    }
}
