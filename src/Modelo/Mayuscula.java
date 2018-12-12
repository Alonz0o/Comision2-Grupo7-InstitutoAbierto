package Modelo;

public class Mayuscula {
    
    public String convertir(String name)
    {
        String stg="";
        char letrauno = ' ';
        char c = ' ';
        int aux=0;
      for(int i = 0;i<name.length();i++)
      {
            letrauno = name.charAt(0);
            c = name.charAt(i);
            
            if(letrauno==' ')
            {stg = "Un nombre no puede iniciar con espacio";}
            
            else if(!Character.isLetter(letrauno))
            {stg = "un nombre"+"ss"+letrauno;}
            if (i==0){c=Character.toUpperCase(c);}
            if (i>=1){c=Character.toLowerCase(c);}
            if (c==' '){aux=i+1;}
            if (aux==i){c=Character.toUpperCase(c);}     
            stg += c;
      }
       return stg;     
    }
}
