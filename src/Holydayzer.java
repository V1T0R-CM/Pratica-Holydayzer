import java.util.ArrayList;

public class Holydayzer {
    ArrayList<Feriado> listaFeriados = new ArrayList<Feriado>();

    public Holydayzer(){
        listaFeriados.add(new Feriado("01/01/2023", "Confraternização mundial"));
        listaFeriados.add(new Feriado("21/02/2023", "Carnaval"));
        listaFeriados.add(new Feriado("17/04/2023", "Páscoa"));
        listaFeriados.add(new Feriado("21/04/2023", "Tiradentes"));
        listaFeriados.add(new Feriado("01/05/2023", "Dia do trabalho"));
        listaFeriados.add(new Feriado("08/06/2023", "Corpus Christi"));
        listaFeriados.add(new Feriado("07/09/2023", "Independência do Brasil"));
        listaFeriados.add(new Feriado("12/10/2023", "Nossa Senhora Aparecida"));
        listaFeriados.add(new Feriado("02/11/2023", "Finados"));
        listaFeriados.add(new Feriado("15/11/2023", "Proclamação da República"));
        listaFeriados.add(new Feriado("25/12/2023", "Natal"));
    }

    public void checkFeriados(String data){
        for(int i=0; i<this.listaFeriados.size(); i++){
            if(data.equals(this.listaFeriados.get(i).getData())){
                System.out.println( this.listaFeriados.get(i).getNome());
                return;
            }
        }
        System.out.println("A data selecionada não corresponde a nenhum feriado!");
    }

    public void getFeriados(){
        for(int i=0; i<this.listaFeriados.size(); i++){
            System.out.println(this.listaFeriados.get(i).getData() + " => "+ this.listaFeriados.get(i).getNome());
        }
    }
}
