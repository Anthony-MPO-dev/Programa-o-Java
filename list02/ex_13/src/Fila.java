import java.util.Iterator;

public class Fila {

    private Fila prox_no;
    private String dado;
    
    public Fila(){
        this.dado= "";
        this.prox_no = null;
    }

    public Fila(String dado){
        this.dado= dado;
        this.prox_no = null;
    }
    

    public String getValor() {
        return dado;
    }


    public void setValor(String dado) {
        this.dado= dado;
    }

    

    public Fila getProx_no() {
        return prox_no;
    }


    public void setProx_no(Fila prox_no) {
        this.prox_no = prox_no;
    }

    
    public class IteratorFila implements Iterator<Fila>{
        
        @Override
        public boolean hasNext() {
            boolean test = false;
            if(prox_no != null){
                test = true;
            }
            return test;
         }

         @Override
         public Fila next() {
            return prox_no;
         }
    }

    public Fila.IteratorFila iterador(){

        Fila.IteratorFila I = new Fila.IteratorFila();
        return I;

    }

    //funcao que insere novo valor a Fila, inserindo no final da Fila um novo no
    public static Fila adicionar(Fila p, String D){

    Fila novo_no = new Fila(D);

    if(p.getValor() == ""){
        p = novo_no;
        return p;
    }

    else{
        Fila aux = p;
        while (aux.iterador().hasNext()){
            aux = aux.iterador().next();
        }
        aux.setProx_no(novo_no);

        return p;
         

    }

}

    //funcao que remove o primeiro no da estrutura encadeada
    public static Fila remover(Fila p){

        if(p != null){
            p = p.getProx_no();
            return p;
        }

        else{
            System.out.println("Fila Vazia");
            return p;
        }
    }

    //funcao que imprime os valores da estrutura encadeada
    public static void imprimeFila(Fila p){

    System.out.println("Saida <- [ ");

    while (p != null){
        System.out.println("["+p.getValor()+"] ");
        p = p.getProx_no();
    }
    
    System.out.println(" ] <- Entrada\n");

    }

    
}
