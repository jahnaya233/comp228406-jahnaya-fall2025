package guiapp.dao;

import guiapp.model.PlayerGame;
import guiapp.util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PlayerGameDao {

    public static void insertPlayerGame(PlayerGame pg) throws Exception {

        String sql = """
                INSERT INTO PlayerGame
                (player_game_id, player_id, game_id, playing_date, score)
                VALUES (?, ?, ?, ?, ?)
                """;

        try (Connection conn = Database.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, pg.getPlayerGameId());
            ps.setInt(2, pg.getPlayerId());
            ps.setInt(3, pg.getGameId());
            ps.setDate(4, pg.getPlayingDate());
            ps.setInt(5, pg.getScore());

            ps.executeUpdate();


        }
    }

    public static void insertPlayerGame(int playerId, int gameId) {
    }
}
