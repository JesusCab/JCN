#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(){
	
char mat [90]="1816014"; 
char c[4]="jacn";
char w[3]="";		
char cad[90]="";	
char val[1]="";
int size = 0,i=0, corre = 0, n=0,j=0,opc=0;	

printf("\nIntroduzca una cadena(para ser valida valida debera ir 014\n n veces seguido de jacn 2n veces y al ultimo 014 n+2 veces): ");
gets(cad);
fflush(stdin);

size = strlen(mat)-1;
if((mat[size] != mat[size - 1]) && (mat[size] != mat[size-2])){
	w[2]= mat[size]; 
}
if(mat[size-1] != mat[size-2]){
	w[1] = mat[size-1];	
	w[0] = mat[size-2];
}else {
	w[1]=mat[size-1]; 
	if( (mat[size-3] != mat[size]) && (mat[size-3] != mat[size-1])){
		w[0]=mat[size-3];}
	}

do{
	i=0; corre = 0; n=0; j=0; opc=0;

if(cad[i]!=w[0]){
				corre = 1;
				printf("\nError en el caracter:%d\n el correcto seria: %c ",i+1,w[0]);
			}else{
				do{
					if(cad[i]==w[0]){
						if(cad[i+1]==w[1]){
							if(cad[i+2] == w[2]){
								n++;
								i=i+3;
							  }else{
							    corre=1;
						 	   	printf("\nError en el caracter:%d\n el correcto seria: %c",i+3,w[2]);
								break;
							}  
						  }else{
							corre=1;
							printf("\n\nError en el caracter:%d\n el correcto seria: %c",i+2,w[1]);
							break;
				  	 	   }
					  }else{
						corre=1;
						printf("\nError enel caacter:%d\n el correcto seria: %c",i+1,w[0]);
						break;
			 	  	   }	
		}while(cad[i] == w[0]);
			
		int val1= n * 2;
		int val2= n + 2;

		if(corre == 0){
		
			if(cad[i]!=c[0]){
					corre= 1;
					printf("\nError en el caracter:%d\n el correcto seria: %c",i+1,c[0]);
		}else{
			do{
				if(cad[i]==c[0]){
					if(cad[i+1]==c[1]){
						if(cad[i+2] == c[2]){
							if(cad[i+3]==c[3]){		
						   		//n++;
						   		i=i+4;
						   		j++;
							}else{
							  corre=1;
							  printf("\nError en el caracter:%d\n el correcto seria: %c",i+4,c[3]);
							  break;
							}
						}else{
							corre=1;
						 	printf("\nError en el caracter:%d\n el correcto seria: %c",i+3,c[2]);
							break;
						}  
					}else{
						corre=1;
						printf("\nError en el caracter:%d\n el correcto seria: %c",i+2,c[1]);
						break;
					}
				}else{
					corre=1;
					printf("\nError en el caracter:%d\n el correcto seria: %c",i+1,c[0]);
					break;
				}	
				
				
				
			}while(cad[i]==c[0] && (j<=(val1)));
		
		
			if(j!= val1){
				corre=1;
				printf("\nLas repeticiones de la cadena no cumple con 2n");
			}		
			
			j=0;
			
			
			if(corre == 0){
				if(cad[i]!=w[0]){
				corre = 1;
				printf("\nError en el caracter:%d\n el correcto seria: %c",i+1,w[0]);
			}else{
				do{
					if(cad[i]==w[0]){
						if(cad[i+1]==w[1]){
							if(cad[i+2] == w[2]){
								i=i+3;
								j++;
							  }else{
							    corre=1;
						 	   	printf("\nError en el caracter:%d\n el correcto seria: %c",i+3,w[2]);
								break;
							}  
						  }else{
							corre=1;
							printf("\nError en el caracter:%d\n el correcto seria: %c",i+2,w[1]);
							break;
				  	 	   }
					  }else{
						corre=1;
						printf("\nError en el caracter:%d\n el correcto seria: %c",i+1,w[0]);
						break;
			 	  	   }	
				}while(cad[i] == w[0]&&(j<=(val2)));
			
			
				if(j!= val2){
					corre=1;
					printf("\nLas repeticiones de la cadena no cumple con n+2");
				
				}
			
			}
		
		}	

		}			
				
	}
}
		
		if(corre == 0){
			printf("\n\tLa cadena: %s  es valida ",cad);
		}

		if(n<1){
				printf("\nLas repeticiones de la cadena no es valida ya que es menor que 0");
		}
		printf("\n\n\tDesea analizar otra cadena [1]Si [0] No : ");
		scanf("%d",&opc);
		fflush(stdin);
		system("cls");	
		}while(opc == 1);	
system("pause");
return 0;
}
