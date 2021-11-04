public class CarteBronze implements CarteDeCredit {


public String typedecompte(){

	 return "Ce compte est un compte bronze" ;
}

public void accept(Visitor v){
	v.VisitCarteBronze(this) ;
}
}