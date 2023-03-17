package it.epicode.exercises.week7.giorno1.esercizio3;

public class Maggiore extends Ufficiale {
	 
    @Override
    public void check(int stipendio) {
        if ( stipendio > 2000)
        	superiore.check(stipendio);
        else
            System.out.println( "Li guadagna il " +this.getClass().getSimpleName() );
    }
 
}