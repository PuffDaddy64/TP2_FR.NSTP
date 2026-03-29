package livres;


public class OuvregePapier{

	int nbPages;
	
	OuvragePapier(String titre, Auteur auteur,
                   LocalDate date, int nombreExemplaires, int nbPages){
		super(titre,auteur,date,nombreExemplaires);
		this.nbPages=nbPages;
		}

	@Overide
	public String toString(){
	return "Ouvrage papier de  "+nbPages+" pages.\n"+super.toString()
	}


}


