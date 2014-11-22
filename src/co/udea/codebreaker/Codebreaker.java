package co.udea.codebreaker;

public class Codebreaker {

	String codigo;	

public Codebreaker(String codigo){
	this.codigo = codigo; 
}

 public String analizar(String numero){
	 char c;
	 String resultx = "";
	 String result_ = "";
	 
	 //controlar longitud
	 if(numero.length() != 4 || codigo.length() != 4){
		 return "error";
	 }
	 
	 for(int i = 0; i < numero.length(); i++){
		 c = numero.charAt(i);
		 if(c<'0' && c>'9'){
			 return "error";
		 }
		 if(c == codigo.charAt(i)){
			 resultx = resultx + "X";
			 
		 }
		 else if(codigo.indexOf(c)!=i && codigo.indexOf(c)!=-1){
			 result_ = result_ + "_";
		 }
	 }
	 return resultx+result_;
 }
}
