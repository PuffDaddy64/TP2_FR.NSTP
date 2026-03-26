public class Pays {

    private String nomPays;
    private String codePays ;
    private String CODE_PAYS_DEFAULT = "INC";

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
        assert codePays == null : "veuiller entrer un code de pays non-null";
        assert !validCodePays(codePays) : "Le code de pays n'est pas valide, Pattern acepter 'ABC' et non 'abc' ";

        this.codePays= codePays;
    }

    private boolean validCodePays(String codePays){
        if(codePays.length() == 3){

            if(codePays.equals(codePays.toUpperCase()))
                return true;
            else
                return false;
        }
        else
            return false;
    }


}
