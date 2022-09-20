public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[5];
        miVertebrados[0] = new Vertebrado("Camello", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("Vaca", "Mamifero");
        miVertebrados[2] = new Vertebrado("Tiburón", "Pez"); 
        miVertebrados[3] = new Vertebrado("Paloma", "Ave"); 
        miVertebrados[4] = new Vertebrado("Cocodrilo", "Reptil");
        return miVertebrados;
    }
}
