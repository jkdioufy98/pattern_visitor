public class TestVisitor{
public static void main(String[] args) {

Visitor depot = new DepotVisiteur();
Visitor retrait= new RetraitVisiteur() ;

CarteDeCredit gold= new CarteGold() ;
CarteDeCredit silver= new CarteSilver() ;
CarteDeCredit bronze= new CarteBronze() ;

System.out.println(gold.typedecompte());
gold.accept(depot);
gold.accept(retrait);

System.out.println("");

System.out.println(gold.typedecompte());
silver.accept(depot);
silver.accept(retrait);

System.out.println("");

System.out.println(gold.typedecompte());
bronze.accept(depot);
bronze.accept(retrait);
}}