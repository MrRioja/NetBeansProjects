package model.bean;

public class Profissao {
    
    private String profissao;
    
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    @Override
    public String toString(){
        return getProfissao();
    }

}
