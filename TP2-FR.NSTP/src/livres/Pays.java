package livres;

public class Pays {

    private String nomPays;
    private String codePays ;
    public static final String CODE_PAYS_DEFAULT = "INC";


    public Pays(String nomPays, String codePays) {
        this.nomPays = nomPays;
        setCodePays(codePays);
    }

    public String getCodePays() {
        return codePays;
    }

    public String getNomPays() {
        return nomPays;
    }

    private void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public void setCodePays(String codePays){
     if (codePays == null)
        {System.out.println("veuiller entrer un code de pays non-null");}
        if (!validCodePays(codePays))  {
            System.out.println("Le code de pays n'est pas valide, Pattern acepter 'ABC' et non 'abc' ");
        }
        this.codePays= codePays;
    }


    private boolean validCodePays(String codePays){
        if(codePays.length() == 3){
            for(char i: codePays.toCharArray()){
                if(Character.isDigit(i))
                    return false;}

            if(codePays.equals(codePays.toUpperCase()))
                return true;
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nomPays='" + nomPays + '\'' +
                ", codePays='" + codePays + '\'' +
                '}';
    }
}
