import java.awt.*;
import java.awt.event.*;
class TextAreaDemo extends Frame implements ActionListener {
    TextArea area;
    TextArea area2;
    Button b;
    String s = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n";

    TextAreaDemo() {
        area = new TextArea(s);
        area.setBounds(20, 100, 300, 300);
        area2 = new TextArea();
        area2.setBounds(340,100,300,300);
        b = new Button("Copy");
        b.setBounds(100, 400, 100, 30);
        b.addActionListener(this);
        add(area2);
        add(b);
        add(area);
        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        String selected = area.getSelectedText();
        area2.setText(selected);
    }
    // main method
    public static void main(String[] args) {
        new TextAreaDemo();
    }
}