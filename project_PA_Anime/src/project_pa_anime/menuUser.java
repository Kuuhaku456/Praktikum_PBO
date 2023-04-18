package Main;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class menuUser{
	menuUser(){
		JFrame formUser = new JFrame("menu user");
		formUser.setSize(600,700);
		formUser.setLocation(150,150);
		formUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formUser.setLocationRelativeTo(null);
		formUser.setLayout(null);

		JButton anime = new JButton("Anime");
		anime.setMargin( new Insets(5, 5, 5, 5) );
        anime.setBounds(0,0,70,25);
        anime.setFont(new Font("Dialog", Font.PLAIN, 10));
        //add button to the frame
        formUser.add(anime);
        anime.setVisible(false);

        JLabel labelAnime = new JLabel("Anime");
        // labelAnime.setMargin( new Insets(5, 5, 5, 5) );
        labelAnime.setBounds(0,0,70,25);
        labelAnime.setHorizontalAlignment(JLabel.CENTER);
        labelAnime.setFont(new Font("Dialog", Font.PLAIN, 10));
        //add button to the frame
        formUser.add(labelAnime);
        labelAnime.setVisible(true);
    	
    	formUser.setVisible(true);

    	JPanel g = new panelAnime();
    	formUser.add(g);
    	g.setVisible(true);

        anime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	g.setVisible(true);
                anime.setVisible(false);
                labelAnime.setVisible(true);
            }

        });

	}
}