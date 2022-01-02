import java.util.*;
import javax.swing.*;
import java.awt.*;
 
public class b extends JFrame{
    		b() {
        setTitle("GridLayout");        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5); // 격자 사이 수직 간격 5 픽셀
        setLayout(grid);
        add(new JLabel(" 이름"));
        add(new JTextField(""));
        add(new JLabel(" 학번"));
        add(new JTextField(""));
        add(new JLabel(" 학과"));
        add(new JTextField(""));
        add(new JLabel(" 과목"));
        add(new JTextField(""));
 
        setSize(300, 200);
        setVisible(true);    }
    public static void main(String[] args) {
    	new b();
    }
}
