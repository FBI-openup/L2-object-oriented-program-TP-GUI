package firstGUIapp

import scala.swing._
import java.awt.Color
import javax.swing._
import scala.io.StdIn._

/** basic MainFrame containing a simple text element
  */
class UI extends MainFrame {
  // La classe UI (User Interface) hérite de la classe MainFrame, le composant principal
  // de l'application graphique.
  // Une frame est une fenêtre qui peut contenir des données presque arbitraires
  // et s'afficher à l'écran

  // Ci dessous, on définit les attributs principaux d'une MainFrame.
  // Son titre, sa taille, et son contenu

  // Le titre de la fenêtre principale
  title = "My First GUI Application!"

  // Sa dimension par défaut
  preferredSize = new Dimension(320, 240)

  // Cette frame est ce qu'on appelle un container.
  // Elle peut donc contenir d'autres composants.
  // Ici, ce sera un simple label (du texte)
  val lab = new Label("I'm a label!")
  contents = lab

  // Le contenu de la MainFrame est limité à un **seul** objet.
  // Pour ajouter plus d'un composant dans une MainFrame, on doit d'abord
  // les rassembler dans un **Panel** il existe plusieurs types de Panel
  // GridPanel, BoxPanel, FlowPanel avec des fonctionnalités différentes
  // en terme de placement.

  // val bp=new BoxPanel(Orientation.Vertical)
  // contents= bp
  // bp.contents += new Label("C'est le premier texte")
  // bp.contents += new Label("C'est le deuxième texte")

}
