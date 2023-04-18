package Main;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import javax.swing.JFileChooser.*;

public class rincianAnime extends JPanel {
	rincianAnime(){
		setBounds(0,25,600,675);
		setBackground(new Color(161, 161, 143));
		setLayout(null);

		// int banyak =10;
		// JPanel[] panel = new JPanel[banyak];
		// JLabel[] judulAnime = new JLabel[banyak];
		// JLabel[] rating = new JLabel[banyak];
		// JLabel[] episode = new JLabel[banyak];
		// JLabel[] genre = new JLabel[banyak];

		JLabel judulAnime = new JLabel("judul anime");
		judulAnime.setBounds(20,5,300,30);
		judulAnime.setVisible(true);


		tampilGambar gambar = new tampilGambar();
		gambar.setBounds(10,35,200,300);
		gambar.atur("C:/Users/Abdullah/Favorites/Downloads/pixelate.jpg",gambar.getWidth(),gambar.getHeight());
		gambar.setVisible(true);

		JLabel labelSipnosis = new JLabel("sipnosis :");
		labelSipnosis.setForeground(Color.green);
		labelSipnosis.setBounds(225,35,180,25);
		labelSipnosis.setVisible(true);

	    // JTextArea sipnosis = new JTextArea("ayyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyghubhjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjkjjsndfjkansfhbasdfagjsbhjsabdabkababababababababababababababababkakbakbakbakbakbakbakbakbabkabkakbakbakbakbakbakbakbakbababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababkjkjkjkjkjkjkjk");
	    JTextArea sipnosis = new JTextArea();
	    sipnosis.setSize(350,1500);
	    // sipnosis.setOpaque(true);
	    sipnosis.setBackground(Color.black);
	    sipnosis.setVisible(true);
	    sipnosis.setForeground(Color.white);
	    sipnosis.setLineWrap(true);
	    sipnosis.setEditable(false);

	    JScrollPane scroll = new JScrollPane (sipnosis);
	    // scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    scroll.setBounds(225,35,350,300);
	    scroll.setVisible(true);
	    scroll.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
// jScrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 10));
	    add(scroll);


	    JLabel labelRating = new JLabel("rating");
	    labelRating.setBounds(30,350,180,25);
	    labelRating.setVisible(true);
	    labelRating.setForeground(Color.green);

	    JLabel labelGenre = new JLabel("genre");
	    labelGenre.setBounds(30,390,180,25);
	    labelGenre.setVisible(true);
	    labelGenre.setForeground(Color.green);

	    JLabel labelEpisode = new JLabel("episode");
	    labelEpisode.setBounds(30,430,180,25);
	    labelEpisode.setVisible(true);
	    labelEpisode.setForeground(Color.green);

	    JLabel labelStudio = new JLabel("studio");
	    labelStudio.setBounds(30,470,180,25);
	    labelStudio.setVisible(true);
	    labelStudio.setForeground(Color.green);

	    add(labelGenre);
	    add(labelEpisode);
	    add(labelStudio);
	    add(labelRating);
		add(judulAnime);
		add(labelSipnosis);
		// add(sipnosis);
		add(gambar);
	}
}