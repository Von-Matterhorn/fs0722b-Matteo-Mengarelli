package it.epicode.exercises.week7.giorno1.esercizio3;

public class Colonnello extends Ufficiale {
	 
    @Override
    public void check(int stipendio) {
        if ( stipendio > 4000)
        	superiore.check(stipendio);
        else
            System.out.println( "Li guadagna il " +this.getClass().getSimpleName() );
    }
 
}