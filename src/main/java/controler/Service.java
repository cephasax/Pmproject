package controler;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import dao.PolicialDao;
import gui.JIFDetalhesPolicial;
import gui.JIFListarPoliciais;
import model.Policial;

public class Service {

	 private static JIFListarPoliciais jif;
	 
	 public static JIFListarPoliciais getInstanceJifListarPoliciais(){
		 if(jif == null){
			 jif = new JIFListarPoliciais();
		 }
		 return jif;
	 }
		 
	
}
