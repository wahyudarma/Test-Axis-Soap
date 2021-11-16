package com.wahyu.service;

import com.wahyu.model.HighScore;
import java.util.ArrayList;
import java.util.List;

public class HighScoreService
{
    //    List HighScore
    private static List<HighScore> highScores = new ArrayList<HighScore>();

    //    Add HighScore
    public void addHighScore(HighScore score)
    {
        System.out.println("{addHighScore} Adding: [" + score.getNickName() + "," + score.getScore() + "]");
        highScores.add(score);
    }
    //    Get HighScore
    public List<HighScore> getHighScores()
    {
        System.out.println("{getHighScores}:: start");
        return highScores;
    }
    //    Get Highscore for user nickname
    public List<HighScore> getHighScoresForNickname(String nickname)
    {
        System.out.println("{getHighScoresForNickname}:: start");
        List<HighScore> userScores = new ArrayList<HighScore>();

        for (HighScore h: highScores)
        {
            if (h.getNickName().equals(nickname))
            {
                userScores.add(h);
            }
        }
        return userScores;
    }
    //    Get the size score list
    public int getHighScoresSize()
    {
        System.out.println("{getHighScoresSize}:: start");
        return highScores.size();
    }
}
