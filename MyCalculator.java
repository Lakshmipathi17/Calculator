import java.awt.*;
import java.awt.event.*;


public class MyCalculator implements ActionListener,ItemListener {

    //    Creating values for future Calculations
    double num1 = 0, num2 = 0, result = 0;
    int Calculation;

    //    Creating a frame
    Frame frame = new Frame("Calculator");
    //    Creating objects for what all is required
    TextField tf = new TextField();
    Label l1 = new Label();
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button b0 = new Button("0");
    Button bPlus = new Button("+");
    Button bminus = new Button("-");
    Button bmul = new Button("*");
    Button bdiv = new Button("\u00f7");
    Button bEqual = new Button("=");
    Button bClear = new Button("CLR");
    Button bdel = new Button("DEL");
    Button bnegative = new Button("(-)");
    Button bdot = new Button(".");
    Button bSquare = new Button("X\u00B2");
    Button bReciprocal = new Button("1/x");
    Button bSrqt = new Button("\u221A");
    CheckboxGroup c1 = new CheckboxGroup();
    Checkbox on = new Checkbox("On", c1, true);
    Checkbox off = new Checkbox("Off", c1, false);

    public void designFrame() {
//            Designing how the frame should look like
        frame.setSize(300, 500);
        frame.setLayout(null);
        frame.setBackground(new Color(193, 239, 255));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });

    }

    public void addComponents() {
//            Adding components of the objects that has been created and setting their properties.
        l1.setBounds(10, 40, 200, 20);
        l1.setForeground(new Color(72, 56, 56));
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        frame.add(l1);

        tf.setBounds(15, 60, 270, 35);
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        tf.setBackground(new Color(249, 245, 235));
        tf.setForeground(Color.BLACK);
        tf.setEditable(false);
        frame.add(tf);

        on.setBounds(15, 100, 60, 40);
        on.setFont(new Font("Arial", Font.BOLD, 14));
        on.setForeground(new Color(246, 90, 131));
        on.setFocusable(false);
        frame.add(on);

        off.setBounds(15, 125, 60, 40);
        off.setFont(new Font("Arial", Font.BOLD, 14));
        off.setForeground(new Color(246, 90, 131));
        off.setFocusable(false);
        frame.add(off);

        bSrqt.setBounds(15, 170, 60, 40);
        bSrqt.setFont(new Font("Arial", Font.BOLD, 18));
        bSrqt.setBackground(new Color(255, 232, 152));
        bSrqt.setFocusable(false);
        frame.add(bSrqt);

        b7.setBounds(15, 230, 60, 40);
        b7.setFont(new Font("Arial", Font.BOLD, 20));
        b7.setBackground(new Color(255, 248, 188));
        b7.setFocusable(false);
        frame.add(b7);

        b4.setBounds(15, 290, 60, 40);
        b4.setFont(new Font("Arial", Font.BOLD, 20));
        b4.setFocusable(false);
        b4.setBackground(new Color(255, 248, 188));
        frame.add(b4);


        b1.setBounds(15, 350, 60, 40);
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setBackground(new Color(255, 248, 188));
        b1.setFocusable(false);
        frame.add(b1);

        b0.setBounds(15, 410, 60, 40);
        b0.setFont(new Font("Arial", Font.BOLD, 20));
        b0.setFocusable(false);
        b0.setBackground(new Color(84, 186, 185));
        frame.add(b0);

        bClear.setBounds(85, 110, 60, 40);
        bClear.setFont(new Font("Arial", Font.BOLD, 12));
        bClear.setBackground(new Color(255, 74, 74));

        bClear.setForeground(Color.white);
        bClear.setFocusable(false);
        frame.add(bClear);

        bSquare.setBounds(85, 170, 60, 40);
        bSquare.setFont(new Font("Arial", Font.BOLD, 20));
        bSquare.setBackground(new Color(255, 232, 152));

        bSquare.setFocusable(false);
        frame.add(bSquare);


        b8.setBounds(85, 230, 60, 40);
        b8.setFont(new Font("Arial", Font.BOLD, 20));
        b8.setBackground(new Color(255, 248, 188));
        b8.setFocusable(false);
        frame.add(b8);


        b5.setBounds(85, 290, 60, 40);
        b5.setFont(new Font("Arial", Font.BOLD, 20));
        b5.setBackground(new Color(255, 248, 188));
        b5.setFocusable(false);
        frame.add(b5);

        b2.setBounds(85, 350, 60, 40);
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        b2.setBackground(new Color(255, 248, 188));
        b2.setFocusable(false);
        frame.add(b2);


        bnegative.setBounds(85, 410, 60, 40);
        bnegative.setFont(new Font("Arial", Font.BOLD, 20));
        bnegative.setBackground(new Color(84, 186, 185));
        bnegative.setFocusable(false);
        frame.add(bnegative);

        bdel.setBounds(155, 110, 60, 40);
        bdel.setFont(new Font("Arial", Font.BOLD, 12));
        bdel.setBackground(new Color(255, 74, 74));
        bdel.setForeground(Color.white);
        bdel.setFocusable(false);
        frame.add(bdel);


        bReciprocal.setBounds(155, 170, 60, 40);
        bReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        bReciprocal.setBackground(new Color(255, 232, 152));

        bReciprocal.setFocusable(false);
        frame.add(bReciprocal);


        b9.setBounds(155, 230, 60, 40);
        b9.setFont(new Font("Arial", Font.BOLD, 20));
        b9.setFocusable(false);
        b9.setBackground(new Color(255, 248, 188));
        frame.add(b9);


        b6.setBounds(155, 290, 60, 40);
        b6.setFont(new Font("Arial", Font.BOLD, 20));
        b6.setBackground(new Color(255, 248, 188));
        b6.setFocusable(false);
        frame.add(b6);

        b3.setBounds(155, 350, 60, 40);
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        b3.setBackground(new Color(255, 248, 188));
        b3.setFocusable(false);
        frame.add(b3);

        bdot.setBounds(155, 410, 60, 40);
        bdot.setFont(new Font("Arial", Font.BOLD, 20));
        bdot.setBackground(new Color(84, 186, 185));
        bdot.setFocusable(false);
        frame.add(bdot);

        bdiv.setBounds(225, 110, 60, 40);
        bdiv.setFont(new Font("Arial", Font.BOLD, 20));
        bdiv.setBackground(new Color(156, 158, 254));
        bdiv.setFocusable(false);
        frame.add(bdiv);

        bminus.setBounds(225, 170, 60, 40);
        bminus.setFont(new Font("Arial", Font.BOLD, 20));
        bminus.setBackground(new Color(68, 184, 141));
        bminus.setFocusable(false);
        frame.add(bminus);

        bmul.setBounds(225, 230, 60, 40);
        bmul.setFont(new Font("Arial", Font.BOLD, 20));
        bmul.setBackground(new Color(72, 231, 172));
        bmul.setFocusable(false);
        frame.add(bmul);

        bPlus.setBounds(225, 290, 60, 40);
        bPlus.setFont(new Font("Arial", Font.BOLD, 20));
        bPlus.setBackground(new Color(72, 231, 172));
        bPlus.setFocusable(false);
        frame.add(bPlus);

        bEqual.setBounds(225, 350, 60, 100);
        bEqual.setFont(new Font("Arial", Font.BOLD, 20));
        bEqual.setBackground(new Color(156, 158, 254));
        bEqual.setFocusable(false);
        frame.add(bEqual);

    }

    public void addActionPerformed() {
        on.addItemListener(this);
        off.addItemListener(this);
        bClear.addActionListener(this);
        bdel.addActionListener(this);
        bdiv.addActionListener(this);
        bSrqt.addActionListener(this);
        bSquare.addActionListener(this);
        bReciprocal.addActionListener(this);
        bminus.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bmul.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        bPlus.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        bEqual.addActionListener(this);
        b0.addActionListener(this);
        bdot.addActionListener(this);
        bnegative.addActionListener(this);
    }
    MyCalculator(){
        designFrame();
        addActionPerformed();
        addComponents();
    }

    public static void main(String[] args) {
          MyCalculator Lucky = new MyCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == bClear) {
            tf.setText("");
            l1.setText("");
        } else if (source == bdel) {
            int length = tf.getText().length();
            int num = length - 1;

            if (length > 0) {
                StringBuilder delitem = new StringBuilder(tf.getText());
                delitem.deleteCharAt(num);
                tf.setText(delitem.toString());
            }
            if (tf.getText().endsWith("")) {
                l1.setText("");
            }
        } else if (source == b0) {
            if (tf.getText().equals("0")) {
                return;
            } else {
                tf.setText(tf.getText() + "0");
            }
        } else if (source == b1) {
            tf.setText(tf.getText() + "1");
        } else if (source == b2) {
            tf.setText(tf.getText() + "2");
        } else if (source == b3) {
            tf.setText(tf.getText() + "3");
        } else if (source == b4) {
            tf.setText(tf.getText() + "4");
        } else if (source == b5) {
            tf.setText(tf.getText() + "5");
        } else if (source == b6) {
            tf.setText(tf.getText() + "6");
        } else if (source == b7) {
            tf.setText(tf.getText() + "7");
        } else if (source == b8) {
            tf.setText(tf.getText() + "8");
        } else if (source == b9) {
            tf.setText(tf.getText() + "9");
        } else if (source == bdot) {
            if (tf.getText().contains(".")) {
                return;
            } else {
                tf.setText(tf.getText() + ".");
            }
        } else if (source == bPlus) {
            String str = tf.getText();
            num1 = Double.parseDouble(tf.getText());
            Calculation = 1;
            tf.setText("");
            l1.setText(str + "+");
        } else if (source== bminus) {
            String str = tf.getText();
            num1 = Double.parseDouble(tf.getText());
            Calculation=2;
            tf.setText("");
            l1.setText(str+"-");
        } else if (source== bmul) {
            String str = tf.getText();
            num1 = Double.parseDouble(tf.getText());
            Calculation= 3;
            tf.setText("");
            l1.setText(str+"X");
        } else if (source== bdiv) {
            String str = tf.getText();
            num1= Double.parseDouble(tf.getText());
            Calculation = 4;
            tf.setText("");
            l1.setText(str+"\u00f7");
        } else if (source==bSrqt) {
            String str = tf.getText();
            num1 = Double.parseDouble(tf.getText());
            double sqrt = Math.sqrt(num1);
            tf.setText(Double.toString(sqrt));
        } else if (source==bSquare) {
            String str = tf.getText();
            num1 = Double.parseDouble(tf.getText());
            Double square = Math.pow(num1, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                tf.setText(string.replace(".0", ""));
            } else {
                tf.setText(string);
            }
        } else if (source==bReciprocal) {
            String str = tf.getText();
            num1 = Double.parseDouble(tf.getText());
            Double reciprocal = 1 / num1;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                tf.setText(string.replace(".0", ""));
            } else {
                tf.setText(string);
            }
        } else if (source==bnegative) {
               if(tf.getText().endsWith("")){
                      return;
               }
               double temp = Double.parseDouble(tf.getText());
               temp= temp*-1;
               String str= Double.toString(temp);
               if(str.endsWith(".0")) {
                   tf.setText(str.replace(".0", ""));
               }
               else {
                   tf.setText(str);
               }
        } else if (source==bEqual){
            num2=Double.parseDouble(tf.getText());
            switch(Calculation){
                case 1:
                    result= num1+num2;
                    break;
                case 2:
                    result = num1-num2;
                    break;
                case 3:
                    result= num1*num2;
                    break;
                case 4:
                    result=num1/num2;
                    break;
            }
            if(Double.toString(result).endsWith(".0")){
                tf.setText(Double.toString(result).replace(".0",""));
            }
            else {
                tf.setText(Double.toString(result));
            }
            l1.setText("");
            num1= result;
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
if(e.getSource()==on){
    enable();
}
else if(e.getSource()==off){
    disable();
}
    }
    public void enable(){
        on.setEnabled(false);
        off.setEnabled(true);
        tf.setEnabled(true);
        l1.setEnabled(true);
        bClear.setEnabled(true);
        bdel.setEnabled(true);
        bdiv.setEnabled(true);
        bSrqt.setEnabled(true);
        bSquare.setEnabled(true);
        bReciprocal.setEnabled(true);
        bminus.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        bmul.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        bPlus.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        bEqual.setEnabled(true);
        b0.setEnabled(true);
        bdot.setEnabled(true);
        bnegative.setEnabled(true);
    }
    public void disable(){
        on.setEnabled(true);
        off.setEnabled(false);
        tf.setText("");
        l1.setText("");
        bClear.setEnabled(false);
        bdel.setEnabled(false);
        bdiv.setEnabled(false);
        bSrqt.setEnabled(false);
        bSquare.setEnabled(false);
        bReciprocal.setEnabled(false);
        bminus.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        bmul.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        bPlus.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        bEqual.setEnabled(false);
        b0.setEnabled(false);
        bdot.setEnabled(false);
        bnegative.setEnabled(false);
    }
}
