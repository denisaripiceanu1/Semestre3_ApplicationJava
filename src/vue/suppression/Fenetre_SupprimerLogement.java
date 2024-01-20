package vue.suppression;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controleur.suppression.GestionSuppressionLogement;

public class Fenetre_SupprimerLogement extends JInternalFrame {
	GestionSuppressionLogement gestionSuppressionLogement;

	public Fenetre_SupprimerLogement() {

		this.gestionSuppressionLogement = new GestionSuppressionLogement(this);

		// Paramètres de la fenêtre
		this.setBounds(100, 100, 445, 210);
		this.getContentPane().setLayout(null);

		// Message de confirmation
		JLabel lblNewLabel = new JLabel("Êtes-vous sûr de vouloir supprimer ce logement ?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 23, 371, 70);
		this.getContentPane().add(lblNewLabel);

		// Bouton supprimer
		JButton btn_supprimer = new JButton("Supprimer");
		btn_supprimer.addActionListener(this.gestionSuppressionLogement);
		btn_supprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_supprimer.setBounds(96, 103, 103, 30);
		this.getContentPane().add(btn_supprimer);

		// Bouton annuler
		JButton btn_annuler = new JButton("Annuler");
		btn_annuler.addActionListener(this.gestionSuppressionLogement);
		btn_annuler.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_annuler.setBounds(233, 103, 95, 30);
		this.getContentPane().add(btn_annuler);

	}
}
