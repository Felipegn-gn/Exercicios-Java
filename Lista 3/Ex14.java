class semModificador{
     int num;
     
     public semModificador(){
         
         this.num = 10;
         
     }
    
}


public class Ex14 {
    public static void main(String[] args) {
       
       semModificador obj = new semModificador();
       
        System.out.println("O número é: " + obj.num);
    }
}
