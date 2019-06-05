
package matrices.suma.y.resta;


public class MatricesSumaYResta {

   
    public static void main(String args[]){
      
        int matriz1[][]= new int [3][3];
        int matriz2[][]=new int[3][3];
        int matrizResultado[][] = new int[3][3];
        
        //Carga de las matrices
        
        for(int i = 0; i< matriz1.length;i++){
            for(int j = 0; j< matriz1.length;j++){
                matriz1[i][j]= (int)(Math.random()*5);
            
            }
        }
        
        for(int i = 0; i< matriz2.length;i++){
            for(int j = 0; j< matriz2.length;j++){
                matriz2[i][j]= (int)(Math.random()*5);
            
            }
        }
    
        // Suma o resta de matrices
        
        for(int i= 0; i< matriz1.length;i++){
            for(int j = 0;j<matriz2.length;j++){
                matrizResultado[i][j]= matriz1[i][j]+matriz2[i][j];
            }
        
        }
        // imprimiendo las matrices
        
        for(int i = 0; i < matriz1.length;i++){
            for(int j = 0; i< matriz1.length; j++){
                System.out.print("["+ matriz1[i][j]+"}");
                    
          
            }
            System.out.println("");
        
        for(int j = 0; j < matriz2.length; j++){
            System.out.print("["+ matriz1[i][j]+"]");
            }
            System.out.println("");
        
        
        for(int j = 0; j < matriz2.length; j++){
            System.out.print("["+ matriz1[i][j]+"]");
            }
            System.out.println("");
        
            }
    }

}