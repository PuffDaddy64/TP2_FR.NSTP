package tests;

import livres.Pays;

public class TestsPays
{
    public static void main(String[] args)
    {
        TestsPays test = new TestsPays();
        test.testPays();
    }

    public void testPays()
    {
        //test pays valide
        Pays paysTest0 = new Pays("Canada", "AFE");
        //Test pays invalide et on valide a la construction
        Pays paysTest1 = new Pays("Kazakhstan", "316");
        System.out.println("ici pas d'erreur");
        paysTest1.setCodePays("CCC");

        System.out.print("Ici j'ai mis une erreur sur le message d'erreur est supposé être :\n Le code de pays n'est pas valide, Pattern acepter 'ABC' et non 'abc'\nVoici le message d'erreur :  ");
        paysTest0.setCodePays("G2A");


    }
}
