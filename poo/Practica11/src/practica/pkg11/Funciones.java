/*Jesus Adrian Caballero Nagaya */
package practica.pkg11;

public class Funciones {
    
    public int convStr2Int(String str){
    return Integer.parseInt(str);
    }
    
    public int StrLong(String str){
        int j,aux=0;
        for(j=0;j<str.length();j++){
            aux++;
        }
    return aux;
    }
    
    public String[] containsStr(String[] str){
        String[] lstr = new String[10];
        int j=0;
        for(int i=0;i < 10;i++){
            if(str[i].contains("a")){
                lstr[j]=str[i];
                j = j+1;
            }
        }  
    return lstr;
    }
 
}
