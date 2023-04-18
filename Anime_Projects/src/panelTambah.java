package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import javax.swing.JTextArea.setLineWrap;

class panelTambah extends JPanel{
	panelTambah(){
		setBounds(0,25,600,675);
		setBackground(Color.red);
		setLayout(null);

		JLabel label1 = new JLabel("Judul Anime");
		label1.setBounds(10,0,180,25);
		label1.setForeground(Color.white);
		add(label1);
		label1.setVisible(true);

		JTextField tfJudul = new JTextField(20){
	      @Override 
	      protected void paintComponent(Graphics g) {
	        if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
	          Graphics2D g2 = (Graphics2D) g.create();
	          g2.setPaint(getBackground());
	          g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
	              0, 0, getWidth() - 1, getHeight() - 1));
	          g2.dispose();
	        }
	        super.paintComponent(g);
	      }
	      
	      @Override
	    public void updateUI() {
	        super.updateUI();
	        setOpaque(false);
	        setBorder(new RoundedCornerBorder());
	      }
	    };
		tfJudul.setBounds(5,30,570,25);
		add(tfJudul);
		tfJudul.setVisible(true);

		JLabel labelEpisode = new JLabel("episode");
		labelEpisode.setBounds(10,65,180,25);
		labelEpisode.setForeground(Color.white);
		add(labelEpisode);
		labelEpisode.setVisible(true);

		JTextField tfEpisode = new JTextField(20){
	      @Override 
	      protected void paintComponent(Graphics g) {
	        if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
	          Graphics2D g2 = (Graphics2D) g.create();
	          g2.setPaint(getBackground());
	          g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
	              0, 0, getWidth() - 1, getHeight() - 1));
	          g2.dispose();
	        }
	        super.paintComponent(g);
	      }
	      
	      @Override
	    public void updateUI() {
	        super.updateUI();
	        setOpaque(false);
	        setBorder(new RoundedCornerBorder());
	      }
	    };
		tfEpisode.setBounds(5,95,570,25);
		add(tfEpisode);
		tfEpisode.setVisible(true);

		JLabel labelRating = new JLabel("Rating Anime");
		labelRating.setBounds(10,130,180,25);// 10
		labelRating.setForeground(Color.white);
		add(labelRating);
		labelRating.setVisible(true);

		JTextField tfRating = new JTextField(20){
	      @Override 
	      protected void paintComponent(Graphics g) {
	        if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
	          Graphics2D g2 = (Graphics2D) g.create();
	          g2.setPaint(getBackground());
	          g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
	              0, 0, getWidth() - 1, getHeight() - 1));
	          g2.dispose();
	        }
	        super.paintComponent(g);
	      }
	      
	      @Override
	    public void updateUI() {
	        super.updateUI();
	        setOpaque(false);
	        setBorder(new RoundedCornerBorder());
	      }
	    };
		tfRating.setBounds(5,160,570,25);// 10
		add(tfRating);
		tfRating.setVisible(true);

		JLabel labelStudio = new JLabel("Studio Anime");
		labelStudio.setBounds(10,195,180,25); // 15
		labelStudio.setForeground(Color.white);
		add(labelStudio);
		labelStudio.setVisible(true);

		JTextField tfStudio = new JTextField(20){
	      @Override 
	      protected void paintComponent(Graphics g) {
	        if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
	          Graphics2D g2 = (Graphics2D) g.create();
	          g2.setPaint(getBackground());
	          g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
	              0, 0, getWidth() - 1, getHeight() - 1));
	          g2.dispose();
	        }
	        super.paintComponent(g);
	      }
	      
	      @Override
	    public void updateUI() {
	        super.updateUI();
	        setOpaque(false);
	        setBorder(new RoundedCornerBorder());
	      }
	    };
		tfStudio.setBounds(5,225,570,25); //15
		add(tfStudio);
		tfStudio.setVisible(true);

		JLabel labelSipnosis =new JLabel("Sipnosis");
		labelSipnosis.setBounds(10,260,180,25); //20
		labelSipnosis.setForeground(Color.white);
		add(labelSipnosis);
		labelSipnosis.setVisible(true);

		JTextArea tfSipnosis = new JTextArea();
		tfSipnosis.setLineWrap(true);
		tfSipnosis.setBounds(5,290,570,300); //20
		add(tfSipnosis);
		tfSipnosis.setVisible(true);

		JButton btTambah= new JButton("Tambah");
        btTambah.setMargin( new Insets(5, 5, 5, 5) );
        btTambah.setBounds(270,595,60,20);
        btTambah.setFont(new Font("Dialog", Font.PLAIN, 11 ));
        //add button to the frame
        add(btTambah);
        btTambah.setVisible(true);

	}
}