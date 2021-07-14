import javax.swing.JOptionPane ;

public class Main
{
    public static void main(String[] args)
		{
	    Main Id = new Main();
			 Id.ID();
}
		public void ID ()  {
		
			String nome = JOptionPane.showInputDialog ( "digite seu nome" ) ;
			int idade = Integer.parseInt( JOptionPane.showInputDialog( "digite seu ano de nascimento" ) ) ;
			int anoatual =  Integer.parseInt( JOptionPane.showInputDialog( "digite seu ano atual" ) ) ;
			int calcularidadeatual = anoatual - idade ;
		 nome = nome + " sua idade é " + calcularidadeatual ; 
		 JOptionPane.showMessageDialog (null, nome) ;
			}
	

}
