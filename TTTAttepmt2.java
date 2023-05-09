// tic-tac-toe using JFrame

import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;

public class TTTAttepmt2 extends JFrame {
    static int x = 1;
    static String X = "X";
    static String O = "O";
    static boolean buttonEnabled = true;
    static int i = 1;
    static String Player1 = "Player 1";
    static String Player2 = "Player 2";

    static String table[][] = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};

    static boolean a1Button = true;
    static boolean a2Button = true;
    static boolean a3Button = true;
    static boolean a4Button = true;
    static boolean a5Button = true;
    static boolean a6Button = true;
    static boolean a7Button = true;
    static boolean a8Button = true;
    static boolean a9Button = true;

    public static void main(String[] args) {
        ListenerMethod();
        // adding event listeners


        
              
        
    };

    public static void ListenerMethod() {
        JFrame f = new JFrame("tic-tac-toe");
        JLabel T = new JLabel("Player 1");
        JButton a1 = new JButton("1");
        JButton a2 = new JButton("2");
        JButton a3 = new JButton("3");
        JButton a4 = new JButton("4");
        JButton a5 = new JButton("5");
        JButton a6 = new JButton("6");
        JButton a7 = new JButton("7");
        JButton a8 = new JButton("8");
        JButton a9 = new JButton("9");
        T.setBounds(20, 20, 50, 20);
        a1.setBounds(100, 50, 50, 50);
        a2.setBounds(150, 50, 50, 50);
        a3.setBounds(200, 50, 50, 50);
        a4.setBounds(100, 100, 50, 50);
        a5.setBounds(150, 100, 50, 50);
        a6.setBounds(200, 100, 50, 50);
        a7.setBounds(100, 150, 50, 50);
        a8.setBounds(150, 150, 50, 50);
        a9.setBounds(200, 150, 50, 50);

        f.setSize(400, 400);
        f.add(T);
        f.add(a1);
        f.add(a2);
        f.add(a3);
        f.add(a4);
        f.add(a5);
        f.add(a6);
        f.add(a7);
        f.add(a8);
        f.add(a9);
        f.setLayout(null);
        f.setVisible(true);


        a1.addMouseListener(new MouseListener() {
            @Override

            public void mousePressed(MouseEvent e) {
                if (i % 2 == 1) {
                    while (a1Button == true) {
                        i++;
                        a1.setText(X);
                        a1Button = false;
                        table[0][0] = "X";
                        a1.setEnabled(false);
                        T.setText(Player2);
                        
                    }

                }
                else {
                    while (a1Button == true) {
                        i++;
                        a1.setText(O);
                        a1Button = false;
                        table[0][0] = "O";

                        a1.setEnabled(false);
                        T.setText(Player1);
                        
                    }
                    
                    
                }
                FindtheWinner();

            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        a2.addMouseListener(new MouseListener() {
            @Override
    
            public void mousePressed(MouseEvent e) {
                if (i % 2 == 1) {
                    while (a2Button == true) {
                        i++;
                        a2.setText(X);
                        a2Button = false;
                        table[0][1] = "X";
                        a2.setEnabled(false);
                        T.setText(Player2);
                        
                    }
    
                }
                else {
                    while (a2Button == true) {
                        i++;
                        a2.setText(O);
                        a2Button = false;
                        table[0][1] = "O";
                        a2.setEnabled(false);
                        T.setText(Player1);
                        
                    }
    
                    
                }
                FindtheWinner();
    
            }
    
            @Override
            public void mouseClicked(MouseEvent e) {
            }
    
            @Override
            public void mouseReleased(MouseEvent e) {
            }
    
            @Override
            public void mouseEntered(MouseEvent e) {
            }
    
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        a3.addMouseListener(new MouseListener() {
            @Override
    
            public void mousePressed(MouseEvent e) {
                if (i % 2 == 1) {
                    while (a3Button == true) {
                        i++;
                        a3.setText(X);
                        a3Button = false;
                        table[0][2] = "X";
                        a3.setEnabled(false);
                        T.setText(Player2);
                        
                    }
    
                }
                else {
                    while (a3Button == true) {
                        i++;
                        a3.setText(O);
                        a3Button = false;
                        table[0][2] = "O";
                        a3.setEnabled(false);
                        T.setText(Player1);
                        
                    }
    
                    
                }
                FindtheWinner();
            }
    
            @Override
            public void mouseClicked(MouseEvent e) {
            }
    
            @Override
            public void mouseReleased(MouseEvent e) {
            }
    
            @Override
            public void mouseEntered(MouseEvent e) {
            }
    
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        a4.addMouseListener(new MouseListener() {
            @Override
    
            public void mousePressed(MouseEvent e) {
                if (i % 2 == 1) {
                    while (a4Button == true) {
                        i++;
                        a4.setText(X);
                        a4Button = false;
                        table[1][0] = "X";
                        a4.setEnabled(false);
                        T.setText(Player2);
                        
                    }
    
                }
                else {
                    while (a4Button == true) {
                        i++;
                        a4.setText(O);
                        a4Button = false;
                        table[1][0] = "O";
                        a4.setEnabled(false);
                        T.setText(Player1);
                        
                    }
    
                    
                }
                FindtheWinner();
            }
    
            @Override
            public void mouseClicked(MouseEvent e) {
            }
    
            @Override
            public void mouseReleased(MouseEvent e) {
            }
    
            @Override
            public void mouseEntered(MouseEvent e) {
            }
    
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        a5.addMouseListener(new MouseListener() {
            @Override
    
            public void mousePressed(MouseEvent e) {
                if (i % 2 == 1) {
                    while (a5Button == true) {
                        i++;
                        a5.setText(X);
                        a5Button = false;
                        table[1][1] = "X";
                        a5.setEnabled(false);
                        T.setText(Player2);
                        
                    }
    
                }
                else {
                    while (a5Button == true) {
                        i++;
                        a5.setText(O);
                        a5Button = false;
                        table[1][1] = "O";
                        a5.setEnabled(false);
                        T.setText(Player1);
                        
                    }
    
                    
                }
                FindtheWinner();
            }
    
            @Override
            public void mouseClicked(MouseEvent e) {
            }
    
            @Override
            public void mouseReleased(MouseEvent e) {
            }
    
            @Override
            public void mouseEntered(MouseEvent e) {
            }
    
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        a6.addMouseListener(new MouseListener() {
            @Override
    
            public void mousePressed(MouseEvent e) {
                if (i % 2 == 1) {
                    while (a6Button == true) {
                        i++;
                        a6.setText(X);
                        a6Button = false;
                        table[1][2] = "X";
                        a6.setEnabled(false);
                        T.setText(Player2);
                        
                    }
    
                }
                else {
                    while (a6Button == true) {
                        i++;
                        a6.setText(O);
                        a6Button = false;
                        table[1][2] = "O";
                        a6.setEnabled(false);
                        T.setText(Player1);
                        
                    }
    
                    
                }
                FindtheWinner();
            }
    
            @Override
            public void mouseClicked(MouseEvent e) {
            }
    
            @Override
            public void mouseReleased(MouseEvent e) {
            }
    
            @Override
            public void mouseEntered(MouseEvent e) {
            }
    
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        a7.addMouseListener(new MouseListener() {
            @Override
    
            public void mousePressed(MouseEvent e) {
                if (i % 2 == 1) {
                    while (a7Button == true) {
                        i++;
                        a7.setText(X);
                        a7Button = false;
                        table[2][0] = "X";
                        a7.setEnabled(false);
                        T.setText(Player2);
                        
                    }
    
                }
                else {
                    while (a7Button == true) {
                        i++;
                        a7.setText(O);
                        a7Button = false;
                        table[2][0] = "O";
                        a7.setEnabled(false);
                        T.setText(Player1);
                        
                    }
    
                    
                }
                FindtheWinner();
            }
    
            @Override
            public void mouseClicked(MouseEvent e) {
            }
    
            @Override
            public void mouseReleased(MouseEvent e) {
            }
    
            @Override
            public void mouseEntered(MouseEvent e) {
            }
    
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        a8.addMouseListener(new MouseListener() {
            @Override
    
            public void mousePressed(MouseEvent e) {
                if (i % 2 == 1) {
                    while (a8Button == true) {
                        i++;
                        a8.setText(X);
                        a8Button = false;
                        table[2][1] = "X";
                        a8.setEnabled(false);
                        T.setText(Player2);
                        
                    }
    
                }
                else {
                    while (a8Button == true) {
                        i++;
                        a8.setText(O);
                        a8Button = false;
                        table[2][1] = "O";
                        a8.setEnabled(false);
                        T.setText(Player1);
                        
                    }
    
                    
                }
                FindtheWinner();
            }
    
            @Override
            public void mouseClicked(MouseEvent e) {
            }
    
            @Override
            public void mouseReleased(MouseEvent e) {
            }
    
            @Override
            public void mouseEntered(MouseEvent e) {
            }
    
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        a9.addMouseListener(new MouseListener() {
            @Override
    
            public void mousePressed(MouseEvent e) {
                if (i % 2 == 1) {
                    while (a9Button == true) {
                        i++;
                        a9.setText(X);
                        a9Button = false;
                        table[2][2] = "X";
                        a9.setEnabled(false);
                        T.setText(Player2);
                        
                    }
    
                }
                else {
                    while (a9Button == true) {
                        i++;
                        a9.setText(O);
                        a9Button = false;
                        table[2][2] = "O";
                        a9.setEnabled(false);
                        T.setText(Player1);
                        
                    }
    
                    
                }
                FindtheWinner();
                
            }
    
            @Override
            public void mouseClicked(MouseEvent e) {
            }
    
            @Override
            public void mouseReleased(MouseEvent e) {
            }
    
            @Override
            public void mouseEntered(MouseEvent e) {
            }
    
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    public static void FindtheWinner() {
        if (table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] == "O") {
            System.out.println("Congratulations "+ Player2 + ". You Won!");
            System.exit(1);
        } else if (table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] == "X") {
            System.out.println("Congratulations "+ Player1 + ". You Won!");
            System.exit(1);
        } else if (table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] == "O") {
            System.out.println("Congratulations "+ Player2 + ". You Won!");
            System.exit(1);
        } else if (table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] == "X") {
            System.out.println("Congratulations "+ Player1 + ". You Won!");
            System.exit(1);
        } else if (table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] == "O") {
            System.out.println("Congratulations "+ Player2 + ". You Won!");
            System.exit(1);
        } else if (table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] == "X") {
            System.out.println("Congratulations "+ Player1 + ". You Won!");
            System.exit(1);
        } else if (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] == "O") {
            System.out.println("Congratulations "+ Player2 + ". You Won!");
            System.exit(1);
        } else if (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] == "X") {
            System.out.println("Congratulations "+ Player1 + ". You Won!");
            System.exit(1);
        } else if (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] == "O") {
            System.out.println("Congratulations "+ Player2 + ". You Won!");
            System.exit(1);
        } else if (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] == "X") {
            System.out.println("Congratulations "+ Player1 + ". You Won!");
            System.exit(1);
        }

        
    }
     public static void arrayList(){
for (int i = 0; i<3; i++){
    for (int j = 0; j<3; j++){
        System.out.print(table[i][j]);
    }
    System.out.println();
}}

}


// class MyWindow extends JFrame {

// public static void main(String[] args) {

// final JTextBox textBox = new JTextBox("some text here");
// JButton button = new JButton("Click!");
// button.addActionListener(new ActionListener() {
// @Override
// public void actionPerformed(ActionEvent e) {
// JOptionPane.showMessageDialog(this, textBox.getText());
// }
// });
// }
// }