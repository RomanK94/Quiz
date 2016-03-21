public class Board {
    private String word;

    public Board(String word) {
        this.word = word;
    }

    public void getBoard(){
        for (int i = 0; i<word.length();i++){
            System.out.print("~");
        }
        System.out.println();
    }
}
