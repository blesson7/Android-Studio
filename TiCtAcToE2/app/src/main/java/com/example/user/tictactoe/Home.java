package com.example.user.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;

public class Home extends AppCompatActivity {
    Button but1, but2, but3, but4, but5, but6, but7, but8, but9,but10, but_reset;
    Button but11, but12, but13, but14, but15, but16, but17, but18, but19,but20,but21, but22, but23, but24, but25;
    int move, count=0, count1, count2;
    String button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19,button20,button21, button22, button23, button24, button25;
    String status="no";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five_grids);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        but9 = (Button) findViewById(R.id.but9);
        but10 = (Button) findViewById(R.id.but10);
        but11 = (Button) findViewById(R.id.but11);
        but12 = (Button) findViewById(R.id.but12);
        but13 = (Button) findViewById(R.id.but13);
        but14= (Button) findViewById(R.id.but14);
        but15= (Button) findViewById(R.id.but15);
        but16= (Button) findViewById(R.id.but16);
        but17= (Button) findViewById(R.id.but17);
        but18= (Button) findViewById(R.id.but18);
        but19 = (Button) findViewById(R.id.but19);
        but20 = (Button) findViewById(R.id.but20);
        but21 = (Button) findViewById(R.id.but21);
        but22 = (Button) findViewById(R.id.but22);
        but23 = (Button) findViewById(R.id.but23);
        but24 = (Button) findViewById(R.id.but24);
        but25 = (Button) findViewById(R.id.but25);
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
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but1.setText("O");
                    but1.setTextColor(Color.parseColor("green"));
                    but1.setEnabled(false);
                    count+=1;
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
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but2.setText("O");
                    but2.setTextColor(Color.parseColor("green"));
                    but2.setEnabled(false);
                    count+=1;
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
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but3.setText("O");
                    but3.setTextColor(Color.parseColor("green"));
                    but3.setEnabled(false);
                    count+=1;
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
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but4.setText("O");
                    but4.setTextColor(Color.parseColor("green"));
                    but4.setEnabled(false);
                    count+=1;
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
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but5.setText("O");
                    but5.setTextColor(Color.parseColor("green"));
                    but5.setEnabled(false);
                    count+=1;
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
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but6.setText("O");
                    but6.setTextColor(Color.parseColor("green"));
                    but6.setEnabled(false);
                    count+=1;
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
                    count+=1;
                } else if (move == 2) {
                    move = 1;
                    but7.setText("O");
                    but7.setTextColor(Color.parseColor("green"));
                    but7.setEnabled(false);
                    count+=1;
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
                    count+=1;
                    endGame();
                } else if (move == 2) {
                    move = 1;
                    but8.setText("O");
                    but8.setTextColor(Color.parseColor("green"));
                    but8.setEnabled(false);
                    count+=1;
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
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but9.setText("O");
                    but9.setTextColor(Color.parseColor("green"));
                    but9.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but10.setText("X");
                    but10.setTextColor(Color.parseColor("red"));
                    but10.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but10.setText("O");
                    but10.setTextColor(Color.parseColor("green"));
                    but10.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but11.setText("X");
                    but11.setTextColor(Color.parseColor("red"));
                    but11.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but11.setText("O");
                    but11.setTextColor(Color.parseColor("green"));
                    but11.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
           }
        });
        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but12.setText("X");
                    but12.setTextColor(Color.parseColor("red"));
                    but12.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but12.setText("O");
                    but12.setTextColor(Color.parseColor("green"));
                    but12.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but13.setText("X");
                    but13.setTextColor(Color.parseColor("red"));
                    but13.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but13.setText("O");
                    but13.setTextColor(Color.parseColor("green"));
                    but13.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but14.setText("X");
                    but14.setTextColor(Color.parseColor("red"));
                    but14.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but14.setText("O");
                    but14.setTextColor(Color.parseColor("green"));
                    but14.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but15.setText("X");
                    but15.setTextColor(Color.parseColor("red"));
                    but15.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but15.setText("O");
                    but15.setTextColor(Color.parseColor("green"));
                    but15.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but16.setText("X");
                    but16.setTextColor(Color.parseColor("red"));
                    but16.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but16.setText("O");
                    but16.setTextColor(Color.parseColor("green"));
                    but16.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but17.setText("X");
                    but17.setTextColor(Color.parseColor("red"));
                    but17.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but17.setText("O");
                    but17.setTextColor(Color.parseColor("green"));
                    but17.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but18.setText("X");
                    but18.setTextColor(Color.parseColor("red"));
                    but18.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but18.setText("O");
                    but18.setTextColor(Color.parseColor("green"));
                    but18.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but19.setText("X");
                    but19.setTextColor(Color.parseColor("red"));
                    but19.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but19.setText("O");
                    but19.setTextColor(Color.parseColor("green"));
                    but19.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but20.setText("X");
                    but20.setTextColor(Color.parseColor("red"));
                    but20.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but20.setText("O");
                    but20.setTextColor(Color.parseColor("green"));
                    but20.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but21.setText("X");
                    but21.setTextColor(Color.parseColor("red"));
                    but21.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but21.setText("O");
                    but21.setTextColor(Color.parseColor("green"));
                    but21.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but22.setText("X");
                    but22.setTextColor(Color.parseColor("red"));
                    but22.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but22.setText("O");
                    but22.setTextColor(Color.parseColor("green"));
                    but22.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but23.setText("X");
                    but23.setTextColor(Color.parseColor("red"));
                    but23.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but23.setText("O");
                    but23.setTextColor(Color.parseColor("green"));
                    but23.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but24.setText("X");
                    but24.setTextColor(Color.parseColor("red"));
                    but24.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but24.setText("O");
                    but24.setTextColor(Color.parseColor("green"));
                    but24.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(but9.getText().toString().equals(" ")) {
                if (move == 1) {
                    move = 2;
                    but25.setText("X");
                    but25.setTextColor(Color.parseColor("red"));
                    but25.setEnabled(false);
                    count+=1;
                    endGame();

                } else if (move == 2) {
                    move = 1;
                    but25.setText("O");
                    but25.setTextColor(Color.parseColor("green"));
                    but25.setEnabled(false);
                    count+=1;
                    endGame();

                    //  }
                }
            }
        });
        but_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                status="no";
                move=1;
                display(count1);
                display2(count2);
                but1.setText("");
                but2.setText("");
                but3.setText("");
                but4.setText("");
                but5.setText("");
                but6.setText("");
                but7.setText("");
                but9.setText("");
                but10.setText("");
                but11.setText("");
                but12.setText("");
                but13.setText("");
                but14.setText("");
                but15.setText("");
                but16.setText("");
                but17.setText("");
                but19.setText("");
                but18.setText("");
                but8.setText("");
                but20.setText("");
                but21.setText("");
                but22.setText("");
                but23.setText("");
                but24.setText("");
                but25.setText("");
                but1.setEnabled(true);
                but2.setEnabled(true);
                but3.setEnabled(true);
                but4.setEnabled(true);
                but5.setEnabled(true);
                but10.setEnabled(true);
                but6.setEnabled(true);
                but7.setEnabled(true);
                but8.setEnabled(true);
                but9.setEnabled(true);
                but11.setEnabled(true);
                but12.setEnabled(true);
                but13.setEnabled(true);
                but14.setEnabled(true);
                but15.setEnabled(true);
                but20.setEnabled(true);
                but16.setEnabled(true);
                but17.setEnabled(true);
                but18.setEnabled(true);
                but19.setEnabled(true);
                but21.setEnabled(true);
                but22.setEnabled(true);
                but23.setEnabled(true);
                but24.setEnabled(true);
                but25.setEnabled(true);
                
            }
        });
    }

    public void endGame() {

        button1=but1.getText().toString();
        button2=but2.getText().toString();
        button3=but3.getText().toString();
        button4=but4.getText().toString();
        button5=but5.getText().toString();
        button6=but6.getText().toString();
        button7=but7.getText().toString();
        button9=but9.getText().toString();
        button10=but10.getText().toString();
        button11=but11.getText().toString();
        button12=but12.getText().toString();
        button13=but13.getText().toString();
        button14=but14.getText().toString();
        button15=but15.getText().toString();
        button16=but16.getText().toString();
        button17=but17.getText().toString();
        button19=but19.getText().toString();
        button18=but18.getText().toString();
        button8=but8.getText().toString();
        button20=but20.getText().toString();
        button21=but21.getText().toString();
        button22=but22.getText().toString();
        button23=but23.getText().toString();
        button24=but24.getText().toString();
        button25=but25.getText().toString();

        //Checks if first player wins
        if (button1.equals("X") && button2.equals("X") && button3.equals("X") && button4.equals("X")&& button5.equals("X") ) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button1.equals("X") && button6.equals("X") && button11.equals("X") && button16.equals("X")&& button21.equals("X"))  {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button1.equals("X") && button7.equals("X") && button13.equals("X") && button19.equals("X")&& button25.equals("X"))  {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button2.equals("X") && button7.equals("X") && button12.equals("X") && button17.equals("X")&& button22.equals("X") ) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button3.equals("X") && button8.equals("X") && button13.equals("X") && button18.equals("X")&& button23.equals("X") ) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button4.equals("X") && button9.equals("X") && button14.equals("X") && button19.equals("X")&& button24.equals("X") ) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button5.equals("X") && button10.equals("X") && button15.equals("X") && button20.equals("X")&& button25.equals("X") ) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button5.equals("X") && button9.equals("X") && button13.equals("X") && button17.equals("X")&& button21.equals("X") ) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            dis_able();
            status="yes";
            count1 = count1 + 1;
        }
        if (button6.equals("X") && button7.equals("X") && button8.equals("X") && button9.equals("X")&& button10.equals("X") ) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button11.equals("X") && button12.equals("X") && button13.equals("X") && button14.equals("X")&& button15.equals("X"))  {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button16.equals("X") && button17.equals("X") && button18.equals("X") && button19.equals("X")&& button20.equals("X"))  {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count1 = count1 + 1;
            dis_able();
        }
        if (button21.equals("X") && button22.equals("X") && button23.equals("X") && button24.equals("X")&& button25.equals("X") ) {
            Toast.makeText(this, "Player X Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count1 = count1 + 1;
            dis_able();
        }
        //Checks if second player wins
        if (button1.equals("O") && button2.equals("O") && button3.equals("O") && button4.equals("O")&& button5.equals("O") ) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button1.equals("O") && button6.equals("O") && button11.equals("O") && button16.equals("O")&& button21.equals("O"))  {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button1.equals("O") && button7.equals("O") && button13.equals("O") && button19.equals("O")&& button25.equals("O"))  {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button2.equals("O") && button7.equals("O") && button12.equals("O") && button17.equals("O")&& button22.equals("O") ) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button3.equals("O") && button8.equals("O") && button13.equals("O") && button18.equals("O")&& button23.equals("O") ) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button4.equals("O") && button9.equals("O") && button14.equals("O") && button19.equals("O")&& button24.equals("O") ) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button5.equals("O") && button10.equals("O") && button15.equals("O") && button20.equals("O")&& button25.equals("O") ) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button5.equals("O") && button9.equals("O") && button13.equals("O") && button17.equals("O")&& button21.equals("O") ) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            dis_able();
            status="yes";
            count2 = count2 + 1;
        }
        if (button6.equals("O") && button7.equals("O") && button8.equals("O") && button9.equals("O")&& button10.equals("O") ) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button11.equals("O") && button12.equals("O") && button13.equals("O") && button14.equals("O")&& button15.equals("O"))  {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button16.equals("O") && button17.equals("O") && button18.equals("O") && button19.equals("O")&& button20.equals("O"))  {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status="yes";
            count2 = count2 + 1;
            dis_able();
        }
        if (button21.equals("O") && button22.equals("O") && button23.equals("O") && button24.equals("O")&& button25.equals("O") ) {
            Toast.makeText(this, "Player O Wins", Toast.LENGTH_SHORT).show();
            status = "yes";
            count2 = count2 + 1;
            dis_able();
        }
        if ((count == 25) && (status != "yes")) {
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
    public void dis_able(){
        but1.setEnabled(false);
        but2.setEnabled(false);
        but3.setEnabled(false);
        but4.setEnabled(false);
        but5.setEnabled(false);
        but10.setEnabled(false);
        but6.setEnabled(false);
        but7.setEnabled(false);
        but8.setEnabled(false);
        but9.setEnabled(false);
        but11.setEnabled(false);
        but12.setEnabled(false);
        but13.setEnabled(false);
        but14.setEnabled(false);
        but15.setEnabled(false);
        but20.setEnabled(false);
        but16.setEnabled(false);
        but17.setEnabled(false);
        but18.setEnabled(false);
        but19.setEnabled(false);
        but21.setEnabled(false);
        but22.setEnabled(false);
        but23.setEnabled(false);
        but24.setEnabled(false);
        but25.setEnabled(false);
    }
}