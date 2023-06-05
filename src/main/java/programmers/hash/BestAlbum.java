package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class BestAlbum {
    //    속한 노래가 많이 재생된 장르를 먼저 수록합니다.
//    장르 내에서 많이 재생된 노래를 먼저 수록합니다.
//    장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        Map<Integer, Album> bestAlbumMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            bestAlbumMap.put(i, new Album(i, genres[i], plays[i]));
        }


        for (Map.Entry<Integer, Album> entry : bestAlbumMap.entrySet()) {
            Album album = entry.getValue();

        }

        return answer;
    }

    static class Album {

        private Integer id;

        private String genre;

        private int playCount;

        public Album(Integer id, String genre, int playCount) {
            this.id = id;
            this.genre = genre;
            this.playCount = playCount;
        }

        @Override
        public String toString() {
            return "BestAlbum{" +
                    "id=" + id +
                    ", genre='" + genre + '\'' +
                    ", playCount=" + playCount +
                    '}';
        }
    }
}