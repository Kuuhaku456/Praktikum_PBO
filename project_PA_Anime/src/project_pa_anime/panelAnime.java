package Main;

import javax.swing.*;
import java.awt.*;

public class panelAnime extends	JPanel{
	panelAnime(){
		setBounds(0,25,600,675);
		setBackground(new Color(161, 161, 143));
		setLayout(null);

		int banyak =10;
		JPanel[] panel = new JPanel[banyak];
		JLabel[] judulAnime = new JLabel[banyak];
		JLabel[] rating = new JLabel[banyak];
		JLabel[] episode = new JLabel[banyak];
		JLabel[] genre = new JLabel[banyak];

		JLabel[] navigasi = new JLabel[]{
			new JLabel("<<"),
			new JLabel("<"),
			new JLabel(">"),
			new JLabel(">>")
		};

		for(int i =0;i<banyak;i++){
			panel[i] = new JPanel();
			judulAnime[i] = new JLabel("Judul Anime");
			rating[i] = new JLabel("rating : ");
			episode[i]= new JLabel("episode : ");
			genre[i] = new JLabel("genre : ");
		}

		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		for (int i =0;i<banyak;i++){

			panel[i].setBounds(0,(i*60),600,50);
			panel[i].setBackground(Color.blue);
			panel[i].setCursor(cursor);

			judulAnime[i].setBounds(25,8,500,20);
			judulAnime[i].setOpaque(true);
			judulAnime[i].setBackground(Color.green);
			judulAnime[i].setForeground(Color.white);
			judulAnime[i].setVisible(true);
			
			rating[i].setBounds(70,30,180,20);
			rating[i].setForeground(Color.white);
			rating[i].setVisible(true);

			episode[i].setBounds(220,30,180,20);
			episode[i].setForeground(Color.white);
			episode[i].setVisible(true);

			genre[i].setBounds(390,30,180,20);
			genre[i].setForeground(Color.white);
			genre[i].setVisible(true);


			panel[i].add(judulAnime[i]);
			panel[i].add(rating[i]);
			panel[i].add(episode[i]);
			panel[i].add(genre[i]);
			panel[i].setLayout(null);
			add(panel[i]);
		}
		for(int i =0;i<4;i++){
			navigasi[i].setBounds(((150*i)+60),600,20,20);
			navigasi[i].setForeground(Color.black);
			navigasi[i].setCursor(cursor);
			navigasi[i].setVisible(true);
			add(navigasi[i]);
		}
	}
}