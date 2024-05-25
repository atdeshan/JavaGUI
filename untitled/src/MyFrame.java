import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {




    JLabel name = new JLabel("name");
    JTextField nameField = new JTextField();
    JLabel gender = new JLabel("gender");
    JTextField genderField = new JTextField();
    JButton submit = new JButton("submit");

    JButton view = new JButton("students details");
    String[][] enry = new String[100][2];
    int stCount = 0;
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){
            System.out.println("gg");
            addIntoArray(nameField.getText(),genderField.getText());
            nameField.setText("");
            genderField.setText("");
        } else if (e.getSource()==view) {
            showDetails();
        }
    }

    public void addIntoArray(String name, String gender){
        enry[stCount][0] =name;
        enry[stCount][1] = gender;
        stCount++;
    }
    public void showDetails(){
        JFrame stDetails = new JFrame();
        stDetails.setSize(300,150);
        stDetails.setDefaultCloseOperation(EXIT_ON_CLOSE);
        stDetails.setLayout(new GridLayout(stCount+1,2));
        stDetails.add(new JLabel("name"));
        stDetails.add(new JLabel("gender"));
        for(int x =0;x<stCount;x++){


            JLabel lable = new JLabel(enry[x][0]);
            JLabel lable1 = new JLabel(enry[x][1]);
            stDetails.add(lable);
            stDetails.add(lable1);

        }

        stDetails.setVisible(true);
    }
    public MyFrame(){
        this.setSize(400,150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,2));
        name = new JLabel("name");
        nameField = new JTextField();
        gender = new JLabel("gender");
        genderField = new JTextField();
        submit = new JButton("submit");
        view = new JButton("students details");
        submit.addActionListener(this);
        view.addActionListener(this);





        this.add(name);
        this.add(nameField);
        this.add(gender);
        this.add(genderField);
        this.add(view);
        this.add(submit);




        this.setVisible(true);

    }




}