public class CarteSilver implements CarteDeCredit {

public String typedecompte(){

	 return "Ce compte est un compte Silver" ;
}
	
	public void accept(Visitor v){
	v.VisitCarteSilver(this) ;
}
}