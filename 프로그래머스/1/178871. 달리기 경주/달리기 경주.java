import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerRanking = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            playerRanking.put(players[i],i);
        }
        
        for(String call : callings){
            int callPlayerRanking = playerRanking.get(call);
            
            String frontPlayer = players[callPlayerRanking - 1];
            
            players[callPlayerRanking - 1] = call;
            players[callPlayerRanking] = frontPlayer;
            
            playerRanking.put(call, callPlayerRanking-1);
            playerRanking.put(frontPlayer,playerRanking.get(frontPlayer)+1);
        }
        return players;
    }
}