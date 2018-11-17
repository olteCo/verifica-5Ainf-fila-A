
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(400,700);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb=new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>SSH First Aid </h1>");
		sb.append("<div style='display:table'>");
		//Prima riga Alians HostName
		sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("Alians");
		sb.append("HostName");
		sb.append("</div>");
		sb.append("</div>");
		
		//Prima riga 

		sb.append("<div style='display:table-row'>");
		sb.append("<div style='display:table-cell'>");
		sb.append("	Raspberry");
		sb.append("server.marconi.it");
		sb.append("</div>");
		sb.append("</div>");
		
		//Seconda riga 

		sb.append("<div style='display:table-row'>");
		sb.append("<div style='display:table-cell'>");
		sb.append("CoreSwitch");
		sb.append("10.0.100.1");
		sb.append("</div>");
		sb.append("</div>");
		
		//chiusura div table
		sb.append("</div>");
		sb.append("</html>");
		
		
		String lbl=sb.toString();
		super.add(new JLabel(lbl));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

