package texteditos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class TextEditor extends JFrame implements ActionListener,KeyListener {
    JTextArea textarea;
    JScrollPane scrollpane;
    JSpinner fontSizeSpinner;
    JLabel fontLabel;
    JButton fontColorButton;
    JComboBox fontBox;
    JButton buttonitalic;  
    JButton buttonkalin;
     int i =0;
    int sonindex =0;
    Stack undo = new Stack();
    Stack redo = new Stack();    
  
    public TextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text editör");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        
        textarea=new JTextArea();
        
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setFont(new Font("Arial",Font.PLAIN,20));
        scrollpane=new JScrollPane(textarea);
        scrollpane.setPreferredSize(new Dimension(450,500));
        scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        fontLabel=new JLabel("Font: ");
        fontSizeSpinner=new JSpinner();
        fontSizeSpinner.setPreferredSize(new Dimension(50,25));
        fontSizeSpinner.setValue(20);
        fontSizeSpinner.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                textarea.setFont(new Font(textarea.getFont().getFamily(),Font.PLAIN,(int) fontSizeSpinner.getValue()));
            }
        
        
        });
      
        buttonitalic=new JButton("İ");
        buttonkalin=new JButton("K");
        fontColorButton=new JButton("Color");
        fontColorButton.addActionListener(this);
        String[] fonts= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        fontBox=new JComboBox(fonts);
        fontBox.addActionListener(this);
        fontBox.setSelectedItem("Arial");
        this.add(buttonitalic);
        this.add(buttonkalin);
        this.add(fontBox);
        this.add(fontColorButton);
        this.add(fontLabel);
        this.add(fontSizeSpinner);
        this.add(scrollpane);
        textarea.addKeyListener(this);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==fontColorButton){
            JColorChooser colorChooser=new JColorChooser();
            Color color=colorChooser.showDialog(null,"Renk secin",Color.black);
            textarea.setForeground(color);
        }
        if(e.getSource()==fontBox){
            textarea.setFont(new Font((String)fontBox.getSelectedItem(),Font.PLAIN,textarea.getFont().getSize()));
        }
        if(e.getSource()==buttonitalic){
          Font  f = new Font ("Sanserif", Font.ITALIC, 10);
          textarea.setFont (f);
        }
        if(e.getSource()==buttonkalin){
           Font f = new Font ("Monospaced", Font.BOLD | Font.ITALIC, 14);
           textarea.setFont (f);
        }
        
            
    
}

   
   

    @Override
    public void keyPressed(KeyEvent e) {
         i++;
        if(e.getKeyChar()==' '){
            push();
        }
      
        if(e.getKeyChar()=='>'){
            String yazi = textarea.getText();
        Dugum sonEleman = (Dugum)redo.pop();
        
        yazi = yazi + " " + sonEleman.kelime;
        
        textarea.setText(yazi);
        }
        if(e.getKeyChar()=='<'){
               Dugum sonEleman = (Dugum)undo.pop();
        
        redo.push(sonEleman);
        
        String yazi = textarea.getText();
        
        String sonYazi = yazi.substring(0, sonEleman.index);
        
        textarea.setText(sonYazi);
        }
        
        
        
        
    }
    public void push(){
           String yazi = textarea.getText();
        
            String kelime = yazi.substring(sonindex, yazi.length()-1);
            
            undo.push(new Dugum(i, kelime));
            
            sonindex = i+1;
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

   

}
