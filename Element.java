import java.util.List;
import java.util.ArrayList;

public class Element {
    private Board board;
    private String action;
    private List<Integer> childs = new ArrayList<Integer>();
    private int depth;


    public Element(String str, String action, int depth) {
        this.board = new Board(str);
        this.action = action;
        this.depth = depth;
    }


    public Element(Board board, String action, int depth) {
        this.board = new Board(board);
        this.action = action;
        this.depth = depth;
    }


    public void setChilds(List<Integer> childs) {
        for (Integer child : childs) {
            this.childs.add(child);
        }
    }


    public Board getBoard() {
        return this.board;
    }


    public String getAction() {
        return this.action;
    }


    public int[] getChilds() {
        int[] childs = new int[this.childs.size()];
        for (int i = 0; i < this.childs.size(); i++)
            childs[i] = this.childs.get(i);
        return childs;
    }


    public int getDepth() {
        return this.depth;
    }
}
