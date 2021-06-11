package po.app;

import java.util.ArrayList;

public class EpassStudent  {
    private int ano;
    private String escola;
    private ArrayList<Zona> zonas;

    public EpassStudent(int Ano,String escola){
        zonas=new ArrayList<>();
        this.escola=escola;
        ano=Ano;

    }
    public EpassStudent(EpassStudent outro){
        this.escola=outro.escola;
        ano=outro.ano;

    }

    public boolean addZona(String nome){
        boolean status=false;
        for(Zona z:zonas){
            if (z.getNome().equalsIgnoreCase(nome)){
                status=true;
                break;
            }
        }
        if(!status){
            Zona nZona=new Zona(nome);
            zonas.add(nZona);
        }
        return status;
    }

    public void setAno(int ano) {
        this.ano=ano;


    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getAno() {
        return ano;
    }

    public String getEscola() {
        return escola;
    }

    //public Zona[] getZonas() {
        //return zonas;
    //}
}
