package oopexercicio1;

public class ControleCarro {
    
    private int marcha;
    private boolean embreagem;
    private float velocidade;
    
    public ControleCarro() {
        
        this.marcha = 0;
        this.embreagem = false;
        this.velocidade = 0;
    
    }
    
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void setEmbreagem(boolean embreagem) {
        this.embreagem = embreagem;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
    public int getMarcha() {
        return marcha;
    }

    public boolean isEmbreagem() {
        return embreagem;
    }

    public float getVelocidade() {
        return velocidade;
    }
    
    public void embrear() {
        this.setEmbreagem(!this.isEmbreagem());
    }
    
    public void aumentarMarcha() {
        if(!this.isEmbreagem()) {
            System.out.println("Você não embreou o carro.");
            return;
        }
        
        if(this.getMarcha() > 5) {
            System.out.println("Marcha máxima já alcançada.");
            return;
        }
        
        this.setMarcha(this.marcha += 1);
        System.out.println("Marcha atual: " + this.getMarcha());
    }
    
    public void diminuirMarcha() {
        if(!this.isEmbreagem()) {
            System.out.println("Você não embreou o carro.");
            return;
        }
        
        if(this.getMarcha() < 0) {
            System.out.println("Marcha mínima já alcançada.");
            return;
        }
        
        this.setMarcha(this.marcha -= 1);
        System.out.println("Marcha atual: " + this.getMarcha());
    }

    public void acelerar(float vel) {
        float newVel = this.velocidade += vel;
        
        this.setVelocidade(newVel);
    }
    
    public void desacelerar(float vel) {
        float newVel = this.velocidade -= vel;
        
        if(newVel < 0) {
            System.out.println("Sua velocidade não pode baixar de 0.");
        }
        
        this.setVelocidade(newVel);
    }
}
