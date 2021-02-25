import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class darbs4 {
	public static void piza() {
		JOptionPane.showInputDialog("Ievadiet savu vardu: ");
		JOptionPane.showInputDialog("telefons numurs: ");
		JOptionPane.showInputDialog("Adrese nav obligats: ");
	}
	public static void lelums() {
		JOptionPane.showInputDialog("cik centimetri 30-2.50eu,60-5.00eu: ");
	}
	public static void dzer() {
		JOptionPane.showInputDialog("udens - 0.70eu|cola- 1.95 eu|fanta - 1.95 eu|kvass - 1.00eu: ");
	}
	public static void zakus() {
		JOptionPane.showInputDialog(" tomatu sous- 0.70eu|krējuma mērce- 1.95 eu|zemesriekstu mērce - 1.95 eu|adžika ar tomātiem - 1.00eu: ");
	}
	public static void main(String[] args) {
		
		String vibor;
		
		
	do {
		vibor = JOptionPane.showInputDialog(" 1 - Picu izvele | 2 - Piegade |  3 - Sousi  |4 -dzerieni  | x - Apturēt programmu");
		switch(vibor) {
		case("1"):
			lelums();
			int n = JOptionPane.showOptionDialog(new JFrame(), "vid pizza", "Title", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
			        null, new Object[] {"Ananas", "siers","pipironi","ar zāli"}, JOptionPane.YES_OPTION);

			        if (n == JOptionPane.NO_OPTION) {
			            System.out.println("Ananas");
			        } else if (n == JOptionPane.YES_OPTION) {
			            System.out.println("siers");
			        } else if (n == JOptionPane.YES_OPTION) {
			            System.out.println("pipironi");
			        } else if (n == JOptionPane.NO_OPTION) {
			            System.out.println("ar zāli");
			        }
			break;
		case("2"):
			piza();
			break;
		case("3"):
			int m = JOptionPane.showOptionDialog(new JFrame(), "vid SOUS", "Title", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
			        null, new Object[] {"tomatu sous- 0.70eu", "krējuma mērce- 1.95 eu","zemesriekstu mērce - 1.95 eu","adžika ar tomātiem - 1.00eu"}, JOptionPane.YES_OPTION);

			        if (m == JOptionPane.NO_OPTION) {
			            System.out.println("tomatu sous");
			        } else if (m == JOptionPane.YES_OPTION) {
			            System.out.println("krējuma mērce");
			        } else if (m == JOptionPane.NO_OPTION) {
			            System.out.println("zemesriekstu mērce");
			        } else if (m == JOptionPane.YES_OPTION) {
			            System.out.println("adžika ar tomātiem");
			        }
			break;
        case("4"):
        	int b = JOptionPane.showOptionDialog(new JFrame(), "vid SOUS", "Title", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
			        null, new Object[] {"udens - 0.70eu", "cola- 1.95 eu","fanta - 1.95 eu","kvass - 1.00eu"}, JOptionPane.YES_OPTION);
        
			        if (b == JOptionPane.YES_OPTION) {
			            System.out.println("udens");
			        } else if (b == JOptionPane.	NO_OPTION) {
			            System.out.println("cola");
			        } else if (b == JOptionPane.NO_OPTION) {
			            System.out.println("fanta");
			        } else if (b == JOptionPane.YES_OPTION) {
			            System.out.println("kvass");
			        }
        	break;
        case("x"):
        	System.exit(0);
			break;
		}

	}while(vibor!="x");
	
	
}
}