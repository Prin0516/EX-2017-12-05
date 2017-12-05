import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private Container cp;
    private JPanel jpl=new JPanel();
    private ArrayList<movelist> molist=new ArrayList<movelist>();
    private ArrayList<Thread> moThreadList=new ArrayList<Thread>();
    public MainFrame() {
        init();
    }
    private void init(){
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setBounds(10,10,500,500);
    cp=this.getContentPane();
    cp.setLayout(null);
    cp.add(jpl);


    }
}