public class Data implements Comparavel {
    private int dia;
    private int mes;
    private int ano;
    public Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    public String getDataFormatada(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    @Override
    public boolean maior(Comparavel obj) {
        Data objAsData = (Data) obj;
        if(this.ano > objAsData.ano){
            return true;
        }else if(this.ano == objAsData.ano && this.mes > objAsData.mes){
            return true;
        }
        else return this.ano == objAsData.ano && this.mes == objAsData.mes && this.dia > objAsData.dia;
    }

    @Override
    public boolean menor(Comparavel obj) {
        Data objAsData = (Data) obj;
        if(this.ano < objAsData.ano){
            return true;
        }else if(this.ano == objAsData.ano && this.mes < objAsData.mes){
            return true;
        }
        else return this.ano == objAsData.ano && this.mes == objAsData.mes && this.dia < objAsData.dia;
    }

    @Override
    public boolean igual(Comparavel obj) {
        Data objAsData = (Data) obj;
        return this.ano == objAsData.ano && this.mes == objAsData.mes && this.dia == objAsData.dia;
    }
}
