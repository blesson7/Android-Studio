package com.example.user.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;

public class Three_grids extends AppCompatActivity {
    Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but_reset;
    int move, count = 0, count1, count2;
    String button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String status = "no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_grids);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        but9 = (Button) findViewById(R.id.but9);
        but_reset = (Button) findViewById(R.id.reset);
        move = 1;

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //       if(but1.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but1.setText("X");
                    but1.setTextColor(Color.parseColor("red"));
                    but1.setEnabled(false);
                    count += 1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but1.setText("O");
                    but1.setTextColor(Color.parseColor("green"));
                    but1.setEnabled(false);
                    count += 1;
                    endGame();

                    //            }
                }
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //        if(but2.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but2.setText("X");
                    but2.setTextColor(Color.parseColor("red"));
                    but2.setEnabled(false);
                    count += 1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but2.setText("O");
                    but2.setTextColor(Color.parseColor("green"));
                    but2.setEnabled(false);
                    count += 1;
                    endGame();

                    //           }
                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //     if (but3.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but3.setText("X");
                    but3.setTextColor(Color.parseColor("red"));
                    but3.setEnabled(false);
                    count += 1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but3.setText("O");
                    but3.setTextColor(Color.parseColor("green"));
                    but3.setEnabled(false);
                    count += 1;
                    endGame();

                    //       }
                }
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if(but4.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but4.setText("X");
                    but4.setTextColor(Color.parseColor("red"));
                    but4.setEnabled(false);
                    count += 1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but4.setText("O");
                    but4.setTextColor(Color.parseColor("green"));
                    but4.setEnabled(false);
                    count += 1;
                    endGame();

                    //  }
                }
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but5.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but5.setText("X");
                    but5.setTextColor(Color.parseColor("red"));
                    but5.setEnabled(false);
                    count += 1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but5.setText("O");
                    but5.setTextColor(Color.parseColor("green"));
                    but5.setEnabled(false);
                    count += 1;
                    endGame();

                    //  }
                }
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if(but6.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but6.setText("X");
                    but6.setTextColor(Color.parseColor("red"));
                    but6.setEnabled(false);
                    count += 1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but6.setText("O");
                    but6.setTextColor(Color.parseColor("green"));
                    but6.setEnabled(false);
                    count += 1;
                    endGame();

                    //   }
                }
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but7.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but7.setText("X");
                    but7.setTextColor(Color.parseColor("red"));
                    but7.setEnabled(false);
                    endGame();
                    count += 1;
                } else if (move == 2) {
                    move = 1;
                    but7.setText("O");
                    but7.setTextColor(Color.parseColor("green"));
                    but7.setEnabled(false);
                    count += 1;
                    endGame();
                    //     }
                }
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but8.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but8.setText("X");
                    but8.setTextColor(Color.parseColor("red"));
                    but8.setEnabled(false);
                    count += 1;
                    endGame();
                } else if (move == 2) {
                    move = 1;
                    but8.setText("O");
                    but8.setTextColor(Color.parseColor("green"));
                    but8.setEnabled(false);
                    count += 1;
                    endGame();
                    //  }
                }
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but9.setText("X");
                    but9.setTextColor(Color.parseColor("red"));
                    but9.setEnabled(false);
                    count += 1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but9.setText("O");
                    but9.setTextColor(Color.parseColor("green"));
                    but9.setEnabled(false);
                    count += 1;
                    endGame();

                    //  }
                }
            }
        });
        but_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                move = 1;
                status = "no";
                display(count1);
                display2(count2);
                but1.setText("");
                but2.setText("");
                but3.setText("");
                but4.setText("");
                but5.setText("");
                but6.setText("");
                but7.setText("");
                but8.setText("");
                but9.setText("");
                but1.setEnabled(true);
                but2.setEnabled(true);
                but3.setEnabled(true);
                but4.setEnabled(true);
                but5.setEnabled(true);
                but6.setEnabled(true);
                but7.setEnabled(true);
                but8.setEnabled(true);
                but9.setEnabled(true);
            }
        });
    }

    public void endGame() {

        button1 = but1.getText().toString();
        button2 = but2.getText().toString();
        button3 = but3.getText().toString();
        button4 = but4.getText().toString();
        button5 = but5.getText().toString();
        button6 = but6.getText().toString();
        button7 = but7.getText().toString();
        button8 = but8.getText().toString();
        button9 = but9.getText().toString();

        //Checks if first player wins
        if (button1.equals("X") && button2.equals("X") && button3.equals("X")) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button1.equals("X") && button5.equals("X") && button9.equals("X")) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button2.equals("X") && button5.equals("X") && button8.equals("X")) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button3.equals("X") && button5.equals("X") && button7.equals("X")) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button1.equals("X") && button4.equals("X") && button7.equals("X")) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button4.equals("X") && button5.equals("X") && button6.equals("X")) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button7.equals("X") && button8.equals("X") && button9.equals("X")) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button3.equals("X") && button6.equals("X") && button9.equals("X")) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count1 = count1 + 1;
            dis_able();
        }
        //Checks if second player wins
        if (button1.equals("O") && button2.equals("O") && button3.equals("O")) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button1.equals("O") && button5.equals("O") && button9.equals("O")) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button2.equals("O") && button5.equals("O") && button8.equals("O")) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button3.equals("O") && button5.equals("O") && button7.equals("O")) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button1.equals("O") && button4.equals("O") && button7.equals("O")) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button4.equals("O") && button5.equals("O") && button6.equals("O")) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button7.equals("O") && button8.equals("O") && button9.equals("O")) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count2 = count2 + 1;
            dis_able();

        }
        if (button3.equals("O") && button6.equals("O") && button9.equals("O")) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count2 = count2 + 1;
            dis_able();
        }
        if ((count == 9) && (status != "yes")) {
            Toast.makeText(this, "It's a tie", Toast.LENGTH_SHORT).show();
        }
    }

    //Displays 1st Players score
    private void display(int player) {
        TextView p_win = (TextView) findViewById(R.id.p1_score);
        p_win.setText("" + count1);
    }

    // displays 2nd player score
    private void display2(int player2) {
        TextView p_win = (TextView) findViewById(R.id.p2_score);
        p_win.setText("" + count2);
    }

    public void dis_able() {

        but1.setEnabled(false);
        but2.setEnabled(false);
        but3.setEnabled(false);
        but4.setEnabled(false);
        but9.setEnabled(false);
        but5.setEnabled(false);
        but6.setEnabled(false);
        but7.setEnabled(false);
        but8.setEnabled(false);
    }
}