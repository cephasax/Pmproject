package controler;

import dao.PolicialDao;
import model.Policial;

public class Service {

		 public void cadastrarPolicial(Policial pm){
			 PolicialDao pmDao = new PolicialDao();
			 pmDao.inserir(pm);
		 }
	
}
