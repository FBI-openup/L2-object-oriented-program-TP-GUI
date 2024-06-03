package reactiveApp

import scala.swing._
import java.awt.Color

/**
 * Customized textfield receiving the input text to copy 
 */
class InField extends TextField {

  background = Color.BLACK
  foreground = Color.WHITE
  text = ""
  columns = 80
  border = Swing.LineBorder(Color.GRAY) 
  
}