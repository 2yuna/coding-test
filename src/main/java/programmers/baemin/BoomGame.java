package programmers.baemin;

class BoomGame {

//    @Test
//    void solutionTest() {
//        Assertions.assertArrayEquals(new String[]{"B1E1B", "B1E1B", "B111B", "BBBBB"}, sl.solution(new String[]{"EEEEE", "EEMEE", "EEEEE", "EEEEE"}, 2, 0));
//        Assertions.assertArrayEquals(new String[]{"XME", "EEE", "EME"}, sl.solution(new String[]{"MME", "EEE", "EME"}, 0, 0));
//    }

    public String[] solution(String[] board, int y, int x) {
        String[] answer = {};

        int row = board.length;
        int column = board[0].length();

        char[][] game = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                game[i][j] = board[i].charAt(j);
            }
        }

        print(game, row, column);

        click(game, y, x);


        return answer;
    }

    private void click(char[][] map, int y, int x) {

    }

    private void print(char[][] array, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
