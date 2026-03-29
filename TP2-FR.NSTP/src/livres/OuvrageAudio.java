package livres;


public class OuvregeAudio{

	public enum Format{
	NUMERIQUE, ANALOGIQUE
	}

	public static FORMAT_DEFAULT = Format.NUMERIQUE;

        int dureMin;
	Format format = FORMAT_DEFAULT;
        
        OuvragePapier(String titre, Auteur auteur, Format type,
                   LocalDate date, int nombreExemplaires, int dureMin){
                super(titre,auteur,date,nombreExemplaires);
                this.dureMin=dureMin;
#		this.format=type;
                }

        @Overide
        public String toString(){
        return "Ouvrage audio de  "+numMin+" minutes et de type "+format+".\n"+super.toString()
        }


}
 
