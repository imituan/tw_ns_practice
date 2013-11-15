package com.thoughtworks.ns.practice;

public class TennisGameImp implements TennisGame {
    public int p1Point = 0;//change P1point to p1Point
    public int p2Point = 0;

    public String p1Res = "";//same change as the above
    public String p2Res = "";
    private String p1Name;//same change as the above
    private String p2Name;


    public TennisGameImp(String player1Name, String player2Name) {
        this.p1Name = player1Name;
        this.p2Name = player2Name;
    }

    public String calculateScore(){ //change getScore() to calculateScore
        String score = "";

        if (p1Point == p2Point && p1Point < 3)
        {
            if (p1Point ==0)
                score = "Love";
            if (p1Point ==1)
                score = "Fifteen";
            if (p1Point ==2)
                score = "Thirty";
            score += "-All";
            return score;
        }
        else if (p1Point == p2Point && p1Point >=3)
        {
            score = "Deuce";
            return  score;
        }
        else if (p1Point > 0 && p2Point ==0 && p1Point < 4)
        {
            if (p1Point ==1)
                p1Res = "Fifteen";
            if (p1Point ==2)
                p1Res  = "Thirty";
            if (p1Point ==3)
                p1Res = "Forty";

            p2Res = "Love";
            score = p1Res + "-" + p2Res;
            return  score;

        }
        else if (p2Point > 0 && p1Point ==0 && p2Point < 4)
        {
            if (p2Point ==1)
                p2Res = "Fifteen";
            if (p2Point ==2)
                p2Res = "Thirty";
            if (p2Point ==3)
                p2Res = "Forty";

            p1Res = "Love";
            score = p1Res + "-" + p2Res;
            return  score;

        }
        else if (p1Point > p2Point && p1Point < 4)
        {
            if (p1Point ==2)
                p1Res ="Thirty";
            if (p1Point ==3)
                p1Res ="Forty";
            if (p2Point ==1)
                p2Res ="Fifteen";
            if (p2Point ==2)
                p2Res ="Thirty";
            score = p1Res + "-" + p2Res;
            return  score;

        }
        else if (p2Point > p1Point && p2Point < 4)
        {
            if (p2Point ==2)
                p2Res ="Thirty";
            if (p2Point ==3)
                p2Res ="Forty";
            if (p1Point ==1)
                p1Res ="Fifteen";
            if (p1Point ==2)
                p1Res ="Thirty";
            score = p1Res + "-" + p2Res;
            return  score;

        }
        else if (p1Point > p2Point && p2Point >= 3 && (p1Point - p2Point) < 2)
        {
            score = "Advantage "+this.p1Name;
            return  score;

        }
        else if (p2Point > p1Point && p1Point >= 3 && (p2Point - p1Point) < 2)
        {
            score = "Advantage "+this.p2Name;
            return  score;

        }
        else if (p1Point >=4 && p2Point >=0 && (p1Point - p2Point)>=2)
        {
            score = "Win for "+this.p1Name;
            return  score;

        }
        else if (p2Point >=4 && p1Point >=0 && (p2Point - p1Point)>=2)
        {
            score = "Win for "+this.p2Name;
            return  score;

        }
        else
            return score;
    }

    public void p1Score(){
        p1Point++;
    }

    public void p2Score(){
        p2Point++;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(this.p1Name))
            p1Score();
        else
            p2Score();
    }
   /* public void SetP1Score(int number){

        for (int i = 0; i < number; i++)
        {
            p1Score();
        }

    }

    public void SetP2Score(int number){

        for (int i = 0; i < number; i++)
        {
            p2Score();
        }

    }
*/

}
