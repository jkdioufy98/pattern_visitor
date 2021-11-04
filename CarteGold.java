public class CarteGold implements CarteDeCredit {

public String typedecompte(){

	 return "Ce compte est un compte gold" ;
}

public void accept(Visitor v){
	v.VisitCarteGold(this) ;
}

}